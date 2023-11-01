package com.npci.service;

import java.util.List;

import com.npci.Exception.EmployeeNotFoundException;
import com.npci.beans.Employee;

public interface EmployeeService {
//stores multiple employee objects -remove @Transactional in Dao
	List<Integer> createEmployees(Employee employee1, Employee...employee);
	Employee createEmployee(Employee employee);
	Employee findEmployee(int id) throws EmployeeNotFoundException;
	void deleteEmployee(int id) throws EmployeeNotFoundException;
	List<Employee>findEmployeeByName(String name);
	List<Employee>findEmployees();
}

//implement this intarface by supplying EmployeeDao
