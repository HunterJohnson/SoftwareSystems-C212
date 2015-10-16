package edu.indiana.cs.c212.gameMechanics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.board.SimpleGameBoard;
import edu.indiana.cs.c212.board.Tile;
import edu.indiana.cs.c212.exceptions.InvalidMoveException;
import edu.indiana.cs.c212.players.Player;

public class StandardRules implements Rules {
    
    protected Board board;
    public Player red;
    public Player blue;
    public Queue<Player> playerlist;
    
    
    public StandardRules(Board board, Player red, Player blue) {
        // TODO
        this.board = board;
        this.red = red;
        this.blue = blue;
        this.playerlist  = new LinkedList<Player>();
        playerlist.add(red);
        playerlist.add(blue);
    }
    
    public Board getBoard(){
    	return new SimpleGameBoard((SimpleGameBoard) board);
    }
    
    static boolean areTilesConnected(Board board, Tile start, Tile goal, PlayerColor color) {
        ArrayList<Tile> checked = new ArrayList<Tile>();
        Queue<Tile> connected = new LinkedList<Tile>();
        
        connected.add(start);
        checked.add(start);

        while(!connected.isEmpty()){
            Set<Tile> neighbors = board.getNeighbors(connected.poll());
            //System.out.println(connected.peek().toString());
            for(Tile a : neighbors){
                if(!checked.contains(a)){
                    if(a.getColor() == color){
                        if(a == goal){
                            return true;
                        }
                        else
                            connected.add(a);
                    }
                }
                checked.add(a);
            }
        }
        return false;
    }
        



    
    @Override
    public Queue<Player> getPlayers() {
        // TODO Auto-generated method stub
        return playerlist;
    }

    @Override
    public PlayerColor checkForWins() {
        // TODO Auto-generated method stub
        if(areTilesConnected(board, board.getTileAt(-1,0), board.getTileAt(board.getSize(),0), board.getTileAt(-1,0).getColor())) {
            return board.getTileAt(-1,0).getColor();
        }
        if(areTilesConnected(board, board.getTileAt(0,-1), board.getTileAt(0,board.getSize()), board.getTileAt(0,-1).getColor())){
            return board.getTileAt(0,-1).getColor();
        }
        else
            return null;                

    }

    @Override
    public boolean isLegalMove(Move m) {
        // TODO Auto-generated method stub
        if(m.getX() < 0 || m.getX() > board.getSize() || m.getY() < 0 || m.getY() > board.getSize()){
            return false;
        }
        if(!board.getTileAt(m.getX(), m.getY()).getColor().equals(PlayerColor.BLANK)){
            return false;
        }
        else
            return true;

    }

    @Override
    public Player nextTurn() {
        // TODO Auto-generated method stub
        Queue<Player> playalist = this.playerlist;
        //playalist.poll();
        playalist.add(playalist.poll()); //this...
        this.playerlist = playalist; // and this were added after the fact and should be removed if errors are encountered
        return playalist.peek();
    }
    
    @Override
    public Player getNextPlayer() {
        // TODO Auto-generated method stub
        Queue<Player> playalist = this.playerlist;
        playalist.poll();
        return playalist.peek();
    }

    @Override
    public void makeMove(Move m) throws InvalidMoveException {
        // TODO Auto-generated method stub
        if(isLegalMove(m)){
            
            if(this.playerlist.peek().equals(red)){
                board.makeMove(m, PlayerColor.RED);
            }
            if(this.playerlist.peek().equals(blue)){
                board.makeMove(m, PlayerColor.BLUE);
            }
        
        }
        else throw new InvalidMoveException("e", m, 0);
    }

    @Override
    public ArrayList<Move> getLegalMoves(Player player) {
        // TODO Auto-generated method stub
        ArrayList<Move> legalMoves = new ArrayList<Move>();
        for(int x=0; x < board.getSize(); x++)
            for(int y=0; y < board.getSize(); y++)
                if(this.board.getTileAt(x,y).getColor() == PlayerColor.BLANK)
                    legalMoves.add(new Move(x,y));
        return legalMoves;
        }
    
    

}