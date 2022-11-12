package java_program;

public class MethodConcept {
	/* method are two types 
	  1.static method
	  2.instance mathod
	
	
	

	   compiler will compile program (HLL) into to (LLL)machine code create an  .class file
	   JVM
	  1. JVM will load .class file into memory
	  2. JVM will call main method for execution*/
	
	
    //syntax for main method
	public static void main(String[] args) 
	{
	MethodConcept meth ;
	meth= new MethodConcept();
	meth.add();
	meth.subtract();
	meth.multiply();
	System.out.println("this line print here");
	}
 
	public void add()
	{
		 int a ;
		 a = 100; //variable initialization
		 int  b ;// variable declaration
		 b = 300;// variable initialization
		 int c = a + b;// variable declaration + variable initialization
		 
		 System.out.println(c);
	}
	
	public void subtract() 
	{
		int a;
		a=35;
		int b;
		b=2;
		
		int c = a-b;
		System.out.println(c);
	}
	
	//access modifier return type method name (parameters){}
	     public          void       multiply     ()        {
		int a;
		a=35;
		int b;
		b=2;
		
		int c = a*b;
		System.out.println(c);
	}
}
