package TestNG;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class PropertiesFile {
 WebDriver driver;
 Properties prop;
 FileInputStream file;
  @BeforeMethod
  public void intialization() throws Exception {
	  file = new FileInputStream("D:\\files\\User ajay\\Eclipse\\eclipse-workspace\\My_java_project\\src\\TestNG\\Config.properties");
	  prop = new Properties();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
	  prop.load(file);
	  
	  driver = new ChromeDriver();
	  driver.get(prop.getProperty("website"));
	  driver.manage().window().maximize();
  }
  
  @Test
  public void validateLoginPageTest() {
	  driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
      driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
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
  public void closeResourses() {
	  driver.close();
  }

}
