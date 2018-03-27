package org.java8.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.java8.training.bean.Employee;

public class StreamTest {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(100, "raja1", 100000, 10),
				new Employee(200, "raja2", 20000, 20),
				new Employee(300, "raja3", 30000, 30),
				new Employee(400, "raja4", 40000, 30),
				new Employee(500, "raja5", 50000, 50),
				new Employee(600, "raja6", 60000, 60),
				new Employee(700, "raja7", 70000, 70));
		
//		Stream<Employee> stream = 
			System.out.println("---------------------");
				empList.stream()
				.filter(e->e.getSalary()>30000)
				.filter(e->e.getDeptId() == 30)
				.forEach(System.out::println);
				System.out.println("---------------------");
				long count = empList.stream()
				.filter(e->e.getSalary()>30000)
//				.filter(e->e.getDeptId() == 30)
				.count();
				System.out.println(count);
				System.out.println("---------------------");
				Stream<String> strStream = Stream.of("raja1","raja2","raja3","raja4","raja5","raja6");
				strStream.forEach(System.out::println);
				System.out.println("-------pring employee name--------------");
				empList.stream()
				.map(Employee::getName)
				.forEach(System.out::println);
				
				System.out.println("---------get salary count------------");
				System.out.println(empList.stream()
				.map(Employee::getSalary)
				.count());
				System.out.println("--------get sum of salaries-------------");
				System.out.println(
						empList.stream()
				.mapToDouble(Employee::getSalary)
				.peek(System.out::println)
				.sum());
				System.out.println("---------get average salarie------------");
				System.out.println(
						empList.stream()
				.mapToDouble(Employee::getSalary)
				.average());
				System.out.println("---------get name uppercase------------");
						empList.stream()
				.map(e->e.getName().toUpperCase())
				.forEach(System.out::println);

	}

}
