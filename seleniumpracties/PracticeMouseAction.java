package seleniumpracties;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMouseAction {
 WebDriver driver;
	public static void main(String[] args) {
		PracticeMouseAction dd = new PracticeMouseAction();
		dd.mouseActions();
        
	}
public void mouseActions() {
	 driver = new ChromeDriver();
	 WebElement mouse =driver.findElement(By.cssSelector(""));
	 Actions act =new Actions(driver);
	 act.moveToElement(mouse).build().perform();
}
}
