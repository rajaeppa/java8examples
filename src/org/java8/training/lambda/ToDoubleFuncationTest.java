package org.java8.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.java8.training.bean.Employee;

public class ToDoubleFuncationTest {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(new Employee(100, "raja1", 100000, 10),
				new Employee(200, "raja2", 200000, 20),
				new Employee(300, "raja3", 300000, 30),
				new Employee(400, "raja4", 400000, 30),
				new Employee(500, "raja5", 500000, 50),
				new Employee(600, "raja6", 600000, 60),
				new Employee(700, "raja7", 700000, 70));
		
		
		empList.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				System.out.println("Saving employee..."+t);
				
			}
		});
		
//		Employee emp = empList.get(0);
//
//		ToDoubleFunction<Employee> td = e->e.getSalary();
//		test(td, emp);
	}
	
	public static void test(ToDoubleFunction<Employee> td, Employee e) {
		System.out.println(td.applyAsDouble(e));
	}

}
