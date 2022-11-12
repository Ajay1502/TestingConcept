package crmprotesting;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		TestBase tb =new TestBase();
		tb.validateLoginTest();
		tb.validateNewCreateContactTest();
	}
	
	public void validateLoginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajay pande\\Downloads\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("https://classic.crmpro.com/index.html");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
	       driver.findElement(By.name("username")).sendKeys("Speedway2016");
	       driver.findElement(By.name("password")).sendKeys("Speedway@2016");
	       driver.findElement(By.cssSelector(".btn.btn-small")).click();
	}
	
	public void validateNewCreateContactTest() {
		   driver.switchTo().frame("mainpanel");
	       
	       WebElement cont = driver.findElement(By.cssSelector("[title='Contacts']"));
	       Actions act = new Actions(driver);
	       act.moveToElement(cont).build().perform();
	       
	       driver.findElement(By.cssSelector("[title='New Contact']")).click();
	       WebElement dropdown = driver.findElement(By.cssSelector("[name='title']"));
	       Select sel = new Select(dropdown);
	       sel.selectByValue("Mr.");
	       
	       driver.findElement(By.id("first_name")).sendKeys("Jack");
	       driver.findElement(By.id("middle_initial")).sendKeys("R");
           driver.findElement(By.id("surname")).sendKeys("Davidson");
	       
	       WebElement dropd2 = driver.findElement(By.cssSelector("[name='suffix']"));
	       Select sel2 = new Select(dropd2);
	       sel2.selectByValue("Jr.");
	       
	       driver.findElement(By.cssSelector("[name='nickname']")).sendKeys("Aj");
	       
	       String parenthandle = driver.getWindowHandle();
			System.out.println(" Parentwindow "+ parenthandle);
	       driver.findElement(By.xpath("(//*[contains(@onclick,'javascript:lookup')])[1]")).click();
		   Set<String> handles = driver.getWindowHandles();
		   for(String handle:handles) {
				System.out.println(handle);
				if(!handle.equals(parenthandle)) {
					driver.switchTo().window(handle);
					driver.findElement(By.cssSelector("[name='search']")).sendKeys("Wipro");
					driver.findElement(By.cssSelector("[type='submit']")).click();
					driver.findElement(By.xpath("//*[text()='Wipro']")).click();
	            }
		   }
	       driver.switchTo().window(parenthandle);
	       driver.switchTo().frame("mainpanel");
		   driver.findElement(By.cssSelector("[name='company_position']")).sendKeys("Manager");
		   driver.findElement(By.cssSelector("#department")).sendKeys("Software testing");
		   
		   String parenthandle1 = driver.getWindowHandle();
		   driver.findElement(By.xpath("(//*[@class='button'])[5]")).click();
	       Set<String> handles1 = driver.getWindowHandles();
	       for(String handle1 : handles1) {
	    	   if(!handle1.equals(parenthandle1)) {
	    		   driver.switchTo().window(handle1);
	    	       driver.findElement(By.id("search")).sendKeys("ganesh");
                driver.findElement(By.cssSelector("[type='submit']")).click();
                driver.findElement(By.xpath("(//*[text()='Ganesh Kakade'])[1]")).click();
	    	   } 
	       }
	       driver.switchTo().window(parenthandle1);
	       driver.switchTo().frame("mainpanel");
	       
	     String parenthandle2 =driver.getWindowHandle();
	     driver.findElement(By.xpath("(//*[@class='button'])[6]")).click();  
	     Set<String> handles2 = driver.getWindowHandles();
	     for(String handle2 : handles2 ) {
	    	if(!handle2.equals(parenthandle2)) {
	    		driver.switchTo().window(handle2);
	    		driver.findElement(By.cssSelector("#search")).sendKeys("sujeet");
	    		driver.findElement(By.cssSelector("[type='submit']")).click();
	    		driver.findElement(By.xpath("(//*[text()='Sujeet s'])[1]")).click();
	    	}
	     }
	     driver.switchTo().window(parenthandle2);
	     driver.switchTo().frame("mainpanel");
	       
	     String parenthandle3 = driver.getWindowHandle();
	     driver.findElement(By.xpath("(//*[@class='button'])[7]")).click();
	     Set<String> handles3 = driver.getWindowHandles();
	     for(String handle3 :handles3 ){
	    	if(!handle3.equals(parenthandle3)) { 
	    		driver.switchTo().window(handle3);
	    		driver.findElement(By.cssSelector("#search")).sendKeys("sujeet");
	    		driver.findElement(By.cssSelector("[type='submit']")).click();
	    		driver.findElement(By.xpath("(//*[text()='Sujeet s'])[1]")).click();
	    	}
	     }
	     driver.switchTo().window(parenthandle3);
	     driver.switchTo().frame("mainpanel");
	     
	    WebElement dd = driver.findElement(By.cssSelector("[name='category']")); 
	     Select sele =new Select(dd);
	     sele.selectByValue("Friend");
	       
	    WebElement dDown = driver.findElement(By.cssSelector("[name='status']"));
	     Select lect = new Select(dDown);  
	     lect.selectByValue("Active");  
	     
	     driver.findElement(By.cssSelector("[name='phone']")).sendKeys("0240-218542");
	     driver.findElement(By.cssSelector("[name='mobile']")).sendKeys("8888899999");
	     driver.findElement(By.cssSelector("[name='home_phone']")).sendKeys("9854216355");
	     driver.findElement(By.cssSelector("[name='fax']")).sendKeys("545228");
	     driver.findElement(By.cssSelector("[name='email']")).sendKeys("jackdavidson88@gmail.com");
	     driver.findElement(By.cssSelector("[name='email_alt']")).sendKeys("jackdavidson33@gmail.com");
	       
	     WebElement rdoBtn = driver.findElement(By.xpath("(//*[@type='radio'])[1]")); 
	     WebElement rdoBtn1 = driver.findElement(By.xpath("(//*[@type='radio'])[2]")); 
	     rdoBtn1.click();
	     if(!rdoBtn.isSelected()) {
	    	 rdoBtn1.click();
	     }
	     WebElement rdBtn = driver.findElement(By.xpath("(//*[@type='radio'])[3]")); 
	     WebElement rdBtn1 = driver.findElement(By.xpath("(//*[@type='radio'])[4]")); 
	     rdBtn.click();
	     if(!rdBtn1.isSelected()) {
	    	 rdBtn.click();
	     }  
	     WebElement rdOBtn = driver.findElement(By.xpath("(//*[@type='radio'])[5]")); 
	     WebElement rdOBtn1 = driver.findElement(By.xpath("(//*[@type='radio'])[6]")); 
	     rdOBtn1.click();
	     if(!rdOBtn.isSelected()) {
	    	 rdOBtn1.click();
	     }    
	     driver.findElement(By.cssSelector("[id='im_id']")).sendKeys("jackdavidson");  
	     
	     WebElement dROP = driver.findElement(By.cssSelector("[name='im_netowrk']"));
	     Select cT =new Select(dROP);  
	     cT.selectByValue("Google Talk");  
	       
	     driver.findElement(By.cssSelector("[name='skype_id']")).sendKeys("Jack855");  
	       
		     WebElement DROPd = driver.findElement(By.cssSelector("[onchange='setAddress(this);']"));
	     Select LEct =new Select(DROPd);
	     LEct.selectByVisibleText("Billing Address");
	     
	     driver.findElement(By.cssSelector("[name='address']")).sendKeys("los santos,tuner");
	     driver.findElement(By.cssSelector("[name='city']")).sendKeys("los santos");
	     driver.findElement(By.cssSelector("[name='state']")).sendKeys("Argentina");
	     driver.findElement(By.cssSelector("[name='postcode']")).sendKeys("458662");
	     driver.findElement(By.cssSelector("[name='country']")).sendKeys("america");
	     driver.findElement(By.cssSelector("[name='tags']")).sendKeys("To set a breakpoint");
	     driver.findElement(By.cssSelector("[name='description']")).sendKeys("To set a breakpoint, click on the blue dot next to a step. Replay your user flow, the replay will pause before executing the step. From here, you can continue the replay, execute a step, or cancel the replay.");
	     
	     WebElement drop2 = driver.findElement(By.cssSelector("[name='time_zone']"));
	     Select sel3 = new Select(drop2);
	     sel3.selectByVisibleText("America/Argentina/Catamarca - Argentina Standard Time");
	     
	     WebElement drop3 = driver.findElement(By.cssSelector("[onchange='setTZByCountry(this.value);']"));
	     Select sel4 = new Select(drop3);
	     sel4.selectByValue("AS");
	     
	     driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")).click();	 
	     
	     WebElement ct = driver.findElement(By.xpath("(//*[@class='tabs_header'])[1]"));
		 String title = ct.getText();
			System.out.println(title);
			if(title.contains("Jack Davidson")) {
			     System.out.println("test case is passed");
			}
			else {
				 System.out.println("test case is failed");
			}
	    	
      driver.close();
}
	
	public void validateToNewComponyTest() {
		driver.switchTo().frame("mainpanel");
		
		WebElement mouse =driver.findElement(By.cssSelector("[title='Companies']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).build().perform();
		
		driver.findElement(By.cssSelector("[title='New Company']")).click();
        driver.findElement(By.cssSelector("[name='company_name']")).sendKeys("cipla");
        driver.findElement(By.cssSelector("[name='industry']")).sendKeys("pharma");
        driver.findElement(By.cssSelector("[name='annual_revenue']")).sendKeys("5000000");
        
        WebElement dd = driver.findElement(By.cssSelector("[name='status']"));
	    Select sel = new Select(dd);
	    sel.selectByValue("Active");
	    
	    WebElement  dd2 = driver.findElement(By.cssSelector("[name='category']"));
	    Select sel2 = new Select(dd2);
	    sel2.selectByValue("Client");
	    
	    WebElement  dd3= driver.findElement(By.cssSelector("[name='priority']"));
	    Select sel3 = new Select(dd3);
	    sel3.selectByValue("Medium");
	    
	    WebElement dd4 = driver.findElement(By.cssSelector("[name='source']"));
	    Select sel4 = new Select(dd4);
	    sel4.selectByValue("Customer");
	    
	    driver.findElement(By.cssSelector("[name='identifier']")).sendKeys("Stanless");
	    driver.findElement(By.cssSelector("[name='vat_number']")).sendKeys("sb15154sb165");
	    driver.findElement(By.cssSelector("[name='phone']")).sendKeys("9421958645");
	    driver.findElement(By.cssSelector("[name='fax']")).sendKeys("Qa942195");
	    driver.findElement(By.cssSelector("[name='website']")).sendKeys("http://ciplapharma.in");
	    driver.findElement(By.cssSelector("[name='email']")).sendKeys("ciplapharma@gmail.com");
	    driver.findElement(By.cssSelector("[name='symbol']")).sendKeys("Unity is s");
	    
	    String parenthadler = driver.getWindowHandle();
	    driver.findElement(By.cssSelector("[value='Lookup']")).click();
	    Set<String> allhandle = driver.getWindowHandles();
	    for(String handle:allhandle) {
	    	if (!handle.contains(parenthadler)) {
				driver.findElement(By.cssSelector("[name='search']")).sendKeys("tcs");
				driver.findElement(By.cssSelector("[type='submit']")).click();
				driver.findElement(By.xpath("//*[text()='TCS Pune']")).click();
			}
	    }
	    driver.switchTo().window(parenthadler);
	    driver.switchTo().frame("mainpanel");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	}
	
}
