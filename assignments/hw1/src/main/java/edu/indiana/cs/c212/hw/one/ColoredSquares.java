package edu.indiana.cs.c212.hw.one;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ColoredSquares extends JPanel {
	
	/****************************************************************************
	 * Class member variables
	 ****************************************************************************/

	private Random randomNumberGenerator = new Random();


	/** Constructor to set the size of window */
	public ColoredSquares() {
		Dimension dimension = new Dimension(300, 300);
		this.setPreferredSize(dimension);
   }

	/****************************************************************************
	 * Class Methods
	 ****************************************************************************/

	/** painting method on the JPanel */
	@Override
	public void paintComponent(Graphics g) {
		this.setBackground(BACKGROUND_COLOR);

		// find number of rows and columns by 300/30


		Graphics2D tablet2D = (Graphics2D) g;
		// call drawBlock method to draw squares of required size on JPanel
		
		/* Add just two missing lines (two `for-loops', one inside the other) to this paint() method. (Number the
		 * rows and columns counting from zero.) And to do that, all you really need to know is that you can access 
		 * the variables 'numberOfRows' and 'numberOfColumns' from inside the paint() method. 
		*/
		
		//	drawBlock(tablet2D, row, column);
	}

	private void drawBlock(Graphics2D tablet, int row, int column) {
		int xOrigin, yOrigin, width, height;
		Rectangle rectangle;
	}

	private Color randomColor() {
		// This method will create random color and return it to drawBlock() method.
		// Use randomColorValue() method to generate random color value
		// return new Color(<redColorValue>, <greenColorValue>, <blueColorValue>);
        return null;
	}

	// this method generates random integer number between 0 (inclusive) and the specified value (exclusive)
	private int randomColorValue() {
		return randomNumberGenerator.nextInt(COLOR_RANGE);
	}

	// The entry main() method 
	public static void main(String[] args) {
		JFrame frame = new JFrame("Colored Squares");
		
		ColoredSquares colorsquares = new ColoredSquares();
		
		frame.setContentPane(colorsquares);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // "this" JFrame will be resized to pack all of its components
		frame.setResizable(true); // Sets whether this frame is resizable by the user.
		frame.setVisible(true); // show it
	}

	/****************************************************************************
	 * Class constants
	 ****************************************************************************/

	public static final int INNER_SQUARE_SIZE = 25; // pixels
	public static final int OUTLINE_THICKNESS = 1; // pixels
	public static final int BACKGROUND_THICKNESS = 3; // pixels
	public static final int OUTER_SQUARE_SIZE = INNER_SQUARE_SIZE
			+ OUTLINE_THICKNESS * 2;
	public static final int BLOCK_SIZE = OUTER_SQUARE_SIZE
			+ BACKGROUND_THICKNESS;

	public static final Color BACKGROUND_COLOR = Color.CYAN;
	public static final Color OUTLINE_COLOR = Color.BLACK;

	public static final int COLOR_RANGE = 256;

}
