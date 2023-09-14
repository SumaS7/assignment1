package assignment1;

import java.util.function.Function;

 

public class FunctionExample {

 

	public static void main(String args[]){
		Function<String,Integer> function = (str)->str.length();
		System.out.println(function.apply("Apples"));

		Function<String,String> function1 = (str)->str.toLowerCase();
		System.out.println(function1.apply("Apples"));
	}
}