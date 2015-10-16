/**
 * @author <hhjohnso>
 */
package edu.indiana.cs.c212;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Basic implementation of Gridable interface.
 * Methods for getting rows, columns and tiles for the underlying grid.
 *
 * The Gridable interface defined in Gridable.java specifies a way of interacting with all classes that implement it,
 * including this one. This class give a specific implementation where we actually make everything work. In order to
 * see more details on what each method is supposed to return, check out the comments in Gridable.java
 *
 * In order to implement the getRow and getColumn methods, you will need to encapsulate the given code in 
 * a for loop. You might also want to take a look at the getCols and getRows methods and their associated
 * javadoc comments, in Grid.java.
 * 
 * For the getTiles method, you want to start at row 0 and increment from there. Your homework 1 should
 * help with this.
 * 
 * THIS IS THE ASSIGNMENT. YOUR CODE GOES IN THIS FILE!
 * 
 *
 */
public class Grid extends AbstractGrid {


    //Instance variables

    protected Tile[][] gridArray;

	public Grid(Dimension dim){
		super(dim);
		gridArray = super.tiles;
	}
	/**
	 * {@inheritDoc}
	 */
    @Override
	public Tile[] getRow(int rowNumber) {
		//FIXME
    	
    	int r = gridArray.length;
    	Tile[] rowArray = new Tile[r];
    	
        for(int i=0; i < r; i++)
        	rowArray[i] = gridArray[rowNumber][i];
    	 	  
    	//return array

        return rowArray; //Replace this with the correct return value
	}
	/**
	 * {@inheritDoc}
	 */
    @Override
	public Tile[] getColumn(int colNumber) {
	    //gridArray[row][colNumber];

    	int c = gridArray[0].length;    
    	Tile[] colArray = new Tile[c];
    	
    	for(int i = 0; i < c; i++)
    		colArray[i] = gridArray[i][colNumber];

        return colArray; 		//FIXME
    }

	/**
	 * {@inheritDoc}
	 */
    @Override
	public Iterator<Tile> getTiles() {
		
	   List<Tile> tiles = new ArrayList<Tile>();
	  //FIXME Please populate the ArrayList!
	  //Use the tiles ArrayList to store the intermediate data.
	   Iterator<Tile> itr = 
	   while (ir.)
	   
	  //You will be returning an iterator over the ArrayList.
	  //You can add things to an ArrayList by calling tiles.add(value);
	  //For more info check out: http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
	    return tiles.iterator();
	}
	/**
	 * {@inheritDoc}
	 */
    @Override
	public Tile getTile(int row, int col) {
        return gridArray[row][col]; 		//FIXME Replace with actual return value

    }
	/**
	 * {@inheritDoc}
	 */
    @Override
	public int getRows() {
		return dim.height;
	}
	/**
	 * {@inheritDoc}
	 */
    @Override
	public int getCols() {
		return dim.height;
	}


}

