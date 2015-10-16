package edu.indiana.cs.c212;

/*
 solve a sudoku puzzle. this is the entry class of 4 classes:
 SudokuSolver, SudokuPuzzle, SudokuPuzzleContainer, and SudokuCell.

 */
class SudokuSolver {

	/**
	 * canSolve is the heart of this assignment.  It requires relatively few
	 * lines of code, but you'll need to understand depth first search, recursion,
	 * and backtracking (as discussed in class), in order to make it work nicely.
	 * 
	 * canSolve takes a SudokuPuzzle as an argument and returns true
	 * if the puzzle can be solved and false otherwise.  An approach
	 * for solving this problem might be as follows:
	 * 
	 *   A possible approach:
	 *      1. check to see if there is an empty cell.
	 *         A. If there isn't an empty cell left in the puzzle, what does that mean? (think base case in recursion)
	 *      2. If there is an empty cell, systematically check to see if you can legally insert a value into that cell.
	 *         A. if you can legally insert a value into that cell, insert the value, then check to see if you can solve the puzzle.
	 *            -- if it turns out that making that insertion didn't get you any closer to solving the puzzle, undo the move.
	 *            -- if it turns out that insertion did lead, somewhere down the road, to a solved puzzle then you're done.
	 *      3. if you check every possible insertion and none of them lead to a solved puzzle, then the
	 *         puzzle is unsolvable.
	 *      
	 *   Hint: Recursion will very much be your friend for this problem.  If you're getting stuck, example code for this
	 *         is included on the course wiki: http://www.cs.indiana.edu/classes/c212/SudokuSolver.java
	 *    
	 * @param puzzle
	 * @return true if the puzzle can be solved and false otherwise
	 */
	public static Boolean canSolve(SudokuPuzzle puzzle) {
		//FIXME
		if(!puzzle.hasEmptyCell())
		{
			return true;
		}
		  //if we're here, the puzzle has at least one empty cell
        SudokuCell cell = puzzle.getEmptyCell();
        for(int digit = 1; digit <= puzzle.getColumnCount(); digit++)
        {
            if(cell.isLegalToInsert(digit, puzzle))
            {
                cell.insert(digit);                //try digit in the cell                
                if(canSolve(puzzle))              //with that choice, can we solve the rest of the puzzle?
                    return true;                 //yes, we can solve the rest of the puzzle
            }                                     
                
           cell.insert(puzzle.getEmptyValue());       //so unmake it
        }
            
        return false;
	}
	

        //if we're here, we've tried all digits in the empty cell
        //but nothing worked, so either the puzzle is unsolvable,
        //or some earlier choice was wrong, so backtrack up the tree
      
        
		
		
		
	

	public static void main(String[] parameters) {
		SudokuPuzzle puzzle;
		puzzle = new SudokuPuzzle();
		//NOTE: to change which puzzle you're using change the line below from
		//its current puzzle (knownSolvablePuzzle4) to any of the puzzles in
		//the SudokuPuzzleContainer class included with this assignment.
		puzzle.setPuzzle(SudokuPuzzleContainer.knownSolvablePuzzle4);
		System.out.println("Here's the puzzle I'm trying to solve:");
		puzzle.show();

		if (canSolve(puzzle) != null && canSolve(puzzle)) {
			System.out.println("And here's a solution:");
			puzzle.show();
		} else {
			System.out.println("This puzzle is unsolvable.");
		}
	}
}