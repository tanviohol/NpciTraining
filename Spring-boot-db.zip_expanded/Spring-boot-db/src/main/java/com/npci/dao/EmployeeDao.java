package com.npci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npci.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee ,Integer> {

	/* Inherites below methods
	 * T save(T t) >>Employee save(Employee t)
	 * Optional<T> findById(Id id) >> Optional <Employee> findById(Integer id)
	 * List <T>findAll()>>List<Employee> findAll()
	 * void deleteById(ID id)>> void deleteById(Integer id)
	 */
	//creating custom Query
	@Query("select e from Employee e where e.name=?1")
	public List<Employee> findByName(String name);
}
