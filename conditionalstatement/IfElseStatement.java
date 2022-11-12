package conditionalstatement;

import java.util.Scanner;

public class IfElseStatement {//2 a

	public static void main(String[] args) {
		//program to check the whether candidate is eligible for driving license
		//Equals
        String citizenship ="American";
        if(citizenship.equals("india")){
        	System.out.println("candidate is eligible for driving license");
	    }
        else {
        	System.out.println("candidate is not eligible for driving license");
        }
        //equalsIgnorecase
        String citizenship1 ="INDIA";
        if(citizenship1.equalsIgnoreCase("india")){
        	System.out.println("candidate is eligible for driving license");
	    }
        else {
        	System.out.println("candidate is not eligible for driving license");
        }
        //contain
        String citizenship2 ="indian";
        if(citizenship2.contains("ind")){
        	System.out.println("candidate is eligible for driving license");
	    }
        else {
        	System.out.println("candidate is not eligible for driving license");
        }
        
        
        
        
        System.out.println("please enter number");
		
		Scanner scan = new Scanner(System.in);
	    int number = scan.nextInt();
	    
	    if(number%2==0) {
	    	System.out.println("this is even number");
	    }
	    else {
	    	System.out.println("this is odd number");
	    }
	    System.out.println("please enter number");
	    int number1 = scan.nextInt();
	    if(number1%2==0) {
	    	System.out.println("this is even number");
	    }
	    else {
	    	System.out.println("this is odd number");
	    }
      
	}   
	
}
