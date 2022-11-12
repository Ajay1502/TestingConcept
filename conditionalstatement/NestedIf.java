package conditionalstatement;

import java.util.Scanner;

public class NestedIf {//4

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your citizenship");
		String citizenship=scan.nextLine();
		
		System.out.println("please enter your age");
		int age = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("please enter your city name");
		String cityname=scan2.nextLine();
		
		
		//program to check the whether candidate is eligible for driving license
		if(citizenship.equalsIgnoreCase("indian"))
		{
			
		    
		        if(age>=18)
		        {
		        	
		        
		               if(cityname.contains("Aurangabad"))
		                 {   
		            	System.out.println("candidate is eligible for driving license");   
		                 }
		               else
		                 {
		            	  System.out.println("candidate is not eligible for driving license"); 
		                 }
		            }
		         else
		          {
		            System.out.println("candidate is not eligible for driving license");	    
		          }
		}
		else
		{
		System.out.println("candidate is not eligible for driving license");
		}
		
		}

	}
