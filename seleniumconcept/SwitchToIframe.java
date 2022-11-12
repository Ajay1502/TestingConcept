package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToIframe {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("#singleframe")));
			
			driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("speedway");
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Register")).click();
			
			driver.quit();
	}

}
