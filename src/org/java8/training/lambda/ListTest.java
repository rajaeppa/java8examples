package org.java8.training.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.java8.training.bean.Employee;

public class ListTest {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(new Employee(100, "raja1", 100000, 10),
												new Employee(200, "raja2", 200000, 20),
												new Employee(300, "raja3", 300000, 30),
												new Employee(400, "raja4", 400000, 30),
												new Employee(500, "raja5", 500000, 50),
												new Employee(600, "raja6", 600000, 60),
												new Employee(700, "raja7", 700000, 70));
		
//		Collections.sort(empList, (e1,e2)->(e2.getId()-e1.getId()));
//		Collections.sort(empList, (e1,e2)->e2.getName().compareTo(e1.getName()));
//		Collections.sort(empList, (e1,e2)->(int)e2.getSalary()-(int)e1.getSalary());
		Collections.sort(empList, (e1,e2)->e1.getDeptId()-e2.getDeptId() == 0?(e1.getId()-e1.getId()):e2.getId()-e1.getId());
		
		for(Employee e:empList) {
			System.out.println(e);
		}
		
		checkEmp(e->e.getSalary() > 20, empList.get(0));
		
	}
	public static void checkEmp(Predicate<Employee> pr, Employee e) {
		if(pr.test(e)) {
			System.out.println(e + "Is valid Employee!!!");
		}else {
			System.out.println(e + "Is Not valid Employee!!!");
		}
	}
}
