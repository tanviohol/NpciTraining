package com.npci;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {
public static void main(String[] args) {
	//TreeSet looks for comparable type to sort
	//string , integer , double, localDate nd so implements comparable.compareto(T t)
	//treeset uses comparable to compare by default
	
	Set<String> strings =new TreeSet<>();
	strings.add("hello");
	strings.add("Hello");
	strings.add("HELLO");
	strings.add("Test");
	System.out.println(strings);
	
	//treeset can also sort Employee or other complex types but there should be either
	//comparable or comparator for employee
	
	System.out.println("Employee inside TressSet");
	
//	Set<Employee> employees =new TreeSet<>((x,y)->x.getBirthday().compareTo(y.getBirthday()));//it searches comparable by default
//	employees.add(new Employee(100,"Alex", 452002.0 , LocalDate.parse("2001-02-25")));
//	employees.add(new Employee(101,"Ale", 452003.0 , LocalDate.parse("2001-01-25")));
//	employees.add(new Employee(102,"lex", 452004.0 , LocalDate.parse("2001-06-25")));
//employees.add(new Employee(103,"ex", 452007.0 , LocalDate.parse("2001-12-25")));
//((x,y)->x.getSalary().compareTo(y.getSalary()));
	
	Set<Employee> employees =new TreeSet<>((x,y)->Double.compare(y.getSalary(), x.getSalary()));//it searches comparable by default
	employees.add(new Employee(100,"Alex", 452002.0 , LocalDate.parse("2001-02-25")));
	employees.add(new Employee(101,"Ale", 452003.0 , LocalDate.parse("2001-01-25")));
	employees.add(new Employee(102,"lex", 452004.0 , LocalDate.parse("2001-06-25")));
employees.add(new Employee(103,"ex", 452007.0 , LocalDate.parse("2001-12-25")));
for(Employee employee : employees)
{
	
System.out.println(employee);

}
}
}
