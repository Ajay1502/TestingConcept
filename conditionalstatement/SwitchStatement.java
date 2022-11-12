package conditionalstatement;

import java.util.Scanner;


public class SwitchStatement {//5
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please print Vowels");
		String alphabet = scan.next();
		//System.out.println("please print Vowels");
		//String option = scan.next();
		switch (alphabet) {
		case "a":{
			System.out.println(alphabet+" is an vowel alphabet");
			break;
			}
		case "e":{
			System.out.println(alphabet+" is an vowel alphabet");
			break;
		}
		case "i":{
			System.out.println(alphabet+" is an vowel alphabet");
			break;
		}
		case "o":{
			System.out.println(alphabet+" is an vowel alphabet");
			break;
		}
		case "u":{
			System.out.println(alphabet+" is an vowel alphabet");
			break;
		}
		default:{
            System.out.println("please enter valid alphabet");			
        }
	  }
   }	
}
