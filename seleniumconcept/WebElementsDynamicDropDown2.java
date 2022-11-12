package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDynamicDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
        driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
        List<WebElement> con=driver.findElements(By.cssSelector("#select2-country-results [role='treeitem']"));
        for(WebElement ment:con) {
        String desh	=ment.getText();
        if(desh.equalsIgnoreCase("India")) {
        	ment.click();
        	break;
        }
        }
       
	}

}
