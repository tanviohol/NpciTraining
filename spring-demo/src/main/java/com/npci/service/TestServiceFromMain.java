package com.npci.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;

public class TestServiceFromMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-orm-beans.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("dao");
		// save two/three employee objects
		System.out.println("SAVING OBJ..........");
		employeeDao.save(new Employee(0, "A", 53000));
		employeeDao.save(new Employee(0, "B", 54000));
		employeeDao.save(new Employee(0, "C", 55000));

		System.out.println("finding an obj by id........");
		Employee employee = employeeDao.findbyId(2);
		if (employee != null) {
		System.out.println("Id="+employee.getId()+"Name=" +employee.getName()+"Salary="+employee.getSalary());
		
		}
		System.out.println("_________Finding all the entities___________");
		List<Employee> employees= employeeDao.findAll();
		employees.forEach(item->System.out.println("id="+item.getId()));
	}

}
