package seleniumpracties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiesCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/checkbox");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".rct-node.rct-node-parent.rct-node-expanded")).click();
	    List<WebElement> Checkbox= driver.findElements(By.cssSelector(".rct-icon.rct-icon-uncheck"));
       	for(WebElement web : Checkbox) {
       		web.click();
       		if(driver.findElement(By.xpath("//*[text()='Documents']")).isSelected()) {
       			web.click();
       		}
       	}
	
	
	}

}
