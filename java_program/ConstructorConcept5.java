package java_program;

public class ConstructorConcept5 {
	String instituteName;
	
	public ConstructorConcept5 () {
		this(10,"ajay");
		System.out.println("this is 0 args constructor"); 
		
	}
	public ConstructorConcept5 (int i,String nam) {
		this("speedway");
		System.out.println("empNum is"+ i);
		System.out.println("emp name"+nam);
	}
	public ConstructorConcept5 (String name) {
		
		instituteName = name;
	}

	public static void main(String[] args) {
		ConstructorConcept5 cc5 = new ConstructorConcept5();
		System.out.println("we are learning swoftware testing in "+cc5.instituteName); 
	}

}
