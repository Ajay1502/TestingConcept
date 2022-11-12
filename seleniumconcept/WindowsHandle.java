package seleniumconcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Windows.html");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			String parenthandle = driver.getWindowHandle();
			
			System.out.println(" Parentwindow "+ parenthandle);
			
			driver.findElement(By.xpath("//*[text()='    click   ']")).click();
			
			Set<String> handles = driver.getWindowHandles();
			
			for(String handle:handles) {
				System.out.println(handle);
				if(!handle.equals(parenthandle)) {
					driver.switchTo().window(handle);
					driver.findElement(By.xpath("//*[text()='Downloads']")).click();
					Thread.sleep(3000);
					driver.close();
				}
			}
			driver.switchTo().window(parenthandle);	
			
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Register")).click();
		
			driver.quit();
	}
   
}
