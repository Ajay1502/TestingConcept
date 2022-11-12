package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorClassName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ajay pande\\Downloads\\msedgedriver.exe");
		  
		  WebDriver driver = new EdgeDriver();
		  
		  driver.get("https://classic.crmpro.com/index.html");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.className("form-control")).sendKeys("Admin");
		  
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  
		 // driver.findElement(By.tagName("button")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.quit();
		  
	}

}
