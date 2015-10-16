package edu.indiana.cs.c212;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProfessorTest {

    Professor professor      = new Professor("Emmet", "Brown");
    Class     professorClass = Professor.class;
    DateTime  startDate      = new DateTime(1855, 5, 25, 0, 0);

    @Test(timeout = 1000)
    public void firstLastConstructorTest() {
        assertEquals("Emmet Brown", professor.getName());
    }

    @Test(timeout = 1000)
    public void fullNameConstructorTest() {
        Professor professor = new Professor("Emmet       Brown");
        Professor professor2 = new Professor("Emmet  Brown");
        assertEquals("Emmet Brown", professor.getName());
        assertEquals("Emmet Brown", professor2.getName());

    }

    @Test(timeout = 1000)
    public void setStartDateTest() throws NoSuchFieldException, IllegalAccessException {
        professor.setStartDate(startDate);
        Field gradField = professorClass.getDeclaredField("startDate");
        gradField.setAccessible(true);
        assertEquals(startDate, gradField.get(professor));
        gradField.setAccessible(false);
    }

    @Test(timeout = 1000)
    public void getStartDateTest() throws NoSuchFieldException, IllegalAccessException {
        Field gradField = professorClass.getDeclaredField("startDate");
        gradField.setAccessible(true);
        gradField.set(professor, startDate);
        assertEquals(startDate, professor.getStartDate());
    }
}
