package org.java8.training.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Method reference examples
 * @author eppra01
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Math m1 = Test::add;
		// Math m1 = (a,b) -> Test.add(a,b);
		Math m2 = Test::subtract;
		// Math m2 = (a,b) -> Test.subtract(a,b);
		print(Test::add, 30, 20);
		print(Test::subtract, 30, 20);
//		System.out.println(m1.operate(30, 20));
//		System.out.println(m2.operate(30, 20));
		System.out.println("--------------------------");
		String[] names = {"Raja","kumar","raju","kavi","ghani" };
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		for(String str:names) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		
		String[] names1 = {"Raja1","kumar1","raju1","kavi1","ghani1" };
		Arrays.sort(names1,(s,t)->s.compareTo(t));
		
		for(String str:names1) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		String[] names2 = {"Raja2","kumar2","raju2","kavi2","ghani2" };
		Arrays.sort(names2, String::compareTo);
		for(String str:names2) {
			System.out.println(str);
		}
		
		printName(s->new Person(s), "raja");
		
		printName(Person::new, "Narendra");
		
	}
	
	public static void print(Math m1, int x, int y) {
		System.out.println("Method reference:"+m1.operate(x, y));
	}
	
	public static void printName(ConverterPerson cp, String str) {
		Person person = cp.convert(str);
		System.out.println(person.name);
	}
}
