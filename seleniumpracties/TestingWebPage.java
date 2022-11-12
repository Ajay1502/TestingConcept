package seleniumpracties;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingWebPage {

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
		
		WebElement malerdobtn = driver.findElement(By.cssSelector("[value='Male']"));
		WebElement femalerdobtn = driver.findElement(By.cssSelector("[value='FeMale']"));
		femalerdobtn.click();
		if(malerdobtn.isSelected()||femalerdobtn.isSelected()) {
			malerdobtn.click();
		}
		
		List<WebElement> checkbox=driver.findElements(By.cssSelector("[type='checkbox']"));
		for(WebElement box : checkbox) {
			box.click();
			if(driver.findElement(By.id("checkbox2")).isSelected()){
			box.click();	
			}
		}
		 driver.findElement(By.cssSelector("#msdd")).click();
         List<WebElement>  result  =driver.findElements(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all [style='text-decoration:none']"));
         for(int i=0;i<result.size();i++ ) {
             String otn =result.get(i).getText();
         if(otn.equalsIgnoreCase("English")) {
      	     result.get(i).click();
      	     break;
        } 
      }
         
        WebElement dropdown = driver.findElement(By.cssSelector("[ng-model='Skill']"));
		Select sel = new Select(dropdown);
		sel.selectByValue("Java");
		
		driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
		 List<WebElement> con=driver.findElements(By.cssSelector("#select2-country-results [role='treeitem']"));
	        for(WebElement ment:con) {
	        String desh	=ment.getText();
	        if(desh.equalsIgnoreCase("India")) {
	        	ment.click();
	        	break;
	        }
	     } 
		WebElement dropdown1 = driver.findElement(By.cssSelector("[placeholder='Year']"));
		Select sel1 = new Select(dropdown1);
		sel1.selectByVisibleText("1999");
		
		WebElement dropdown2 = driver.findElement(By.cssSelector("[placeholder='Month']"));
		Select sel2 = new Select(dropdown2);
		sel2.selectByIndex(2);
		
		WebElement dropdown3 = driver.findElement(By.cssSelector("[placeholder='Day']"));
		Select sel3 = new Select(dropdown3);
		sel3.selectByValue("15");
		
		driver.findElement(By.cssSelector("#firstpassword")).sendKeys("15021999");
		driver.findElement(By.cssSelector("#secondpassword")).sendKeys("15021999");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		Thread.sleep(4000);
		
		

	
	driver.quit();
  }	
}
