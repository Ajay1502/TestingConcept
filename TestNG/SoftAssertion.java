package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Soft Assertion : If validation fails it will run until the last statement of program/test.
public class SoftAssertion {
	WebDriver driver;
	SoftAssert softassert;
  @BeforeMethod
  public void intialization() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  softassert = new SoftAssert();
	  driver.get("https://classic.crmpro.com/index.html");
	  driver.manage().window().maximize();
	  
  }
  @Test
  public void validateLogoingPage() {
	  driver.findElement(By.name("username")).sendKeys("Speedway2016");
      driver.findElement(By.name("password")).sendKeys("Speedway@2016e");
      driver.findElement(By.cssSelector(".btn.btn-small")).click();
      String actualLogingString ="Incorrect uname & password";
      String expectedLogingString = "loging is successful";
      softassert.assertEquals(actualLogingString, expectedLogingString,"Incorrect uname & password");
      System.out.println("loging is successful");//here test was fail it will prgram run last line.
      softassert.assertAll();
      
  }
  @AfterMethod
  public void closeResourses() {
	  driver.close();
  }
}
