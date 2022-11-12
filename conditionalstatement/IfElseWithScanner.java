package conditionalstatement;

import java.util.Scanner;

public class IfElseWithScanner {//2 b
	
	public static void  main(String[] args) {
		//check the whether candidate is eligible for driving license
		System.out.println("please enter age");
		
		Scanner scan = new Scanner(System.in);
	    int age = scan.nextInt();
	   
	    if(age>18) {
	    	System.out.println("candidate is eligible for driving license");
	    }
	    else {
	    	System.out.println("candidate is not eligible for driving license");
	    }
	    System.out.println("please enter age");
	    int age2 = scan.nextInt();
	    if(age2>18) {
	    	System.out.println("candidate is eligible for driving license");
	    }
	    else {
	    	System.out.println("candidate is not eligible for driving license");
	    }
		
		
	}

}
