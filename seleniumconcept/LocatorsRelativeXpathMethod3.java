package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRelativeXpathMethod3 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 
		 driver.manage().window().maximize();
		 
		/* STARTS WITH
		 syntax  //*[starts-with(text(),'text')]   & //*[starts-with(@class,'value')]
		                                             //*[starts-with(@id,'u_0_b')]
		 */
		 driver.findElement(By.xpath("//*[starts-with(@id,'u_0_b')]")).sendKeys("ajay");
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		 

	}

}
