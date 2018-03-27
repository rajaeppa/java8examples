package org.java8.training.function;

import java.util.function.Function;
/**
 * Funcation interface compose and andThen examples
 * @author eppra01
 *
 */
public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> doubler = x->x*2;
		Function<Integer,Integer> squarer = x->x*x;
		Function<Integer,Integer> adder = x->x+2;
		
		Function<Integer,Integer> addDoubler = adder.andThen(doubler);
		Function<Integer,Integer> squareDoubler = squarer.compose(doubler);
		Function<Integer,Integer> addDoublersquareDoubler = addDoubler.andThen(squareDoubler);
		
		System.out.println(" andThen implementation (2+2) * 2: "+addDoubler.apply(2));
		System.out.println(" compose implementation (2*2) * (2*2): "+squareDoubler.apply(2));
		System.out.println(" compose implementation (8*8) * (8*8): "+squareDoubler.apply(8));
		
		System.out.println(addDoublersquareDoubler.apply(2));

	}

}