package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElementsTextbox {

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
		
		
	}

}
