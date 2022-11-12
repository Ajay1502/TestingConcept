package java_program;

public class MethodConcept2 {

	public static void main(String[] args) {
		MethodConcept2 meth = new MethodConcept2();
		MethodConcept2 meth2 = meth.returnObject();
	   /* Scanner scan = new Scanner(System.in);
	    System.out.println("please add first number");
	    int a= scan.nextInt();
	    System.out.println("please add second number");
	    int b= scan.nextInt();*/
	    
		meth.add();  //method calling 
        meth.additoin( 40,50);
        meth.empName("ajay");
        int a = meth.add2();
        System.out.println(a);
        String s = meth2.word();
        System.out.println("my name is "+s);
        meth.multiply(5, 10);
        //object as parameter
        //meth.mouseAction(driver)
	}
	//Example .1
	public void add() //method deceleration
	{
		int x =200; // method implementation
		int y = 100;
		int c;
		c =x+y;
		
		System.out.println(c);
		demomethods();//method call instance to instance
	}
    //Example.2 method with parameter
	public void additoin(int i,int j)
	{
		int k;
		k= i+j;
		System.out.println(k);
	}
	//Example.2
	public void empName(String name) 
	{
		System.out.println("empname is name :"+ name);
	}
	
	/*real time project
	public void mouseAction(WebDriver driver)
	actions act = new actions(driver)*/
	
	 //Example 3 duplicate method are not allowed
	 public void demo() {
		 System.out.println("this is demo1 method");
	 }
	 //public void demo() {
		 
	 //}
	
	 //Example.4 return type are mandatory
	 //public ---- sample() {  // void means nothing
	 //System.out.println(return type is compulsory);
	 //}
	 
	 //Example.5 //instance to instance direct call method
	 public void demomethods() {
		 System.out.println("this is method");
	 }
	 
	 //Example.6 java does not support inner method concept
	 public void demo1() {
		 
		 //public void demo2(){}
	 }
	    //note   - inner class is supported in java
	    //     public class d{
	     //    }  
	 
	 //Example.7 method with return type other than void (primitive,non primitive,object)
	 public int add2 (){ //primitive
		  System.out.println("this line");
		 return 88;
	 }
	public String word(){//non primitive
		// System.out.println("my name is"); 
	     return "ajay";
		}
	public MethodConcept2 returnObject() { //object
		MethodConcept2 me = new MethodConcept2();
		return me;
	}
	
		 /*if method return type is other than void then we should return that 
		   type of data at the end of method bu using return keyword .
		   
		   *return statement should be last statement of method
		      Unreachable code
		   * once we declare the return method statement will return the value but is s optional
		    to hold the value
		    at project level we should hold value to check method status. 
		  */
	 
	 //Example.8 this keyword is not allowed in static method
	 public static void staticmethod() {
		 //this();
	 }
	 public void nonstaticmethod() {
		 //this keyword will be used as a current class object reference
		 this.add();
		 this.add2();
	 }
	 
	 //Example.9 /* this is local variable (as a parameter) and instance variable name are same 
	 // then first priority goes to local variable
	 //if we want to represent instance variable then this keyword reference
	 public void multiply(int a,int b) {
	     int c =a*b	;//this a*this b then access to instance variable
	     System.out.println(c);
	    		 
		 
	 }
	 //instance variable
	 int a= 10;
	 int b= 20;
}
