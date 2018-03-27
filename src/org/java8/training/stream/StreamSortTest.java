package org.java8.training.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.java8.training.bean.Employee;

public class StreamSortTest {
	static long total = 0;
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(100, "raja1", 10000, 10),
				new Employee(200, "raja2", 20000, 20),
				new Employee(400, "raja4", 40000, 30),
				new Employee(300, "raja3", 30000, 30),
				new Employee(600, "raja6", 60000, 60),
				new Employee(500, "raja5", 50000, 50),
				new Employee(700, "raja7", 70000, 70));
		
System.out.println("-----------using comparable interface of Employee object-----------");
		empList.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println("-----------using lambda comparator based on salary-------");
		empList.stream()
		.sorted((x,y)->(int)x.getSalary()-(int)y.getSalary())
		.forEach(System.out::println);
		System.out.println("-----------using java8 comparator based on salary-------");
		empList.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(System.out::println);
		System.out.println("-----------using java8 thencomparator based on salary-------");
		empList.stream()
		.sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getId))
		.forEach(System.out::println);
		System.out.println("-----------using java8 allmatch based on salary-------");
		System.out.println("find all match: "+empList.stream()
		.allMatch(e->e.getSalary() == 20000));
		System.out.println("-----------using java8 findfirst based on salary-------");
		System.out.println("find first: "+empList.stream().filter(e->e.getSalary() > 30000)
		.findFirst().get());
		
		System.out.println("-----------using java8 peek sum based on salary-------");
		
		empList.stream()
		.peek(e->{total = total + e.getSalary();})
		.forEach(System.out::println);
		System.out.println(total);
		
		System.out.println("-----------using java8 stream collect-------");
		
		Map<Integer,String> map = empList.stream()
		.collect(Collectors.toMap(e->e.getId(), e->e.getName()));
		System.out.println(map);
		
		map.forEach((k,v)->{System.out.println("Key: "+k +" value:"+v);});
		System.out.println("-----------using java8 stream collect-------");
		
		Map<Integer,Employee> map1 = empList.stream()
		.collect(Collectors.toMap(e->e.getId(), e->e));
		System.out.println(map);
		
		map1.forEach((k,v)->{System.out.println("Key: "+k +" value:"+v);});
		
		Set<Employee> set = empList.stream()
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("set convert: "+set);
		System.out.println("-----------using java8 to collection treeset-------");
		Set<Employee> set1 = empList.stream()
				.collect(Collectors.toCollection(()->new TreeSet<Employee>(Comparator.comparing(Employee::getSalary))));
		System.out.println("set convert: "+set1);
		
	}

}
