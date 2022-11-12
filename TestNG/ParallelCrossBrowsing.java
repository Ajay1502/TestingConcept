package TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelCrossBrowsing {
  WebDriver driver;
  SoftAssert softassert;
  @Parameters({"website","browser","username","password"})
  @BeforeMethod
	  public void intialization(String wsite,String browser,String uname,String pwd) {
		  softassert = new SoftAssert();
		  if (browser.contains("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
			  driver = new ChromeDriver();
		      }
		  else if (browser.contains("edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\ajay pande\\Downloads\\msedgedriver.exe");
			  driver= new EdgeDriver(); 
		      }
		  else {
			 System.out.println("plase select valid browser");
		      }
		  
		  driver.get(wsite);
		  driver.findElement(By.name("username")).sendKeys(uname);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.cssSelector("[value='Login']")).click();
		  driver.switchTo().frame("mainpanel");
  }
	
	
  @Test
  public void validateLogoutTest () {
	  String logoutTxt = driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).getText();
	  softassert.assertEquals(logoutTxt," loging","loging is mismatch");
  }
  
  @Test
  public void validateCreateContactTest() {
	  WebElement cont = driver.findElement(By.cssSelector("[title='Contacts']"));
      Actions act = new Actions(driver);
      act.moveToElement(cont).build().perform();
      
      driver.findElement(By.cssSelector("[title='New Contact']")).click();
      WebElement dropdown = driver.findElement(By.cssSelector("[name='title']"));
      Select sel = new Select(dropdown);
      sel.selectByValue("Mr.");
      
      driver.findElement(By.id("first_name")).sendKeys("Jack");
      driver.findElement(By.id("middle_initial")).sendKeys("R");
      driver.findElement(By.id("surname")).sendKeys("Davidson");
      driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")).click();	 
	     
	     WebElement ct = driver.findElement(By.xpath("(//*[@class='tabs_header'])[1]"));
		 String title = ct.getText();
	  softassert.assertEquals(title, ct);
  }
  
  @Test
  public void validateCreateCompontTest () {
	  WebElement mouse =driver.findElement(By.cssSelector("[title='Companies']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).build().perform();
		
		driver.findElement(By.cssSelector("[title='New Company']")).click();
      driver.findElement(By.cssSelector("[name='company_name']")).sendKeys("cipla");
      driver.findElement(By.cssSelector("[name='industry']")).sendKeys("pharma");
      driver.findElement(By.cssSelector("[name='annual_revenue']")).sendKeys("5000000");
      
      WebElement dd = driver.findElement(By.cssSelector("[name='status']"));
	    Select sel = new Select(dd);
	    sel.selectByValue("Active");
	    
	    WebElement  dd2 = driver.findElement(By.cssSelector("[name='category']"));
	    Select sel2 = new Select(dd2);
	    sel2.selectByValue("Client");
	    
	    WebElement  dd3= driver.findElement(By.cssSelector("[name='priority']"));
	    Select sel3 = new Select(dd3);
	    sel3.selectByValue("Medium");
	    
	    WebElement dd4 = driver.findElement(By.cssSelector("[name='source']"));
	    Select sel4 = new Select(dd4);
	    sel4.selectByValue("Customer");
	    
	    driver.findElement(By.cssSelector("[name='identifier']")).sendKeys("Stanless");
	    driver.findElement(By.cssSelector("[name='vat_number']")).sendKeys("sb15154sb165");
	    driver.findElement(By.cssSelector("[name='phone']")).sendKeys("9421958645");
	    driver.findElement(By.cssSelector("[name='fax']")).sendKeys("Qa942195");
	    driver.findElement(By.cssSelector("[name='website']")).sendKeys("http://ciplapharma.in");
	    driver.findElement(By.cssSelector("[name='email']")).sendKeys("ciplapharma@gmail.com");
	    driver.findElement(By.cssSelector("[name='symbol']")).sendKeys("Unity is s");
	    driver.findElement(By.xpath("(//*[@value='Save'])[2]")).click();
	    
	    
	    
	    
	  
  }
  @AfterMethod
  public void closeResource() {
	  driver.close();
  }
}
