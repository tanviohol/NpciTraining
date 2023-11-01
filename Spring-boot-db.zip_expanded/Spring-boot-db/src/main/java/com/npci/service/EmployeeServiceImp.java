package com.npci.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npci.beans.Employee;

//import com.npci.dao.EmployeeDao;
import com.npci.dao.EmployeeDao;

@Service("service")  // id=service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
	private EmployeeDao dao;
    // in old EmployeeDao we created our own methods but it wont this  time

//	public void setDao(EmployeeDao dao) {
//		this.dao = dao;
//	}

	@Override
	public List<Integer> createEmployees(Employee employee1, Employee... employee) {
		return null;
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		// save() method of jpa repository
		return dao.save(employee);
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		// findById() of jpa  repository
		// import java.util.optional
		Optional<Employee> op=dao.findById(id);
		// 
		return op.orElseThrow(()->new EmployeeNotFoundException("ID :"+id+"Not found"));
	}

	@Override
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		
		
	}

	

	@Override
	public List<Employee> findEmployees() {
		// findAll() from jpa repository
		return dao.findAll();
	}

	
	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

//	@Override
//	@Transactional
//	public List<Integer> createEmployees(Employee employee1, Employee... employees) {
//	    List<Integer> idList=new ArrayList<>();
//		dao.save(employee1);
//		idList.add(employee1.getId());
//	   for(Employee e:employees)
//	   {
//		   dao.save(e);
//			idList.add(e.getId());
//	   }
//		return idList;
//	}
//
//	@Override
//	@Transactional
//	public Employee createEmployee(Employee employee) {
//		
//		return dao.save(employee);
//	}
//
//	@Override
//	public Employee findEmployee(int id) throws EmployeeNotFoundException {
//		Employee employee=dao.findById(id);
//		if(employee==null)
//		{
//			throw new EmployeeNotFoundException("Employee not Found...");
//		}
//		return employee;
//	}
//
//	
//	@Override
//	public List<Employee> findEmployeesByName(String name) {
//		List<Employee> employees=dao.findAll();
//		List<Employee> names= employees.stream()
//		.filter(item->item.getName().equals(name))
//		.collect(Collectors.toList());
//		return names;
//	}
//
//	@Override
//	public List<Employee> findEmployees() {
//		
//		return dao.findAll();
//	}
//	
//	@Override
//	@Transactional
//	public void deleteEmployee(int id) throws EmployeeNotFoundException {
//		
//		Employee employee=dao.findById(id);
//		if(employee==null)
//		{
//			throw new EmployeeNotFoundException("Employee not Found...");
//		}
//		else
//		   dao.delete(id);
//		
//	}


}