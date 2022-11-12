package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver1.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			Thread.sleep(2000); 
            driver.findElement(By.cssSelector("#msdd")).click();
            List<WebElement>  result  =driver.findElements(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all [style='text-decoration:none']"));
           // int num = result.size();
          //  System.out.println(num);
             for(int i=0;i<result.size();i++ ) {
                   String otn =result.get(i).getText();
              if(otn.equalsIgnoreCase("English")) {
            	   result.get(i).click();
            	   break;
                } 
            }
             for(WebElement Web : result) {
            	 String aj =Web.getText();
            	 if(aj.equalsIgnoreCase("Spanish")) {
            		 Web.click();
            		 break;
            		 
            	 }
            }
             for(WebElement ment1:result) {
                 String desh1	=ment1.getText();
                 if(desh1.equalsIgnoreCase("Hindi")) {
                 	ment1.click();
                 	break;
                 }
            }
	}

}
