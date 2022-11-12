package conditionalstatement;

import java.util.Scanner;

public class ElseIfLadder {//3

	public static void main(String[] args) {
		
		ElseIfLadder eil = new ElseIfLadder();
	    eil.selectbrowser();
	}
	public void selectbrowser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter operating system");
		String os = scan.nextLine();
		
		System.out.println("Please enter browser name");
		String browser = scan.nextLine();
		
		if(browser.contains("Chrome")||os.contains("window") ) {
			System.out.println("chrome browse is selected ");
		}
		
		else if(browser.equals("firefox")&& os.contains("linux")) {
			System.out.println("firefox browser is selected");
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			 System.out.println("edge broser is selected"); 
		}
		
		else {
			System.out.println("enter valid browser");
		} 
		
		
	}	
	
	
	//&& and
	//|| (pipe) or
	
	
 

}
