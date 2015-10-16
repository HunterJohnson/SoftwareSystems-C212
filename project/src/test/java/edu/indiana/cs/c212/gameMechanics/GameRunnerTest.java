package edu.indiana.cs.c212.gameMechanics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.indiana.cs.c212.board.SimpleGameBoard;
import edu.indiana.cs.c212.players.SimpleRandom;

public class GameRunnerTest {

    GameRunner runner;
    SimpleGameBoard board;
    SimpleRandom random;
    SimpleRandom random2;
    StandardRules rules;

    @Before
    public void setup(){
        runner = new GameRunner(4, "edu.indiana.cs.c212.players.SimpleRandom", "edu.indiana.cs.c212.players.SimpleRandom", "edu.indiana.cs.c212.gameMechanics.StandardRules");
    }

    @Test
    public void testGameRunner() {
        assertNotNull(runner);
    }

    @Test
    public void testGetBoard() {

        assertNotNull(runner.getBoard());
        assertEquals(4, runner.getBoard().getSize());
    }

}
