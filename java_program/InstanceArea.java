package java_program;

public class InstanceArea {
	
	 //instance variable
	 int num = 100;
	
    // static area
	public static void main(String[] args)  
	{
		InstanceArea ia = new InstanceArea();
		System.out.println(ia.num);
		
		
	}
	
	//instance area
	public void sample() 
	{
	 System.out.println(num);
	}

}
