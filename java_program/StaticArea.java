package java_program;

public class StaticArea {
	

	// instance variable
	String name = "ajay";
	
	//Static variable
	static int num =200;

	public static void main(String[] args) 
	{
		// static area
		System.out.println(num);//static area directly access any area
		StaticArea sa = new StaticArea();//with class object name access
		System.out.println(sa.name);
		System.out.println(StaticArea.num);//with reference of class name
		
		
	}

	public void sample ()
	{
		//instance area
		System.out.println(num);
		System.out.println(name);
	}
}
 