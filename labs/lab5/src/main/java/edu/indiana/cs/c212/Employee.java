package edu.indiana.cs.c212;

/**
 * This is a simple class that models an employee. Each employee has a name,
 * salary and year of joining the company.
 */

public class Employee 
{
	
	// FIXME add instance variables here
	private String empName;
	private double salary;
	private int joinYear;
	
    /**
     * This constructor should create an Employee with a name, salary, and the year they joined the company. 
     */
	public Employee(String empName, double salary, int joinYear)
	{
		// FIXME 
		this.empName = empName;
		this.salary = salary;
		this.joinYear = joinYear;
	}

    /**
     * Returns the name of the employee. 
     * @return The name of the employee
     */
	public String getEmpName() 
	{
		//FIXME 
		return empName;
	}

	/**
     * Changes the employee's name to the specified name.
     * @param name The new name for the employee
     */
	public void setEmpName(String empName) 
	{
		//FIXME
		this.empName = empName;
	  
	}

	/**
     * Returns the salary of the employee. 
     * @return The salary of the employee
     */
	public Double getSalary() 
	{
		//FIXME
		return salary;
	}

	/**
     * Changes the employee's salary to given salary.
     * @param salary The new salary for the employee
     */
	public void setSalary(double salary) 
	{
		//FIXME
		this.salary = salary;
		
	}

   /**
     * Returns the join year of the employee. 
     * @return The join year of the employee
     */
	public Integer getJoinYear() 
	{
		//FIXME
		return joinYear;
	}

	/**
     * Changes the employee's year of joining to given specified year.
     * @param name The new year of joining for the employee
     */
	public void setJoinYear(int joinYear) 
	{
		//FIXME
		this.joinYear = joinYear;
	}
}
