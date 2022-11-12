package java_program;

public class StaticBlock {
	//instance variable
	String name;
	
	//static block
	static {
		System.out.println("this is static block");
	}
    // instance block
	{
		System.out.println("this is instance blsbock");
	}
	// second instance block
	{
		System.out.println("this is second instance block");
		name="instance block";
	}
	public static void main(String[] args) {
		StaticBlock sb1 = new StaticBlock();
        System.out.println(sb1.name);
        StaticBlock sb2 = new StaticBlock();
        System.out.println(sb2.name);
        StaticBlock sb3 = new StaticBlock();
        System.out.println(sb3.name);
	}

}
