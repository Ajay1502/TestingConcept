package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
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
