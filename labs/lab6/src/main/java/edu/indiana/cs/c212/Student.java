package edu.indiana.cs.c212;

import org.joda.time.DateTime;

/**
 * As a note for implementation. You should use Collections API for
 * sorting. For comparing grad dates use GradDateComparator.
 *
 */
public class Student extends Person {

    private DateTime graduationDate;

    /**
     * A constructor that takes Strings firstName and lastName
     * and initializes their respective fields.
     *
     * @param firstName The Person's first name
     * @param lastName  The Person's last name
     */
    public Student(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    /**
     * Write a constructor that takes one string of the form
     * "FirstName LastName" and initializes this class' fields appropriately.
     * This is to say that all strings passed in will be non-null and be of the form
     * in which the first name is followed by the lastname and they are separated by one
     * or more whitespace character(s)
     *
     *
     * @param name The name of the Student
     */
    public Student(String name) {
        //FIXME
    	this.setName(name);
    }


    public DateTime getGraduationDate() {
        return this.graduationDate;
    }

    public void setGraduationDate(DateTime graduationDate) {
        this.graduationDate = graduationDate;
    }

}
