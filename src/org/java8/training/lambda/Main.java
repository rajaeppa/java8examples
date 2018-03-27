package org.java8.training.lambda;

public class Main {
	
	public static void main(String args[]) {
		int i = 10;
		Operator opr = (a,b)->(a+b+i);
		System.out.println(opr.add(3,4));
		
		Sysout sysout = str ->{System.out.println(str);};
		
		sysout.print("Rajanarendra E");
	}

	public static void doSomething(Operator o, int a, int b) {
		System.out.println(o.add(a, b));
	}
}
