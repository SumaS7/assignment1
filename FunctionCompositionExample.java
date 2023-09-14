
package assignment1;



import java.util.function.Function;
import java.util.function.UnaryOperator;

 

public class FunctionCompositionExample {

	public static void main(String args[]){
	Function<Integer,Integer> func = (num)-> num*2;
	System.out.println(func.apply(15));

	Function<Integer,Integer> func1 = (num)-> num+3;
	System.out.println(func1.apply(25));

	UnaryOperator<Integer> unary = num->{return((num*2)+3);};
	System.out.println(unary.apply(30));
	}
}