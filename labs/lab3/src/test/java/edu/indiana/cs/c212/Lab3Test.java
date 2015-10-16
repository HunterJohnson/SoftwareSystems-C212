package edu.indiana.cs.c212;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;


public class Lab3Test {

	ArrayList<Integer> list;
	int[] arr;
	ArrayList<Integer> testList1;
	int[] testArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	int[][] testGrid1 = new int[20][20];
	
	@Before
	public void setUp() throws Exception {
		testList1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
		String arrayString = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
		String[] stringArray = arrayString.split(" ");
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				int x = Integer.parseInt(stringArray[20*i+j]);
				testGrid1[i][j] = x;
			}
		}
	}

	@Test(timeout=1000)
	public void testGenerateArrayList1() {
		list = Lab3.generateArrayList(20);
		assertEquals(20, list.size());
	}
	
	@Test(timeout=1000)
	public void testGenerateArrayList2() {
		list = Lab3.generateArrayList(20);
		assertEquals(1, (int) list.get(0));
	}
	
	@Test(timeout=1000)
	public void testGenerateArrayList3() {
		list = Lab3.generateArrayList(20);
		assertEquals(20, (int) list.get(19));
	}
	
	@Test(timeout=1000)
	public void testGenerateArrayList4() {
		Random r = new Random();
		int rand = r.nextInt(100);
		list = Lab3.generateArrayList(rand);
		int index = r.nextInt(rand);
		assertEquals(index + 1, (int) list.get(index));	
	}
	
	@Test(timeout=1000)
	public void testGenerateArrayList5() {
		Random r = new Random();
		int rand = r.nextInt(100);
		list = Lab3.generateArrayList(rand);
		int index = r.nextInt(rand);
		assertEquals(index + 1, (int) list.get(index));	
	}

	@Test(timeout=1000)
	public void testGenerateArray1() {
		arr = Lab3.generateArray(20);	
		assertEquals(20, arr.length);
	}
	
	@Test(timeout=1000)
	public void testGenerateArray2() {
		arr = Lab3.generateArray(20);	
		assertEquals(1, arr[0]);
	}
	
	@Test(timeout=1000)
	public void testGenerateArray3() {
		arr = Lab3.generateArray(20);	
		assertEquals(20, arr[19]);
	}
	
	@Test(timeout=1000)
	public void testGenerateArray4() {
		Random r = new Random();
		int rand = r.nextInt(100);
		arr = Lab3.generateArray(rand);
		int index = r.nextInt(rand);
		assertEquals(index + 1, (int) arr[index]);	
	}
	
	@Test(timeout=1000)
	public void testGenerateArray5() {
		Random r = new Random();
		int rand = r.nextInt(100);
		arr = Lab3.generateArray(rand);
		int index = r.nextInt(rand);
		assertEquals(index + 1, (int) arr[index]);	
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArrayList1() {
		assertTrue(Lab3.isMemberOfArrayList(testList1, 10));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArrayList2() {
		assertTrue(Lab3.isMemberOfArrayList(testList1, 20));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArrayList3() {
		assertFalse(Lab3.isMemberOfArrayList(testList1, 0));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArrayList4() {
		assertFalse(Lab3.isMemberOfArrayList(testList1, 21));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArray1() {
		assertTrue(Lab3.isMemberOfArray(testArr1, 10));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArray2() {
		assertTrue(Lab3.isMemberOfArray(testArr1, 20));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArray3() {
		assertFalse(Lab3.isMemberOfArray(testArr1, 0));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfArray4() {
		assertFalse(Lab3.isMemberOfArray(testArr1, 21));
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable1() {
		int[][] grid = Lab3.makeMultTable(10);
		assertEquals(35, grid[4][6]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable2() {
		int[][] grid = Lab3.makeMultTable(5);
		assertEquals(25, grid[4][4]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable3() {
		int[][] grid = Lab3.makeMultTable(1);
		assertEquals(1, grid[0][0]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable4() {
		int[][] grid = Lab3.makeMultTable(7);
		assertEquals(6, grid[0][5]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable5() {
		int[][] grid = Lab3.makeMultTable(15);
		assertEquals(36, grid[8][3]);
	}
	
	public void testMakeMultTable6(){
		int[][] grid = Lab3.makeMultTable(15);
		assertEquals(36, grid[3][8]);
	}
	
	public void testMakeMultTable7(){
		int[][] grid = Lab3.makeMultTable(16);
		assertEquals(256, grid[15][15]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable8() {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		int[][] grid = Lab3.makeMultTable(rand);
		int randRow = r.nextInt(rand);
		int randCol = r.nextInt(rand);
		assertEquals(((randRow + 1)*(randCol + 1)), grid[randRow][randCol]);
		System.out.println("testMakeMultTable8 expects table[" + randRow + "][" + randCol + "] to be: " + 
							((randRow + 1) * (randCol + 1)) + " in a grid of size: " + rand + 
							" and got: " + grid[randRow][randCol]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable9() {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		int[][] grid = Lab3.makeMultTable(rand);
		int randRow = r.nextInt(rand);
		int randCol = r.nextInt(rand);
		assertEquals(((randRow + 1)*(randCol + 1)), grid[randRow][randCol]);
		System.out.println("testMakeMultTable9 expects table[" + randRow + "][" + randCol + "] to be: " + 
							((randRow + 1) * (randCol + 1)) + " in a grid of size: " + rand +
							" and got: " + grid[randRow][randCol]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable10() {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		int[][] grid = Lab3.makeMultTable(rand);
		int randRow = r.nextInt(rand);
		int randCol = r.nextInt(rand);
		assertEquals(((randRow + 1)*(randCol + 1)), grid[randRow][randCol]);
		System.out.println("testMakeMultTable10 expects table[" + randRow + "][" + randCol + "] to be: " + 
							((randRow + 1) * (randCol + 1)) + " in a grid of size: " + rand +
							" and got: " + grid[randRow][randCol]);
	}
	
	@Test(timeout=1000)
	public void testMakeMultTable11() {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		int[][] grid = Lab3.makeMultTable(rand);
		int randRow = r.nextInt(rand);
		int randCol = r.nextInt(rand);
		assertEquals(((randRow + 1)*(randCol + 1)), grid[randRow][randCol]);
		System.out.println("testMakeMultTable11 expects table[" + randRow + "][" + randCol + "] to be: " + 
							((randRow + 1) * (randCol + 1)) + " in a grid of size: " + rand + 
							" and got: " + grid[randRow][randCol]);
	}

	@Test(timeout=1000)
	public void testIsMemberOfGridRow1() {
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, 0, 75));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow2() {
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, 18, 74));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow3() {
		assertFalse(Lab3.isMemberOfGridRow(testGrid1, 9, 68));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow4() {
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, 19, 19));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow5() {
		assertFalse(Lab3.isMemberOfGridRow(testGrid1, 5, 101));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow6() {
		assertFalse(Lab3.isMemberOfGridRow(testGrid1, 12, 3));
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow7() {
		Random r = new Random();
		int rand = r.nextInt(100) + 100;
		int randRow = r.nextInt(20);
		int randCol = r.nextInt(20);
		int temp = testGrid1[randRow][randCol];
		testGrid1[randRow][randCol] = rand;
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, randRow, rand));
		testGrid1[randRow][randCol] = temp;
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow8() {
		Random r = new Random();
		int rand = r.nextInt(100) + 100;
		int randRow = r.nextInt(20);
		int randCol = r.nextInt(20);
		int temp = testGrid1[randRow][randCol];
		testGrid1[randRow][randCol] = rand;
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, randRow, rand));
		testGrid1[randRow][randCol] = temp;
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow9() {
		Random r = new Random();
		int rand = r.nextInt(100) + 100;
		int randRow = r.nextInt(20);
		int randCol = r.nextInt(20);
		int temp = testGrid1[randRow][randCol];
		testGrid1[randRow][randCol] = rand;
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, randRow, rand));
		testGrid1[randRow][randCol] = temp;
	}
	
	@Test(timeout=1000)
	public void testIsMemberOfGridRow10() {
		Random r = new Random();
		int rand = r.nextInt(100) + 100;
		int randRow = r.nextInt(20);
		int randCol = r.nextInt(20);
		int temp = testGrid1[randRow][randCol];
		testGrid1[randRow][randCol] = rand;
		assertTrue(Lab3.isMemberOfGridRow(testGrid1, randRow, rand));
		testGrid1[randRow][randCol] = temp;
	}
}
