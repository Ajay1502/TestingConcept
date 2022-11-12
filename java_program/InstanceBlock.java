package java_program;

public class InstanceBlock {
	//instance variable
	String name;

	public InstanceBlock() {
		System.out.println("this is 0 args constructor");
		
	}
	public InstanceBlock(String name) {
		System.out.println("this is parameterize constructor");
	}

	public static void main(String[] args) {
		InstanceBlock ib1 = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock("ajay");
		System.out.println("this is main method");
		System.out.println("my name is :"+ib2.name);
		System.out.println("my name is :"+ib1.name);
		
	
	}
	//instance Block
	{
		System.out.println("this is instance block");
		name= "ajay pande";
	}
	//one more add instance block
	{
		System.out.println("ths is second instance block");
	}

}
