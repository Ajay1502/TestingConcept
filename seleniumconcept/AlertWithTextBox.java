package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
			
			driver.findElement(By.cssSelector(".btn.btn-info")).click();
			
			Thread.sleep(2000);
			
			Alert alt = driver.switchTo().alert();
			
			String text = alt.getText();

			System.out.println(text);
			
			alt.sendKeys("Ajay pande");
			
			Thread.sleep(2000);
			
			alt.accept();
			
			driver.quit();

	}

}
