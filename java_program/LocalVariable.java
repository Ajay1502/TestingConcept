package java_program;

public class LocalVariable {
	
	
	// mandatory method - JVM will call main method for execution
	// 1st method
	public static void main(String[] args){
		
		int number = 9879;
		
		System.out.println(number);
		
		LocalVariable iv = new LocalVariable();
		
		iv.institute();
		
		iv.condidate();
		
	
	}
    // 2nd method
	public void institute() {
		
		int number = 43246;
		
		System.out.println(number);
	}

     // 3rd method
	 public void condidate() {

	     int number = 2;
	
        System.out.println(number);

	}
	 
	 /*Local Variable
	   
	  Declaration
	  the variable declared inside the method
	  
	  scope
	  the scope of local variable within the method       */
	 
}	
	
