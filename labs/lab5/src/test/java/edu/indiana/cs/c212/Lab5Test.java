package edu.indiana.cs.c212;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class Lab5Test {
	Lab5 lab5 = new Lab5();
	private static final double DELTA = 0.5;

	
	@Before
	public void setUp() throws Exception {
		lab5.addEmployee(new Employee("ABC", 100.22, 2013));
		lab5.addEmployee(new Employee("PQR", 330.5, 2010));
		lab5.addEmployee(new Employee("LMN", 334.7, 2010));
	}

	@Test(timeout=1000)
	public void testAddEmployee() {
		assertEquals(3, lab5.empList.size());
	}
	
	@Test(timeout=1000)
	public void testRemoveEmployee() {
		lab5.removeEmployee("ABC");
		assertEquals(2, lab5.empList.size());
	}
	
	@Test(timeout=1000)
	public void testFindEmployee1() {
		Employee emp = lab5.findEmployee("ABC");
		assertEquals("ABC", emp.getEmpName());
	}
	
	@Test(timeout=1000)
	public void testFindEmployee2() {
		Employee emp = lab5.findEmployee("PQR");
		assertEquals("PQR", emp.getEmpName());
	}
	
	@Test(timeout=1000)
	public void testFindEmployee3() {
		Employee emp = lab5.findEmployee("LMN");
		assertEquals("LMN", emp.getEmpName());
	}
	
	@Test(timeout=1000)
	public void testMaximumSalary() {
		Employee emp = lab5.getMaxSalaryEmp();
		assertEquals("LMN", emp.getEmpName());
	}
	
	@Test(timeout=1000)
	public void testRaiseSalary() {
		lab5.raiseSalary(10);
		Employee emp = lab5.findEmployee("ABC");
		assertEquals(110.242, emp.getSalary(), DELTA);
	}
	
	@Test(timeout=1000)
	public void testRaiseSalary1() {
		lab5.raiseSalary(10);
		Employee emp = lab5.findEmployee("PQR");
		assertEquals(363.55, emp.getSalary(), DELTA);
	}
	
	@Test(timeout=1000)
	public void testRaiseSalary2() {
		lab5.raiseSalary(10);
		Employee emp = lab5.findEmployee("LMN");
		assertEquals(368.17, emp.getSalary(), DELTA);
	}


}
