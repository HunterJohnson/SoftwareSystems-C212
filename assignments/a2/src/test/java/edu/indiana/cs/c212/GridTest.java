package edu.indiana.cs.c212;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.awt.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GridTest {

    Grid grid = new Grid(new Dimension(10, 10));

    @Test(timeout = 1000)
    public void getTileTest() {
        assertEquals(grid.gridArray[0][0], grid.getTile(0,0));
        assertEquals(grid.gridArray[9][0], grid.getTile(9,0));
        assertEquals(grid.gridArray[0][9], grid.getTile(0,9));
        assertEquals(grid.gridArray[9][9], grid.getTile(9,9));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class, timeout = 1000)
    public void rowUpperBoundTest(){
        grid.getTile(10, 2);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class, timeout = 1000)
    public void colUpperBoundTest(){
        grid.getTile(2, 10);
    }

    @Test(timeout = 1000)
    public void getColTest(){
        assertArrayEquals(grid.gridArray[5], grid.getColumn(5));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class, timeout = 1000)
    public void getColBoundTest(){
        grid.getColumn(10);
    }
}
