package edu.indiana.cs.c212.gameMechanics;

import java.util.Observable;
import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.board.SimpleGameBoard;
import edu.indiana.cs.c212.exceptions.InvalidMoveException;
import edu.indiana.cs.c212.players.BasicTrailsPlayer;
import edu.indiana.cs.c212.players.MiddleProximityPlayer;
import edu.indiana.cs.c212.players.Player;
import edu.indiana.cs.c212.players.PointAndClickPlayer;
import edu.indiana.cs.c212.players.SimpleRandom;
import edu.indiana.cs.c212.view.graphical.GraphicalBoardView;
import java.util.ArrayList;

public class GameRunner extends Observable implements Runnable{
        
protected Player redPlayer, bluePlayer;
protected Rules rules;
protected static ArrayList<String> ruleSets;
protected int boardSize;
protected Board board;
private boolean running;
private Player currentPlayer;



    public GameRunner(int boardSize, String red, String blue, String ruleSet) {
    	System.out.println("gameRunner");
     this.board = new SimpleGameBoard(boardSize);
     this.boardSize = boardSize;
     this.redPlayer = createPlayer(red, PlayerColor.RED);
     this.bluePlayer = createPlayer(blue, PlayerColor.BLUE);
     this.rules = createRules(ruleSet,this.board, this.redPlayer, this.bluePlayer);
     this.currentPlayer = this.rules.getPlayers().peek();
     this.running = true;
    }
    
    protected static Player createPlayer(String playerType, PlayerColor color) {
        if(playerType.equals("Computer")){
            return new SimpleRandom(color);
        }
        if(playerType.equals("Player")){
            return new PointAndClickPlayer(color); //n
        }
        if(playerType.equals("Middle Proximity Player")){
        	return new MiddleProximityPlayer(color);
        }
        if(playerType.equals("AI")){
        	return new BasicTrailsPlayer(color);
        }
        else {
            return null;
        }
    }
    
    protected static Rules createRules(String ruleSet, Board board, Player red, Player blue){
    	if(ruleSet.equals("Standard Rules")) {// StandardRules
            return new StandardRules(board, red, blue);
        }
        if(ruleSet.equals("Overwrite Rules")) { // OverwriteRules
            return new OverwriteRules(board, red, blue);
        }  
        if(ruleSet.equals("Lose By Connecting Rules")) {// LoseByConnectingRules
            return new LoseByConnectingRules(board, red, blue);
        }
        else {
            return null;
        }
    }
    
   public Board getBoard(){
       return board;
   }
    
    public Player getCurrentPlayer(){
        return this.currentPlayer;
    }

    
    public static ArrayList<String> getPlayersList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Computer");
        list.add("Player");
        list.add("Middle Proximity Player");
        list.add("AI");
        return list;
    }
    
    public static ArrayList<String> getRuleSets(){
      ruleSets = new ArrayList<String>();
      ruleSets.add("Standard Rules");
      ruleSets.add("Overwrite Rules");
      ruleSets.add("Lose By Connecting Rules");
      return ruleSets;
    }
    
    public static void main(String[] args) {
        GraphicalBoardView.runIt();    
        
    }
    
    public int getSize() {
        return this.boardSize;
    }
    
    public void run(){
    
     // run game
     while(running){
     //ask getCurrentPlayer for legal move
         Move m = getCurrentPlayer().getMove(board, rules.getLegalMoves(getCurrentPlayer()));
         boolean legal = rules.isLegalMove(m);
     // if illegal -> end game
         if(!legal){
             stopGame();
             System.out.println("Illegal Move: " + rules.getNextPlayer().getColor().toString() + " player wins!");
             break;
     }
     // else valid -> update board
         else {
                 try {
                    rules.makeMove(m);
                } catch (InvalidMoveException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                 setChanged();
                 notifyObservers();
     //notifyObservers(board);
    
     // check for win -> advance turn
                 PlayerColor winner = rules.checkForWins();
                 if(winner == null){
                     currentPlayer = rules.nextTurn();
                 }
                 else{
     // game won -> print winner
                     stopGame();
                     System.out.println(winner.toString() + " player wins!");
                 }    
         }
         setChanged();
         notifyObservers();
     }
    }
    
    
    public void stopGame(){
     this.running = false;
    }

 
}
