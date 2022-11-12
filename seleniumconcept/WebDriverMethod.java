package seleniumconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.google.co.in/");
				
				// get.titile  = page title
				String title = driver.getTitle();
				 
				     System.out.println(title);
				
				     
				//Validation to check weather we landed on right web page.     
				if(title.contains("Google")) {
				     System.out.println("test case is passed");
				}
				else {
					 System.out.println("test case is failed");
				}
				
				
				driver.quit();
	}

}
