package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/input")).sendKeys("8554843552");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("mh20ed4757");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/span/a/img")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
