package crmprotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		LoginTest lt =new LoginTest();
		lt.login();	
		

	}
    public void login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("https://classic.crmpro.com/index.html");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
	       driver.findElement(By.name("username")).sendKeys("Speedway2016");
	       driver.findElement(By.name("password")).sendKeys("Speedway@2016");
	       driver.findElement(By.cssSelector(".btn.btn-small")).click();
    }
}
