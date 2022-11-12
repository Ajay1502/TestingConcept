package exceptionhandling;

public class ExceptionPrinting {

	public static void main(String[] args) {
		ExceptionPrinting ep = new ExceptionPrinting();
		ep.divide(10, 0);

	}
    public void divide(int i,int j) {
    	int k=0;
    	try {
    	k = i/j;}
    	catch(ArithmeticException ae) {
    		ae.printStackTrace();
    		System.out.println("We can't divide zero,plz use another number");}
    	finally{
    		System.out.println(k);
    	}
    	
    	
    	
    }
}
  