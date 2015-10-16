package edu.indiana.cs.c212;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Tile extends JPanel {


	public Tile(
			int size) {
		setSize(new Dimension(size, size));
		setOpaque(true);
		setColor(DEFAULT_COLOR);
	}

	public Tile(){

		new Tile(DEFAULT_SIZE);
	}

	public Color getColor(){
		return getBackground();
	}

	public void setColor(Color color) {
		
		setBackground(color);
	}

	public static final Color DEFAULT_COLOR = Color.RED;
	public static final int DEFAULT_SIZE = 30;
	

}
