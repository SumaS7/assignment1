package assignment1;

 

public class Basiclambda {


	interface A{

		int sum(int x,int y);

	}


	interface B{

		String upperCase(String x);

	}

 

	public static void main(String[] args) {


		A a = (a1,b1)->a1+b1;

		System.out.println(a.sum(15, 20));


		B b = str->str.toUpperCase();

		System.out.println(b.upperCase("Pavani"));

	}

 

}
