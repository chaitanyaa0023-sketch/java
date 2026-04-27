package com.cg.eis.service;
import packagecom.cg.eis.bean.Employee;
import packagecom.cg.eis.service.EmployeeService;

public class EmployeeServiceImplementation implements EmployeeService {
	

	
	    @Override
	    public void getEmployeeDetails(Employee emp) {
	    }

	    @Override
	    public void findInsuranceScheme(Employee emp) {
	        double salary = emp.getSalary();
	        String designation = emp.getDesignation();

	        if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
	            emp.setInsuranceScheme("Premium");
	        } else if (salary > 30000 && designation.equalsIgnoreCase("Programmer")) {
	            emp.setInsuranceScheme("Gold");
	        } else if (salary > 20000 && designation.equalsIgnoreCase("System Associate")) {
	            emp.setInsuranceScheme("Silver");
	        } else {
	            emp.setInsuranceScheme("No Scheme");
	        }
	    }

	    @Override
	    public void displayEmployee(Employee emp) {
	        System.out.println(emp);
	    }
	}




