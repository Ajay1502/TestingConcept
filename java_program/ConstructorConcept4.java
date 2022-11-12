package java_program;

public class ConstructorConcept4 {
	//Instance variable  - means inside class outside method
	String instituteName;
	//constructor are used to initialize value to instance variable at the time of object creation 
	public ConstructorConcept4(String name) {
		instituteName= name;
	}

	public static void main(String[] args) {
		ConstructorConcept4 cc4 = new ConstructorConcept4("Speedway tech");
		System.out.println("we are learning swaftwere testing in "+ cc4.instituteName);
		
	}

}
