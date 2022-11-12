package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//Hard Assertion : hard assertion is an assertion which throw the exception immediately upon failure assertion.
//hard assertion fail it will not go to next line.
public class HardAssertion {
  WebDriver driver;
  @BeforeMethod
  public void intialization() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://classic.crmpro.com/index.html");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void validateLogingTest() {
	  driver.findElement(By.name("username")).sendKeys("Speedway2016");
      driver.findElement(By.name("password")).sendKeys("Speedway@2016e");
      driver.findElement(By.cssSelector(".btn.btn-small")).click();
      
		
		 String actualLoging = "incorrect password";
		 String expectedLoging ="loging";
		 assertEquals(actualLoging,expectedLoging,"username & password is a incorrect" );
		 
		 System.out.println("loging is a fineshed");//hard assertion is there fail becouse this line not execute,
		 
       
  }
  
  @AfterMethod
  public void closeResourses() {
	  driver.close();
  }

}
