package exceptionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LogingTest {

	public static void main(String[] args) throws InterruptedException {
/*	Exception
		Exception is abnormls termination of program.
		Exception will terminate the program abnormally becouse of that rest of the code of will naot execute.
	Exception handling
	    We can defined exception handling as over come with abnormal terminal of program.
	We can handle exception using two way :
	    1.try-catch
	    2.throws keyword  
	Exception handling key words.
	    Try,Catch,Fanally,Throw,Throws.	
	*/
		             
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://classic.crmpro.com/index.html");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);//throws exception (Compiletime Exception)
	       driver.findElement(By.name("username")).sendKeys("Speedway2016");
	       driver.findElement(By.name("password")).sendKeys("Speedway@2016");
//	       try-catch exception(Run time exception)
	       try {
	    	    driver.findElement(By.cssSelector(".btn btn-small")).click();//here add a risky code
	       }
	       catch(Exception e) {
	    	   System.out.println("Exception handler is working");
            driver.findElement(By.cssSelector(".btn.btn-small")).click();//We will add exception code
	       }
	       driver.switchTo().frame("mainpanel");
	       
	       WebElement cont = driver.findElement(By.cssSelector("[title='Contacts']"));
	       Actions act = new Actions(driver);
	       act.moveToElement(cont).build().perform();
	       
	       driver.close();
	}

}
     /*There two type Exception  
           1.Checked Exception.(Compile Time Exception)
           2.Unchecked Exception. (Run Time Exception)
      Checked Exception.(Compile Time Exception)
           The checked exception which are check the compiler.
      Unchecked Exception. (Run Time Exception)
           The exception are not checked the by complier while compiling but check by JVM. 
        */ 





