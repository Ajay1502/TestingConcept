package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parameters {
 WebDriver driver;
  @org.testng.annotations.Parameters("website")
  @BeforeMethod
  public void intialization(String wsite) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(wsite);
	  driver.manage().window().maximize(); 
  }
  @org.testng.annotations.Parameters({"username","password"})
  @Test
  public void validateLoginPageTest(String uname,String pwd) {
	  driver.findElement(By.name("username")).sendKeys(uname);
      driver.findElement(By.name("password")).sendKeys(pwd);
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
