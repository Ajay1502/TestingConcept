package conditionalstatement;

public class IfStatement {//1

	public static void main(String[] args) {
		/*
		   logical operators
		   1.<
		   2.>
		   3.<=
		   4.>=
		   5.==
		   
		   to compare the String value
		   1.contain
		   2.equal
		   3.equalsIgnoreCase
		 */
			
			//program to check the whether candidate is eligible for driving license
			String citizenship = "american";
			
			if(citizenship.equals("india")) {//this  statemete is false this not print out in console 
				System.out.println("candidate not eligible for driving license");
			}
			String 	citizenship1 = "india";
			if (citizenship1.equals("india")) {	
				System.out.println("candidate is eligible for driving license");}
			
			int number = 55;
			if(number%2==0) {
				System.out.println("this is odd number");
			}
			int numb = 56;
			if (numb%2==0) {
				System.out.println("this is even number");
				}
	
	}
		

}
