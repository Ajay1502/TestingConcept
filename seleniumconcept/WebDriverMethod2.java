package seleniumconcept;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("")).click();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		if(url.contains("https://www.youtube.com/")) {
		     System.out.println("test case is passed");
		}
		else {
			 System.out.println("test case is failed");
		}
		driver.close();
		
		//driver.quit();
	}
	
}
