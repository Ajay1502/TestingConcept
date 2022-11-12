package java_program;

public class ConstructorConcept {
	         //Constructor name and class name should be same.
			//constructor not allowed in return type
			// Note : we can pass parameter.
	//default Constructor - compiler will generate
	public ConstructorConcept() {
		super();
	}
	//user defined Constructor
	//public ConstructorConcept (int i) //userdefined 0 argument Constructor.
	//{
		
		//int userId = i+1;
		//System.out.println("userId :"+userId);
	//}
	//ConstructorConcept // --Data type, class name
	//cc                 // --Reference variable,on
    //	=                  // --Assignment operator 
	//new                // --keyword used to create new object
	//ConstructorConcept()// --Constructor              
	//;                  // --statement terminator
	
	
	public static void main(String[] args) {
		               //
		ConstructorConcept cc = new ConstructorConcept();
		
		cc.demo();
	}
   
    public void demo() {
    	System.out.println("ConstructorConceptggg");
    }
    //----------------------------------------------------
   /* public ConstructorConcept () {
		System.out.println("this line print in constructor method");
	}

	public static void main(String[] args) {
		
		ConstructorConcept cc = new ConstructorConcept();
		cc.demo();
	}
    public void demo() {
    	System.out.println("ConstructorConcept");
    }
    ------------------------------------------------------------------
   * with parameters
    public ConstructorConcept (int i) //userdefined 0 argument Constructor.
	{
		
		int userId = i+1;
		System.out.println("userId :"+userId);
	}

	public static void main(String[] args) {
		
		ConstructorConcept cc = new ConstructorConcept(1);
		
		cc.demo();
	}*/
}
