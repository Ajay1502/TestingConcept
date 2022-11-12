package seleniumpracties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationPracties {
	
	@BeforeMethod
	public void intialization() {
		System.out.println("Start");
	}
	
    @Test (priority = 4,enabled = false)
    public void test1() {
    	System.out.println("test 1");
    }
    
    @Test (priority = 3)
    public void test2() {
    	System.out.println("test 2");
    }
    
    @Test (priority = 2)
    public void test3() {
    	System.out.println("test 3");
    }
    
    @Test (priority = 1)
    public void test4() {
    	System.out.println("test 4");
    }
    
    @AfterMethod
    public void resourcesclose() {
    	System.err.println("close");
    }
}
