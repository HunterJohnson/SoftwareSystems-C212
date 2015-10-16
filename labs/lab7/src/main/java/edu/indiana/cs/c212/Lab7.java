package edu.indiana.cs.c212;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lab7 extends JPanel implements ActionListener{	
	
	private static final int BOX_SIZE = 10;
	private String option = "Random";
	
	/**
	 * This method creates the Frame and the 3 buttons for Color swapping.
	 * It should allow you to see what is needed in order to add components to panels.
	 * They should refer to this link for extra guidance:
	 * http://docs.oracle.com/javase/tutorial/uiswing/index.html
	 */
	public JPanel makeButtons(){				
		JPanel panel = new JPanel();		
		JButton colorSwapBlue = new JButton("Red/Green Gradient");
		colorSwapBlue.setBackground(new Color(255,255,0));
		colorSwapBlue.setEnabled(true);
			
		//FIXME
		/*add a JButton called colorSwapRed with text "Green/Blue Gradient"
		  then set its background to the appropriate color (should have no red)
		  and enable it
		*/
		JButton colorSwapRed = new JButton("Green/Blue Gradient");
		colorSwapRed.setBackground(new Color(0,255,255));
		colorSwapRed.setEnabled(true);

		
		//FIXME
		/*create a JButton called colorSwapGreen with text "Random"
		  and enable it
		*/
		JButton colorSwapGreen = new JButton("Random");
		colorSwapGreen.setBackground(new Color(255,0,255));
		colorSwapGreen.setEnabled(true);
	
		colorSwapBlue.addActionListener(this);
		
		//FIXME
		//uncomment the two lines below once you've created the JButtons above
		  colorSwapRed.addActionListener(this);
		  colorSwapGreen.addActionListener(this);
		
		
		//FIXME
		//Add the three buttons to the panel in the order they were created, then return the panel
		  panel.add(colorSwapBlue);
		  panel.add(colorSwapRed);
		  panel.add(colorSwapGreen);
		return panel;			
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics g){
		int width = this.getWidth();
		int height = this.getHeight();
		int numboxes = Math.min(width/BOX_SIZE, height/BOX_SIZE);
		
		if (option.equals("Red/Green Gradient")){
			paintGradientNoBlue(g,numboxes);
		} else if (option.equals("Green/Blue Gradient")){
			paintGradientNoRed(g,numboxes);
		} else if (option.equals("Random")){
			paintGradientRandom(g,numboxes);
		}		
	}	
	
	/**
	 * 
	 * This method will draw a box of size BOX_SIZE on the screen
	 * This method should be called in a loop somewhere to draw a whole lot of boxes.
	 * @param g the graphics context to draw with
	 * @param i the row number of this box in the grid
	 * @param j the column of this box in the grid
	 * @param color the color to draw the box.
	 */
	
	private void paintBox(Graphics g, int i, int j, Color color){
		/*1. set the color of g to the given color
		  2. call fillRect on g at the appropriate location based on i,j with the appropriate
		     height and width.  It may be helpful to remember your Sudoku assignment to remember how
		     to position the box you'll be coloring as well as to look at the various paintGradient
		     methods that call paintBox.
		  3. Set the color of g to Black using setColor
		  4. draw the rectangle you filled in above by calling drawRect
		     on g (with those same parameters you used in fillRect).
		*/			
		//FIXME
		g.setColor(color);
		g.fillRect(i*BOX_SIZE,j*BOX_SIZE,BOX_SIZE,BOX_SIZE);
		g.setColor(Color.black);
		//g.setColor(new Color(0,0,0));
		g.drawRect(i*BOX_SIZE,j*BOX_SIZE,BOX_SIZE,BOX_SIZE);
		
		
	}
	
	/**
	 * This method will draw numboxes^2 number of boxes in the specified gradient
	 * (In this case a gradient with no blue e.g. red->green)
	 * This will be very similar to your first assignment.
	 * In order to generate the gradient, you should divide the color space (255)
	 * by the number of boxes (numboxes). Then multiply the red by the row and the
	 * green by the column.
	 * @param g the graphics context to draw
	 * @param numboxes the number of boxes per side
	 */
	private void paintGradientNoBlue(Graphics g, int numboxes){	
		for (int i = 0; i < numboxes; i++){
			for (int j = 0; j < numboxes; j++){
				int partRed = (i)*(255/(numboxes)) ;
				int partGreen = (j)*(255/(numboxes));
				int partBlue =  0;
				paintBox(g, i, j, new Color(partRed, partGreen, partBlue));
			}
		}
	} 
	
	/**
	 * This method will draw numboxes^2 number of boxes in the specified gradient
	 * (In this case a gradient with no red eg blue->green)
	 * This will be very similar to your first assignment.
	 * In order to generate the gradient, you should divide the color space (255)
	 * by the number of boxes (numboxes). Then multiply the green by the row and the
	 * red by the column.
	 * @param g the graphics context to draw
	 * @param numboxes the number of boxes per side
	 */
	private void paintGradientNoRed(Graphics g, int numboxes){	
		for (int i = 0; i < numboxes; i++){
			for (int j = 0; j < numboxes; j++){
				int partRed = 0;
				int partGreen = (i)*(255/(numboxes)) ;
				int partBlue =  (j)*(255/(numboxes));			
				paintBox(g, i, j, new Color(partRed, partGreen, partBlue));
			}
		}
	}
	
	/**
	 * This method will draw numboxes^2 number of boxes with a random color each time.
	 * This will be very similar to your first assignment.
	 * In order to generate the colors, you should generate 3 random colors in the range
	 * 0-255 and create a new Color Object with them.
	 * To generate random integers, use the Random Class
	 * @param g the graphics context to draw
	 * @param numboxes the number of boxes per side
	 */
	private void paintGradientRandom(Graphics g, int numboxes){	
		Random random = new Random();
		for (int i = 0; i < numboxes; i++){
			for (int j = 0; j < numboxes; j++){				
				int partRed = random.nextInt(255);
				int partGreen = random.nextInt(255);
				int partBlue =  random.nextInt(255);
				paintBox(g, i, j, new Color(partRed, partGreen, partBlue));
			}
		}
	}
	
	/**
	 * This actionPerformed is supposed to draw a Rectangle Randomly upon Button Press. 
	 * This should result in a large number of multicolored rectangles.
	 * 
	 *  (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {				
		option = arg0.getActionCommand();	
		this.repaint();
	}
	
	//Pay close attention to the operations and their order in the main method.
	//Use this as a reference when working in Swing.
	public static void main(String[] args){
		//Create a JFrame
		JFrame frame = new JFrame();
		//Create an instance of Lab7 (remember that Lab7 is a JPanel!)
		Lab7 l7 = new Lab7();
		//Set what happens when the frame closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set the default size of the frame
		frame.setSize(700, 700);
		//Create components to add to the frame
		JPanel buttonPanel = l7.makeButtons();
		//Add the components to the frame and specify a location for the component in your layout
		frame.add(buttonPanel, BorderLayout.PAGE_START);
		frame.add(l7, BorderLayout.CENTER);
		//Pack the frame
		frame.pack();
		//Set the frame to visible so it shows up
		frame.setVisible(true);			
	}	
}
