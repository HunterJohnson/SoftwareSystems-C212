package edu.indiana.cs.c212;

import org.joda.time.DateTime;

/**
 * As a note for implementation. You should use Collections API for
 * sorting. For comparing start dates use StartDateComparator.
 *
 */
public class Professor extends Person {
    private DateTime startDate;

    /**
     * A constructor that takes Strings firstName and lastName
     * and initializes their respective fields.
     *
     * @param firstName The Person's first name
     * @param lastName  The Person's last name
     */
    public Professor(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    /**
     * Write a constructor that takes one string of the form
     * "FirstName LastName" and initializes this class' fields appropriately.
     * This is to say that all strings passed in will be non-null and be of the form
     * in which the first name is followed by the lastname and they are separated by one
     * or more whitespace character(s)
     * @param name The name of the Professor
     */
     public Professor(String name){
    	 this.setName(name);
     }

    public DateTime getStartDate() {
        return this.startDate;
    }

    public void setStartDate(DateTime startDate) {
        //FIXME
    	this.startDate = startDate;
    }

}
