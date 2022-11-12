package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorRelativePath {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/SignIn.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='Email']")).sendKeys("demo123");
		
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("1234567");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@id='enterbtn']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
