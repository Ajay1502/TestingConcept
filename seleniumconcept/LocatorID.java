package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorID {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ajay pande\\Downloads\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("123456");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("enterimg")).click();
		
		driver.quit();
	}

}
