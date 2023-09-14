package assignment1;


import java.util.Arrays;
import java.util.List;

public class StringManipulationWithReduce {
   public static void main(String[] args) {
       List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "fig");

       String result = stringList.stream()
               .map(String::toUpperCase) // Convert to uppercase
               .filter(s -> s.length() >= 4) // Filter strings with 4 or more characters
               .reduce("", (partialResult, str) -> partialResult + str); // Concatenate using reduce

       System.out.println(result);
   }
}
