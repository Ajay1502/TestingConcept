package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CrossBrowsing {
	WebDriver driver;
	SoftAssert softassert;
	@Parameters({"website","browser"})
  @BeforeMethod
  public void intialization(String wsite,String browser) {
	  softassert = new SoftAssert();
	  if (browser.contains("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
		  driver = new ChromeDriver();
	      }
	  else if (browser.contains("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ajay pande\\Downloads\\geckodriver.exe");
		   driver = new FirefoxDriver();
	      }
	  else if (browser.contains("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\ajay pande\\Downloads\\msedgedriver.exe");
		  driver= new EdgeDriver(); 
	      }
	  else {
		 System.out.println("plase select valid browser");
	      }
	  
	  driver.get(wsite);
	  
  }
  @Parameters({"username","password"})
  @Test
 public void validateLoginPageTest(String uname,String pwd) {
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.cssSelector("[value='Login']")).click();
	  driver.switchTo().frame("mainpanel");  
	  String logoutTxt = driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).getText();
	  softassert.assertEquals(logoutTxt," loging","loging is mismatch");
  }
  @AfterMethod
  public void closeResourses() {
	  driver.close();
	  
  }
}
