package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCssSelctor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	
		
		

	}

}
