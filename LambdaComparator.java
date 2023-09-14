package assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLengthSort {


    public static void main(String[] args) {

        List<String> strings = Arrays.asList("car","aeroplane","train");
        
        // Sort the list based on string length using a lambda expression
        strings.sort(Comparator.comparingInt(str->str.length()));

        // Print the sorted list
        strings.forEach(str->System.out.println(str));

    }

}