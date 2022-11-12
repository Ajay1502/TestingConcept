package java_program;

public class InstanceVariable {
	
	// Instance Variable
	
			int number ;
			
			String name ;

	public static void main(String[] args)
	{
		InstanceVariable iv = new InstanceVariable();  // cration of object
		
		iv.number = 100 ; 
		
		System.out.println(iv.number);
		
		iv.name = "ajay";
		
		System.out.println(iv.name);
		
		iv.institute();
		
		iv.candidate();
		
		
	}
    
	// use variable to store institute number
	
	public void institute() 
	{
 
		number = 6547;
		
		System.out.println(number);
		
		name = "pande";
		
		System.out.println(name);
		
	} 
	
	// use variable to store institute number
	
	public void candidate() {
		
		number = 7698;
		
		System.out.println(number);
		
		name = "ajay pande";
		
		System.out.println(name);
	
	}
}
