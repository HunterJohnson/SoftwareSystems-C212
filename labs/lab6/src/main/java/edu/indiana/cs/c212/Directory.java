package edu.indiana.cs.c212;

import java.util.List;

/**
 * Created by jacob on 10/1/14. All rights reserved. All rights reserved.
 */
public interface Directory {


    /**
     * Returns a list of all People in the directory in alphabetical order.
     * Sorted by last name first.
     * @return Alphabetically sorted list all of Persons in the directory
     */
    public List<Person> getPeople();

    /**
     * Returns a list of all the Students in the directory in alphabetical order.
     * Sorted by last name first.
     * @return Alphabetically sorted list of all Students in the directory
     */
    public List<Student> getStudents();

    /**
     * Returns a list of all the Professors in the directory in alphabetical order.
     * Sorted by last name first.
     * @return Alphabetically sorted list of all Professors in the directory
     */
    public List<Professor> getProfessors();

    /**
     * Returns a list of all the Professors sorted in order of their start date.
     * The list should be sorted such that professors with older start dates are
     * listed before those with more recent start dates.
     * @return Sorted list of Professors, arranged by start date
     */
    public List<Professor> getProfsSortedByStartDate();


    /**
     * Returns a list of all the Students sorted in order of their graduation date.
     * The list should be sorted such that professors with older grad dates are
     * listed before those with more recent grad dates.
     * @return Sorted list of Students, arranged by grad date
     */
    public List<Student> getStudentsSortedByGradDate();

    /**
     * Add a student to the directory
     * @param student Student to be added
     */
    public void addStudent(Student student);

    /**
     * Add the specified professor to the directory
     * @param professor
     */
    public void addProfessor(Professor professor);

}
