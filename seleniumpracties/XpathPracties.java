package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathPracties {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		
		
		XpathPracties  rel = new XpathPracties ();
		
		rel.contain();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	/*	TEXT()
		//tagname[text()='text']     */		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	
		driver.quit();
	}
	
	public void contain () {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.findElement(By.xpath("//button[contain(text(),'Sign in')]")).click();
		
		driver.quit();
		
	
	}

}
