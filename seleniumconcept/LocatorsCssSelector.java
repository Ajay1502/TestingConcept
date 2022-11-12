package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.automationtesting.in/Index.html");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("#btn1")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector("[placeholder='E mail']")).sendKeys("ajay");
	    
	    driver.quit();


	}

}
