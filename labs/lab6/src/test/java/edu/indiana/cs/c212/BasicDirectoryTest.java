package edu.indiana.cs.c212;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RunWith(JUnit4.class)
public class BasicDirectoryTest {
    Student   brain      = new Student("Brian", "Johnson");
    Student   athlete    = new Student("Andrew", "Clark");
    Student   basketCase = new Student("Allison", "Reynolds");
    Student   princess   = new Student("Claire", "Standish");
    Student   criminal   = new Student("John", "Bender");
    Professor principal  = new Professor("Dick", "Vernon");
    Professor director   = new Professor("John", "Hughes");

    List<Person> sortedArray = Arrays.asList(criminal, athlete, director, brain, basketCase, princess, principal);
    List<Person> unsorted    = new ArrayList<Person>();

    @Before
    public void setup() {
        unsorted.addAll(sortedArray);
        Collections.shuffle(unsorted);

        brain.setGraduationDate(DateTime.parse("1985-06-10"));
        athlete.setGraduationDate(DateTime.parse("1985-06-19"));
        basketCase.setGraduationDate(DateTime.parse("1985-06-14"));
        princess.setGraduationDate(DateTime.parse("1985-06-17"));
        criminal.setGraduationDate(DateTime.parse("1986-06-20"));

        principal.setStartDate(DateTime.parse("1975-06-10"));
        director.setStartDate(DateTime.parse("1984-06-04"));
    }

    Directory directory = new BasicDirectory(unsorted);

    @Test
    public void getPeopleTest() {
        Assert.assertEquals(sortedArray, directory.getPeople());
    }

    @Test
    public void getStudentsGradDateTest(){
        List<Student> students = Arrays.asList(brain, basketCase, princess, athlete, criminal);
        Assert.assertEquals(students, directory.getStudentsSortedByGradDate());
    }

    @Test
    public void getProfessorsStartDateTest(){
        List<Professor> professors = Arrays.asList(principal, director);
        Assert.assertEquals(professors, directory.getProfsSortedByStartDate());
    }

    @Test
    public void getProfessorsTest(){
        List<Professor> professors = Arrays.asList(director, principal);
        Assert.assertEquals(professors, directory.getProfessors());
    }

    @Test
    public void getStudentsTest(){
        List<Student> students = Arrays.asList(criminal, athlete, brain, basketCase, princess);
        Assert.assertEquals(students, directory.getStudents());
    }

}
