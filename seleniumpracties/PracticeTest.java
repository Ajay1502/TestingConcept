package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		Thread.sleep(2000);
		WebElement ct = driver.findElement(By.cssSelector(".btn.btn-primary-outline"));
	    
		String title = ct.getText();
		 
		     System.out.println(title);
		
		     
		//Validation to check weather we landed on right web page.     
		if(title.contains("Skip Sign In")) {
		     System.out.println("test case is passed");
		}
		else {
			 System.out.println("test case is failed");
		}
	}

}
