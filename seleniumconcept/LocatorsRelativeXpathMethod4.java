package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRelativeXpathMethod4 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 
		 driver.manage().window().maximize();
		 
		 /* OR 
		   //*[true or true]=true                      //*[true or false]= true
          //*[@name='firstname' or @id='u_0_b_86']	   //*[@name='first' or @id='u_0_b_86'] 
		  
		 */
		 driver.findElement(By.xpath("//*[@name='firstname' or @id='u_0_b_86']")).sendKeys("jay");
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		 /* FALSE
		   //*[true or true]=true                      //*[FALSE or false]= false
        //*[@name='firstname' or @id='u_0_b_86']	   //*[@name='first' or @id='u_0_b_86'] 
		  
		 */
	}

}
