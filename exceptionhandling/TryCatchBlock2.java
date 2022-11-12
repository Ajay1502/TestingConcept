package exceptionhandling;

import org.openqa.selenium.WebDriver;

public class TryCatchBlock2 {

	WebDriver driver;
	
	public static void main(String[] args) {
		TryCatchBlock2 tc = new TryCatchBlock2();
		tc.demo();

	}
   
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		//int a[] = {1,2,3,4,5}; 
		try {
		driver.get("https://www.google.com");//null point exception
			//System.out.println(a[5]);	
		}
		catch(NullPointerException e) { 
			System.out.println("Driver not initilazed");
		}
/*		with try block add multiple catch block.
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bound");
		}
		
		Class order SHOULD BE child to parent
		catch(Exception e) {     Exception is a parent object
			System.out.println("Exception handling with exception class");
		}*/
		
//		Finally block IS EXECUTE are both situation if there is exception and if ther not exception
		finally {
			System.out.println("closed the resources");
			System.out.println("driver instance closed");
		}
		System.out.println("rest of the statement");
	}
	
}
