package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {
	 WebDriver driver;
     @BeforeMethod
     public void intialization() {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get("https://classic.crmpro.com/index.html");
          driver.manage().window().maximize();
      }
     
     @Test  (groups = "retesting")
     public void validatepagetitletest() {
	     String title = driver.getTitle();
	       System.out.println("pagetitle");
	     if (title.equalsIgnoreCase("CRMPRO - CRM software for customer relationship management, sales, and support.")) {
			      System.out.println("test is passed");
		}
	     else {
			      System.out.println("test is failed");
		}
      } 

     @Test  (groups = "retesting")
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
    
     @Test (groups = "sanity Testing")
     public void validateCRMPROlogingpagelogotest() {
     boolean status = driver.findElement(By.xpath("(//*[@class='img-responsive'])[1]")).isDisplayed();
     System.out.println("CRMPROlogingpagelogo");
     if (status==true) {
		System.out.println("test is passed");
	} else {
		System.out.println("test is failed");
	}
     }
     
     @Test  (groups = {"retesting","sanity Testing"})
     public void validateforgetPasswordtest() {
     String fgp =  driver.findElement(By.xpath("//*[text()='Forgot Password?']")).getText();
     System.out.println("forgetPassword");
     if (fgp.contains("Forgot Password")) {
   	  System.out.println("test is passed");
	} else {
		  System.out.println("test is failed");
	}
     }
     
     @Test  (groups = "retesting")
     public void validatecratenewcontacttest() {
    	 System.out.println("depands on method validatelogingcrmProtest ");
     }
     
     @Test (groups ={"retesting","sanity Testing"})
     public void validatecratenewcompanytest() {
    	 System.out.println("depands on method validatelogingcrmProtest to create to company");
     }
     @AfterMethod
     public void resourcesClose() {
   	  driver.close(); 
     }
}
