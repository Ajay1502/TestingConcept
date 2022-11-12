package exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		try {
			int i = 5;
			int j = 0;
			int k = i/j;
			System.out.println(k);
		}
		catch(Exception e){
			System.out.println("Exception handling done with a try and catch block");
		}
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

	}

}
