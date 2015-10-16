package edu.indiana.cs.c212;


public abstract class Person implements Comparable<Person> {
	
	//FIXME
	/**
	 *
	 * A person is a class that has a String firstName, and a String lastName
	 */
	private String firstName;
	private String lastName;

    Person(){

    }

    /**
     * A constructor that takes Strings firstName and lastName
     * and initializes their respective fields.
     * @param firstName The Person's first name
     * @param lastName The Person's last name
     */
    public Person(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    /**
     * Write a constructor that takes one string of the form
     * "FirstName LastName" and initializes this class' fields appropriately.
     * This is to say that all strings passed in will be non-null and be of the form
     * in which the first name is followed by the lastname and they are separated by one
     * or more whitespace character(s)
     * @param name The name of the Person
     */
    public Person(String name){
    	this.setName(name);
	
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return Returns the first name followed by the last name separated by a single space.
     */
    public String getName(){
        return String.format("%s %s", firstName, lastName);
    }

    /**
     * This will set both the first and last name of the person.
     * @param name The full name of the person given in the form of "Firsname Lastname"
     *             There might be arbitrary whitespace inbetween the names.
     */
    public void setName(String name){
    	int spaceIndex = name.indexOf(" ");
    	this.setFirstName(name.substring(0,spaceIndex));
    	this.setLastName(name.substring(spaceIndex+1, name.length()).trim());
    	
    }


    /**
     * Compares one person to another. If this person's name, comparing last name first,
     * comes before the other person's name, it returns a negative number. If they are the same,
     * it returns 0, else a positive number.
     * -1, 0, 1 are good numbers to use.
     * @param other The other person whose name  we are comparing to.
     * @return  A number indicating a comparison between the names of this person and the other person.
     */
    //@Override
    public int compareTo(Person other) {
    	String otherLastName = other.getLastName();
    	String ourLastName = this.getLastName();
    	return ourLastName.compareTo(otherLastName);    // instance method
    	//return String.compare(ourLastName, otherLastName); -- static method
    	
     
    }
}
