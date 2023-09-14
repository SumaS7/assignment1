package assignment1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 

public class StreamsExample {

 

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,2,3,4,5);
		List<Integer> oddNum = num.stream()
		   .filter(num1->num1%2==1)
		   .collect(Collectors.toList());
		oddNum.forEach(System.out::println);
	}

 

}