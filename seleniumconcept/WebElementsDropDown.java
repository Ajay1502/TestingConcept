package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ajay");
	    driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Pande");
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Aurangabad");
		driver.findElement(By.cssSelector("[ng-model='EmailAdress']")).sendKeys("Pandeajay918@gmail.com");
		driver.findElement(By.cssSelector("[ng-model='Phone']")).sendKeys("8554843552");
		
		//rdobtn(RadioBtn)
		WebElement malerdobtn = driver.findElement(By.cssSelector("[value='Male']"));
		WebElement femalerdobtn = driver.findElement(By.cssSelector("[value='FeMale']"));
		femalerdobtn.click();
		if(!malerdobtn.isSelected()||!femalerdobtn.isSelected()) {
			malerdobtn.click();
			
		}
		//CheckBox
		List<WebElement> checkbox=driver.findElements(By.cssSelector("[type='checkbox']"));
		for(WebElement box : checkbox) {
			box.click();
			  if(driver.findElement(By.id("checkbox2")).isSelected()){
			     box.click();	
			}
			
		//DropDown
		WebElement dropdown = driver.findElement(By.cssSelector("[ng-model='Skill']"));
		Select sel = new Select(dropdown);
		sel.selectByValue("Java");
		
		
		
		}
	}

	
}
