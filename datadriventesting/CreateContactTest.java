package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateContactTest {
 
 WebDriver driver;
 SoftAssert softassert;
	
	@BeforeMethod
	public void intialazation() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://classic.crmpro.com/index.html");
         driver.manage().window().maximize();
        
	}
	
	@DataProvider(name="contactdata")
	public String [][] passdata() throws Exception {
	    String data[][]	=GetData.getData();
	    return data;
	}
	
	@Test(dataProvider ="contactdata")
	public void validateCreateContactTest(String firstname,String lastname,String contact,String address) {
		 driver.findElement(By.name("username")).sendKeys("Speedway2016");
	     driver.findElement(By.name("password")).sendKeys("Speedway@2016");
	     driver.findElement(By.cssSelector(".btn.btn-small")).click();
	     driver.switchTo().frame("mainpanel");
		 WebElement cont = driver.findElement(By.cssSelector("[title='Contacts']"));
	       Actions act = new Actions(driver);
	       act.moveToElement(cont).build().perform();
	     driver.findElement(By.cssSelector("[title='New Contact']")).click();  
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
         driver.findElement(By.id("surname")).sendKeys(lastname);
         driver.findElement(By.cssSelector("[name='mobile']")).sendKeys(contact);
         driver.findElement(By.cssSelector("[name='address']")).sendKeys(address);
         driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")).click();
         
	}
	
	@AfterMethod
	public void closeResourse() {
		driver.close();
	}
}
