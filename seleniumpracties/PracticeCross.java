package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class PracticeCross {
	public static void main(String[]args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ajay pande\\Downloads\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://classic.crmpro.com/index.html");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.name("username")).sendKeys("Speedway2016");
    driver.findElement(By.name("password")).sendKeys("Speedway@2016");
    driver.findElement(By.cssSelector(".btn.btn-small")).click();
    driver.switchTo().frame("mainpanel");
    driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
	}
}
