package com.npci;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TestUnique {

	public static void main(String[] args) {
		
		
		//storing complex type in set
		Set<Employee> employees =new HashSet<>();
		employees.add(new Employee(100,"Alex", 452002.0 , LocalDate.parse("2001-02-25")));
		employees.add(new Employee(101,"Ale", 452003.0 , LocalDate.parse("2001-01-25")));
		employees.add(new Employee(102,"lex", 452004.0 , LocalDate.parse("2001-06-25")));
		employees.add(new Employee(103,"ex", 452007.0 , LocalDate.parse("2001-12-25")));
		System.out.println("size :" +employees.size());
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
//		
//		Set<Integer> integers=new HashSet<>();
//		integers.add(7);
//		integers.add(8);
//		integers.add(9);
//		integers.add(10);
//		integers.add(71);
//		integers.add(72);
//		
//		System.out.println("size :" +integers.size());
//		
//		for()
//		
	}
}
