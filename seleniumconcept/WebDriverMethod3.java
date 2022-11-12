package seleniumconcept;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethod3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ajay pande\\Downloads\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);

	}

}
