package org.java8.training.lambda;

public class ConvertMain {

	public static void main(String[] args) {
		
//		Converter cv = str ->str.toUpperCase();
		Convert(str ->str.toUpperCase(), "rajanarendra");
		Convert(str ->str.substring(0, 3), "rajanarendra");
		Convert(str ->new StringBuilder(str).reverse().toString(), "rajanarendra");

	}
	
	public static void Convert(Converter cv, String str) {
		System.out.println(cv.convert(str));
	}

}
