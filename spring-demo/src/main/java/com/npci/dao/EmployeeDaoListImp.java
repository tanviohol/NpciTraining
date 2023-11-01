package com.npci.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import com.npci.beans.Employee;

public class EmployeeDaoListImp implements EmployeeDao {
	
	private List<Employee> inMemory;
	
	public  EmployeeDaoListImp()
	{
		inMemory=new ArrayList<>();
	}

	@Override
	public Employee save(Employee employee) {
		employee.setId(inMemory.size()+1);
		inMemory.add(employee);
		return employee;
	}

	@Override
	public Employee findbyId(int id) {
		//return inMemory.stream().filter(item->item.getId()==id).findAny().get();
		for(Employee employee : inMemory)
		{
			if(employee.getId()==id)
			{
				return employee;
			}
		}
		return null;
	}
	
	
	

	@Override
	public List<Employee> findAll() {
	
		return inMemory;
	}

	@Override
	public void delete(int id) {
	Iterator<Employee> iterator=inMemory.iterator();
	while(iterator.hasNext())
	{
		Employee emp=iterator.next();
		if(emp.getId()==id)
		{
			iterator.remove();
			break;
		}
	}
	}
//	

}
