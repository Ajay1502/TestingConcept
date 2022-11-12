package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://us02web.zoom.us/postattendee?mn=97WY1hs-bCMTWoEDgcKxtA1xStj9n2heUg6X.ZjekXLaz2DnizWdf&id=3");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("REPORT")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
