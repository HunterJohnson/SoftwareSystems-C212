package edu.indiana.cs.c212.view.graphical;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import edu.indiana.cs.c212.gameMechanics.GameRunner;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;

public class TurnViewer extends JPanel implements Observer {
        
	private static final long serialVersionUID = 1L;
    private PlayerColor pColor;
    private GameRunner game;
    private JLabel turnLabel;
        
        public TurnViewer(PlayerColor player, GameRunner game){        
                    this.game = game;
                    this.pColor = player;
                    turnLabel = new JLabel(player + " turn status");
                    this.add(turnLabel);
                    game.addObserver(this);
                 
        }

        @Override
        public void update(Observable o, Object arg) {
            repaint();
        }
        
        public void paintComponent(Graphics g){
                     Graphics2D turnG = (Graphics2D) g; 
                     Rectangle rect = new Rectangle (15, 15, 70, 70);
                        
                  if(game.getCurrentPlayer().getColor().equals(pColor)){
                                turnG.setColor(Color.BLACK);
                                    turnG.fill(rect);                                
                  }
                  else{
                                turnG.setColor(Color.WHITE);
                                    turnG.fill(rect);
                                   
                  }
                  
                
                
                }
                
        }
