package edu.indiana.cs.c212;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StudentTest {
    Student student = new Student("Marty", "McFly");
    Class studentClass = Student.class;
    DateTime gradDate = new DateTime(1985, 7, 3, 0, 0);

    @Test(timeout = 1000)
    public void firstLastConstructorTest(){
        assertEquals("Marty McFly", student.getName());
    }

    @Test(timeout = 1000)
    public void fullNameConstructorTest(){
        Student student = new Student("Marty       McFly");
        Student student2 = new Student("Marty  McFly");
        assertEquals("Marty McFly", student.getName());
        assertEquals("Marty McFly", student2.getName());

    }

    @Test(timeout = 1000)
    public void setGradTest() throws NoSuchFieldException, IllegalAccessException {
        student.setGraduationDate(gradDate);
        Field gradField = studentClass.getDeclaredField("graduationDate");
        gradField.setAccessible(true);
        assertEquals(gradDate, gradField.get(student));
        gradField.setAccessible(false);
    }

    @Test(timeout = 1000)
    public void getGradTest() throws NoSuchFieldException, IllegalAccessException {
        Field gradField = studentClass.getDeclaredField("graduationDate");
        gradField.setAccessible(true);
        gradField.set(student, gradDate);
        assertEquals(gradDate, student.getGraduationDate());
    }
}
