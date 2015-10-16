package edu.indiana.cs.c212;

import java.util.*;

public class Lab3 {

	/**
	 * @param int n
	 * @return ArrayList<Integer>
	 * 
	 * generateArrayList is a method that takes an int, n, and returns an
	 * ArrayList<Integer> that contains the numbers 1 through n in ascending
	 * order.
	 * 
	 * Operations to know for ArrayLists:
	 *   Let list be an ArrayList<Integer> and n be an int:
	 *   	list.add(n) will add n to the end of your list
	 *   	list.get(n) will return the Integer at the nth index of your list
	 *      list.size() will return the size of your list
	 *      
	 * For more information on ArrayLists see:
	 * http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
	 */
	public static ArrayList<Integer> generateArrayList(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//FIXME
		for(int i=1;i <= n; i++)
			list.add(i);
		
		return list;
	}

	/**
	 * @param n
	 * @return int[]
	 * 
	 * generateArray is a method that takes in an int, n, and returns an Array
	 * of length n containing the numbers 1 through n in ascending order
	 * 
	 * Operations to know for arrays:
	 * 	Let arr be an array and x be an integer:
	 *   	  1. arr[i] = x will set the value of arr[i] to x
	 *   	  2. x = arr[i] will set the value of x to arr[i]
	 *   	  3. arr.length will return the size of the array
	 *   
	 * For more information on Arrays see: 
	 * http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html 
	 */
	public static int[] generateArray(int n) {
		int[] arr = new int[n];

		//FIXME
		for(int i = 0; i < n; i++)
			arr[i] = i + 1;

		return arr;
	}

	/**
	 * @param list
	 * 
	 * printArrayList can be used to print the contents of an ArrayList<Integer>
	 * to the console.  You can use this method to help see the contents of your
	 * ArrayList<Integer> as a means of debugging/verification.
	 * 
	 * For more information on Iterators see:
	 * http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
	 */
	public static void printArrayList(ArrayList<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		System.out.print("[");
		while (itr.hasNext()) {
			Integer element = itr.next();
			System.out.print(element);
			if(itr.hasNext()){
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	/**
	 * @param int[] arr
	 * 
	 * printArray can be used to print the contents of an Array to the console.
	 * You can use this method to help see the contents of your arrays as a 
	 * means of debugging/verification.
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < (arr.length - 1)){
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	/**
	 * @param list
	 * @param i
	 * @return
	 * 
	 * isMemberOfArrayList is a method that takes an ArrayList<Integer>, list,
	 * and an int, i, and checks to see if i is anywhere in list, returning true
	 * if i is a member of list, and false otherwise.  
	 * 
	 * You should implement your solution using an Iterator.  
	 * You should NOT use the contains method for ArrayLists to solve this problem!
	 */
	public static Boolean isMemberOfArrayList(ArrayList<Integer> list, int i) {
		Iterator<Integer> itr = list.iterator();
		
		itr.hasNext();
		itr.next();
		
	    while(itr.hasNext()){
	    	int current = itr.next();
	    	if(i == current){
	    		return true;
	    	}		
	    }
	    return false;
	    		
	}

	/**
	 * @param arr
	 * @param i
	 * @return
	 * 
	 * isMemberOfArray is a method that takes an int[] arr, and an int, n,
	 * and checks to see if n is anywhere in the array, returning true
	 * if n is a member of the array, and false otherwise. 
	 */
	public static Boolean isMemberOfArray(int[] arr, int i) {
		
		//FIXME
		int n = arr.length;
		
		for(int x = 0; x < n; x++) {
			if(arr[x] == i) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param n
	 * @return
	 * 
	 * makeMultTable takes in an integer, n, and returns an n by n multiplication
	 * table as an int[][].  Your multiplication table should start with products of
	 * 1 as the first row and column, and not products of 0. 
	 * 
	 * Just as Arrays are represented with int[], you can represent 2-Dimensional
	 * Arrays in Java with with int[][].  A 2-Dimensional Array in Java can be thought
	 * of like a grid, in which int[i][j] returns the int stored at row i, column j of
	 * the grid, much as int[i] returns the int stored at position i in an Array.
     	 *
	 * Operations to know for arrays:
	 * 	Let grid be an int[][] and x, y, and z be ints:
	 *   	  1. grid[x][y] = z will set the value of grid[x][y] to z
	 *   	  2. z = grid[x][y] will set the value of z to grid[x][y]
	 *        3. grid.length returns the length of the rows of grid.
	 */
	public static int[][] makeMultTable(int n) {
		int[][] table = new int[n][n];
		
		for(int row=0; row < n; row++)
			for(int column=0; column < n; column++)
				table[row][column] = ((row + 1) * (column + 1));

		return table;
	}

	/**
	 * @param grid
	 * @param rowNumber
	 * @param number
	 * @return
	 * 
	 * isMemberOfGridRow takes an int[][], a rowNumber, and the number whose
	 * existence you wish to determine in the given row. It should return true
	 * if the number is anywhere in that row of the grid, and false otherwise.
	 */
	public static Boolean isMemberOfGridRow(int[][] grid, int rowNumber, int number) {

		return isMemberOfArray(grid[rowNumber], number);
		
	}
	
	public static void main(String[] args){
		// place code like the following here to do your own tests:
		// printArrayList(generateArrayList(5));
		// printArray(generateArray(5));
		
		int[] testarr1 = generateArray(12);
		System.out.println(isMemberOfArray(testarr1, 13));
		System.out.println(isMemberOfArray(testarr1, 7));
		
		ArrayList<Integer> testarr2 = generateArrayList(12);
		System.out.println(isMemberOfArrayList(testarr2, 13));
		System.out.println(isMemberOfArrayList(testarr2, 7));
	
		printArrayList(generateArrayList(10));
		printArray(generateArray(12));
	}
}
