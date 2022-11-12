package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRelativeXpathMethod2 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Index.html");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			/*  CONTAINS TEXT
		    //tagname[contain(text(),'text')] and attribute //tagname[@attribute,'value']
		                                         //input[@class,'username']tagname = *//*[contains(text(),'text']
			*/
			
			driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
			
			driver.quit();
	}

}
