package edu.indiana.cs.c212.board;

import java.util.Observer;
import java.util.Set;

import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;
 
/** Pictured below is a hexagonal implementation of board. A board is simply 
 * a contract that an object can adhere to. Any such object that adheres to it
 * implements getSize(), getTileAt(), getNeighbors(), makeMove(), and addObserver().
 * 
 * A hexagonal representation of such a board (the one we will be using in the project)
 * would look like the figure below. A board could be circular, or square, or any
 * sort of shape defined by one dimension. <br>
 * <pre>
 *            RED GOAL (y=-1)
 *  	  ____ 
 *  	 /    \ 
 *  	/      \____ 
 *  	\(0,0) /    \ 
 *  	 \____/      \____ 
 *  	 /    \(1,0) /    \ 
 *  	/      \____/      \____ 
 * B	\(0,1) /    \(2,0) /    \ 
 * L	 \____/      \____/      \ 
 * U	 /    \(1,1) /    \(3,0) / 
 * E	/      \____/      \____/ 
 *  	\(0,2) /    \(2,1) /    \ 	B
 * G	 \____/      \____/      \ 	L
 * O	 /    \(1,2) /    \(3,1) / 	U
 * A	/      \____/      \____/ 	E
 * L	\(0,3) /    \(2,2) /    \ 	 
 *(x=-1)	 \____/      \____/      \ 	G
 *  	      \(1,3) /    \(3,2) / 	O
 *  	       \____/      \____/ 	A
 *  	            \(2,3) /    \ 	L
 *  	             \____/      \ (x=size)
 *  	                  \(3,3) / 
 *  	                   \____/ 
 *             RED GOAL (y=size)
 *             </pre>
 */
public interface Board {

	/**
	 * Returns the number of tiles along one side of the board. All boards
	 * should be square.
	 * 
	 * @return The size of the board.
	 */
	public int getSize();

	/**
	 * This method returns a the tile at the specified coordinates
	 * 
	 * @param x
	 *            the x portion of the coordinate
	 * @param y
	 *            the y portion of the coordinate
	 * @return the Tile at (x,y)
	 */
	public Tile getTileAt(int x, int y);

	/**
	 * This method returns all connected tiles, regardless of color.
	 * 
	 * @param t
	 *            the source to get neighbors from
	 * @return a Set of neighbor tiles
	 */
	public Set<Tile> getNeighbors(Tile t);

	/**
	 * Takes in a playerColor and a move and makes a move for that player if
	 * legal.
	 * 
	 * @param m
	 *            The move to made if legal.
	 * @param player
	 *            The player for whom the move is being made.
	 */
	public void makeMove(Move m, PlayerColor player);

	/**
	 * This method exists in the Observable class. By making any implementor of
	 * this interface also extend Observable, we can pass around and add
	 * observers to anything that implements Board.
	 * 
	 * As long as you extend Observable in AbstractGameBoard, you will inherit this
	 * method automatically.
	 * 
	 * Any implementation of board will be responsible of notifying observers, as 
	 * per the Observer pattern.
	 * 
	 * http://en.wikipedia.org/wiki/Observer_pattern	 
	 * 
	 */

	public void addObserver(Observer observer);
}
