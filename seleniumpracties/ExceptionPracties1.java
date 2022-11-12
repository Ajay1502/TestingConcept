package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExceptionPracties1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://classic.crmpro.com/index.html");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
	       driver.findElement(By.name("username")).sendKeys("Speedway2016");
	       driver.findElement(By.name("password")).sendKeys("Speedway@2016");
	       try {
	    	    driver.findElement(By.cssSelector(".btn btn-small")).click();
	       }
	       catch(Exception e) {
	    	   System.out.println("Exception handler is working");
               driver.findElement(By.cssSelector(".btn.btn-small")).click();
	       }
	       driver.switchTo().frame("mainpanel");
	       
	       WebElement cont = driver.findElement(By.cssSelector("[title='Contacts']"));
	       Actions act = new Actions(driver);
	       act.moveToElement(cont).build().perform();
	       
	       driver.close();
	}

}
