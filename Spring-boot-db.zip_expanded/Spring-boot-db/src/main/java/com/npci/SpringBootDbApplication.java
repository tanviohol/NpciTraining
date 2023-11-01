package com.npci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import java.util.List;

import com.npci.beans.Employee;
import com.npci.service.EmployeeService;

@SpringBootApplication
@EnableDi`
public class SpringBootDbApplication {
//
	public static void main(String[] args) {
	ApplicationContext cxt =SpringApplication.run(SpringBootDbApplication.class, args);
//	//the bean id of EmployeeServiceimpl is service
//	EmployeeService service =(EmployeeService)cxt.getBean("service");
//	System.out.println("Stored employee :"employee.getId());
//	//retrive all data
//	List<Employee> employees =service.findEmployees();
//	employees.foreach(item-> System.out.println("id:" +getId()));
}

}
