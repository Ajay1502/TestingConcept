package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ajay pande\\Downloads\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		  driver.get("https://demo.automationtesting.in/Index.html");
	        
	        driver.manage().window().maximize();
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//*[@id='btn2']")).click();
	        
	        Thread.sleep(3000);
	        
	        driver.navigate().back();
	        
	        Thread.sleep(3000);
	        
	        driver.navigate().forward();
	        
	        Thread.sleep(3000);
	        
	        driver.quit();

	}

}
