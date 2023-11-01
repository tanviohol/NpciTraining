package com.npci.service;

import java.util.List;

import com.npci.beans.Employee;




public interface EmployeeService {
	// remove @Transactional in DAO layer

	List<Integer> createEmployees(Employee employee1,Employee... employee);
	Employee createEmployee(Employee employee);
	Employee findEmployee(int id)throws EmployeeNotFoundException;
	void deleteEmployee(int id)throws EmployeeNotFoundException;
	
	List<Employee> findEmployees();

	List<Employee> findEmployeesByName(String name);
	Employee findEmployeeById(int id) throws EmployeeNotFoundException;
}
