package TestNG;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TastAnnotation {
	
	/*
	 Hybrid Framework 
	  TDD - testNG 
	  DDT - ApachePOI
	  
	  
	  TestNG - text next generation.
	   TestNG is a testing framework - unit testing,function testting,ene to end testing,etc
	    
	 */	
	  
	
	//PRE-Condition  Prerequisite - user should be login page
	     @BeforeMethod
	     public void initialization() {
	    	 System.out.println("user on logingpage");
	     }

	     @Test
	     public void validatelogingtest() {
	    	 System.out.println("loging comleted successfully");
	    	 
	     }
	     
	     @Test
	     public void validatelogoTest() {
	    	 System.out.println("logo is desplyed on loging page ");
	     }
	     
	     @Test
	     public void validateforgetPasswordtest() {
	    	 System.out.println("forget password completly successfully");
	    	 throw new NoSuchElementException();
	     }
	     
	//Post-Condition    postrequisite - logout the page.
	     @AfterMethod
	     public void closeResources() {
	    	 System.out.println("driver instance closed");
	     }
}
