package assignment1;

public class LambdaRunnableExample {

    public static void main(String[] args) {

        // Create a new thread using a lambda expression

        Thread thread = new Thread(() -> {

            System.out.println("Lambda Runnable in action!");

        });

 

        // Start the thread

        thread.start();

    }

}