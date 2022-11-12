package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityAnnotation {
	/*  
	   TestNG @testParameters
	   Priority - @test(priority = 1)
	   * if u don't not provide any priority to @test ?
	   --test will be executed Alphabatical order. 
	   * Can we priority as a 0 ?
	   --yes,we can set priority to 0,execution will begin from 0 onword.
	   * can we set peiority as -minus ?
	   --yes,we can set priority to - minus.
	  
	 * */
	
	
	
	WebDriver driver;
             @BeforeMethod
             public void intialization() {
	               System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://classic.crmpro.com/index.html");
                driver.manage().window().maximize();
             }

             @Test (priority = 2)
              public void validatepagetitletest() {
	             String title = driver.getTitle();
	               //System.out.println(title);
	             if (title.equalsIgnoreCase("CRMPRO - CRM software for customer relationship management, sales, and support.")) {
			       System.out.println("test is passed");
		          }
	             else {
			       System.out.println("test is failed");
		          }
             } 

             @Test (priority = 1)
             public void validatelogingcrmProtest() {
	            driver.findElement(By.name("username")).sendKeys("Speedway2016");
                driver.findElement(By.name("password")).sendKeys("Speedway@2016");
                driver.findElement(By.cssSelector(".btn.btn-small")).click();
                driver.switchTo().frame("mainpanel");  
	            String logoutTxt = driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).getText();
	            //System.out.println(logoutTxt);
	            if (logoutTxt.contains("Logout")) {
	    	        System.out.println("test is passed");
		          }
	            else {
			        System.out.println("test is failed");
		          }
             }       
    
             @Test (priority = 3)
             public void validateCRMPROlogingpagelogotest() {
                boolean status = driver.findElement(By.xpath("(//*[@class='img-responsive'])[1]")).isDisplayed();
                if (status==true) {
		           System.out.println("test is passed");
	              }
                else {
		           System.out.println("test is failed");
	              }
              }
    
             @Test (priority = 4)
             public void validateforgetPasswordtest() {
                 String fgp =  driver.findElement(By.xpath("//*[text()='Forgot Password?']")).getText();
                 //System.out.println(fgp);
                 if (fgp.contains("Forgot Password?")) {
  	                System.out.println("test is passed");
	              }
                 else {
		            System.out.println("test is failed");
	              }
               }
    
               @AfterMethod
               public void resourcesClose() {
  	              driver.close(); 
             }  
}
