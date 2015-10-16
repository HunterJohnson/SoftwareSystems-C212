package edu.indiana.cs.c212.view.graphical;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.WindowConstants;



//import edu.indiana.cs.c212.client.ChatClient.TryToConnectToServer;
import edu.indiana.cs.c212.gameMechanics.GameRunner;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;

@SuppressWarnings("serial")
public class GraphicalBoardView extends JFrame implements ActionListener {

    private GameRunner game; 
    private JPanel gamePanel; 
    private BoardSetupPanel setupPanel;
    private PlayerChoicePanel pcp1, pcp2;
    private RulesChoicePanel rcp;
    final JPanel godPanel = new JPanel();
   

    public GraphicalBoardView() {
        this.setSize(1200,300);
        this.setResizable(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final JPanel gamePanel = new JPanel(); 
        
        gamePanel.setMaximumSize(new Dimension(500, 500));
      
        godPanel.setLayout(new BorderLayout());

        final BoardSetupPanel setupPanel = new BoardSetupPanel(); // setupPanel

        gamePanel.add(setupPanel);

        final PlayerChoicePanel pcp1 = new PlayerChoicePanel("Red"); // choicePanels
        final PlayerChoicePanel pcp2 = new PlayerChoicePanel("Blue");

        gamePanel.add(pcp1);
        gamePanel.add(pcp2);
        final RulesChoicePanel rcp = new RulesChoicePanel("Rules");
        gamePanel.add(rcp);

        JButton startButton = new JButton("Start / Stop");

        startButton.addActionListener(this);

        gamePanel.add(startButton);
        godPanel.add(gamePanel, BorderLayout.PAGE_START);
        this.setupPanel = setupPanel;
        this.pcp1 = pcp1;
        this.pcp2 = pcp2;
        this.rcp = rcp;
        this.gamePanel = gamePanel;
        godPanel.setVisible(true);
        this.add(godPanel);
        

        /*
        IMPORTANT!!!
        vVvVvVvVvVvVv

        godPanel.pack() T: this is NOT tested. However, https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html 
        might explain why I chose to use it as they frequently use pack() at the ends of their code 
        NAMELY to be used with setMaximumSize (a part of the Componenet method) on 
        the smallest things being added to a given Jframe
        */

        //godPanel.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (game != null) {
            game.stopGame();
            godPanel.removeAll();
            this.setVisible(false);
        }
        
        else{
        	
        
        GameRunner game = new GameRunner(setupPanel.getBoardSize(), pcp1.getPlayerType(), pcp2.getPlayerType(), rcp.getRulesType()); //n
        this.game = game;
        this.setSize(2000, 600);
        BoardPanel bp = new BoardPanel(game.getBoard());
        
        bp.setVisible(true);
        this.godPanel.add(bp);
        bp.setLocation(this.getWidth() / 2, 300);  // center
        
        TurnViewer redTurn = new TurnViewer(PlayerColor.RED, game); // TurnViewers
        TurnViewer blueTurn = new TurnViewer(PlayerColor.BLUE, game);
        JPanel redView = new JPanel();
        JPanel blueView = new JPanel();

        redView.add(redTurn);
        blueView.add(blueTurn);
        gamePanel.add(redView);
        gamePanel.add(blueView);
        
        Thread thread = new Thread(game);
        thread.start();
        }
    }

    public static Runnable setup() {
        return new Runnable() {
            public void run() {
                GraphicalBoardView board = new GraphicalBoardView();
                board.setVisible(true);
            }
        };
    }

    public static void runIt() {
        Thread gameThread = new Thread(setup());
        gameThread.start();
    }

     protected static void createAndShowGUI() {
            //Create and set up the window.
            JFrame frame = new JFrame("SpinnerDemo");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //Add content to the window.
           // frame.add();

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        }

}
