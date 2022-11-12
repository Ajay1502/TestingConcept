package seleniumpracties;

public class ExceptionPracties {

	public static void main(String[] args) {
		
		for(int n=0;n<=10;n++) {
			System.out.println(n);
		if(n==8) {
			System.out.println("try to handle the exception");
			try {int b = 0;
				 int c = n/b;
				 System.out.println(c);
			}
			catch(Exception e) {
				System.out.println("Exception handling is working ");
			}
		  }
		}
		

	}

}
