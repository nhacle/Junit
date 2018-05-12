package Junit_WritingTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	
	//test to check appraisal
	@Test
	public void testCaculateAppraisal() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.caculateAppraisal(employee);
		assertEquals(5100, appraisal, 0.0);
	}
	
	//test to check yearly salary
	@Test
	public void testCaculateYearlySalary() {
		employee.setName("Rajeev");
	    employee.setAge(25);
	    employee.setMonthlySalary(8000);
	    
	    double salary = empBusinessLogic.caculateYearlySalary(employee);
	    assertEquals(97000, salary, 0.0);
	}
}
