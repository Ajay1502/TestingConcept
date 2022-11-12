package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Invocation Count
     To execute one test for number of time 
     @test (InvocationCount = 3)
  
  */
public class InvocationCount {
	 WebDriver driver;
     @BeforeMethod
     public void intialization() {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get("https://classic.crmpro.com/index.html");
          driver.manage().window().maximize();
      }
     
     @Test (invocationCount = 3)
     public void validatelogingcrmProtest() {
	      driver.findElement(By.name("username")).sendKeys("Speedway2016");
          driver.findElement(By.name("password")).sendKeys("Speedway@2016");
          driver.findElement(By.cssSelector(".btn.btn-small")).click();
          driver.switchTo().frame("mainpanel");  
	       String logoutTxt = driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).getText();
	       //System.out.println(logoutTxt);
	       if (logoutTxt.contains("Logout")) {
	    	   System.out.println("test is passed");
		} else {
			   System.out.println("test is failed");
		}
      }
     
     @AfterMethod
     public void resourcesClose() {
   	      driver.close(); 
     }
}
