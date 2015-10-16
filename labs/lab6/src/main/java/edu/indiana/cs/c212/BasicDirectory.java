package edu.indiana.cs.c212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jacob on 10/1/14. All rights reserved.
 */
public class BasicDirectory implements Directory {

    private List<Person> persons;

    BasicDirectory(){
        persons = new ArrayList<Person>();
    }

    BasicDirectory(List<Person> persons){
        this.persons = persons;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Person> getPeople() {
    	Collections.sort(this.persons);
        return this.persons; 
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> getStudents() {
    	ArrayList<Student> students = new ArrayList<Student>();
    	for(Person p : persons) {
    		if(p instanceof Student) {
    			students.add( (Student)p );
    		}
    	}
    	Collections.sort(students);
    	
        return students; 
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Professor> getProfessors() {
    	ArrayList<Professor> professors = new ArrayList<Professor>();
    	for(Person p : persons) {
    		if(p instanceof Professor) {
    			professors.add( (Professor)p );
    		}
    	}
    	Collections.sort(professors);
    	
        return professors; 
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Professor> getProfsSortedByStartDate() {
    	
        return null; //FIXME
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> getStudentsSortedByGradDate() {
        return null; //FIXME
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void addStudent(Student student) {
        persons.add(student);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void addProfessor(Professor professor) {
        persons.add(professor);
    }
}
