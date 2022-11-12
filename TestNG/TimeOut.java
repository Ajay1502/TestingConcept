package TestNG;

import org.testng.annotations.Test;

public class TimeOut {
 
	@Test (timeOut = 1000)
	public void timeOut() {
		int i = 1;
		do {
			System.out.println("time out concept");
		} 
		while (i<10);
	}
  
}
