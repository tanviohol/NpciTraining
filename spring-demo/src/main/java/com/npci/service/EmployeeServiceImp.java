package com.npci.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.Exception.EmployeeNotFoundException;
import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;

@Service("service")
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeDao empdao; // setter method to suppluy obj

	@Override
	@Transactional
	public List<Integer> createEmployees(Employee employee1, Employee... employee) {
		List<Integer> idList = new ArrayList<>();
		Employee e = empdao.save(employee1);
		idList.add(e.getId());
		for (Employee emp : employee) {
			Employee e2 = empdao.save(emp);
			idList.add(e2.getId());

		}
		return idList;

	}

	@Override
	public Employee createEmployee(Employee employee) {

		return empdao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		List<Employee> employees = findEmployees();
		List<Employee> names = employees.stream().filter(item -> item.getName().equals(names))
				.collect(Collectors.toList());
		return names;
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		Employee employee=empdao.findbyId(id);
		if(employee!=null)
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
		else
			empdao.delete(id);
		

	}

	@Override
	public List<Employee> findEmployeeByName(String name) {

		return null;
	}

	@Override
	public List<Employee> findEmployees() {

		return empdao.findAll();
	}

}
