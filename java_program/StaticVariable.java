package java_program;

public class StaticVariable {
	
	        //instance variable
			int num1 = 988;
			
			//static variable
			static int num2 = 322;

	


	public static void main(String[] args)
	{
		
		StaticVariable sv = new StaticVariable();
		
		System.out.println(sv.num1);              // instance variable
		
		System.out.println(StaticVariable.num2);  // static variable
		
		sv.num1 = 150;
		
		StaticVariable.num2 = 300;
		
		System.out.println(sv.num1);
		
		System.out.println(StaticVariable.num2);

		StaticVariable sv1 = new StaticVariable();
		
		sv1.num1 =350;
		
		StaticVariable.num2 =400;
		
		System.out.println(sv.num1);
		
		System.out.println(StaticVariable.num2);
		

	}

}
