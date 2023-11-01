package com.npci.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.npci.beans.Employee;

//DriverManagerDataSource>>LocalSessionFactoryBean>>HibernateTemplate >> EmployeeDaoORMImpl
//spring container must create this dao obj &supply the hybernateTemplate
//
@Repository
public class EmployeeDaoORMImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate template;

	
	@Override
	//import fom org.springframework.transaction.annotation.Transaction
	//@Transactional
	public Employee save(Employee employee) {
		//save method returns serialized id tht is generated
		int id =(int) template.save(employee);//generates insert query
		
		//now using id u will get employee object
		return template.get(Employee.class, id);// generate select query where primaryKeyColumn=id
		
	}

	@Override
	public Employee findbyId(int id) {
		// select *from employee where primaryKey=idValue
		return template.get(Employee.class , id);
	}

	@Override
	public List<Employee> findAll() {
		//loadAll method runs select query and each record is added as an employee in the List<T>
		return template.loadAll(Employee.class);
	}

	@Override
	//@Transactional
	public void delete(int id) {
		// delete(T t)->delete from employee where id=employee.getId()
		Employee employee = findbyId(id);
		if(employee!=null)
		{
			template.delete(employee);
		}
	}
}
