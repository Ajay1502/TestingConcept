package TestNG;



public class TestXml {
  
	/* TEST.XML
	 1.To run all testinting classes in one go (test suite).
	 2.We can set The confuguration.
	   ex:<groups>
                 <run>
                 <include name="sanity Testing"></include>
                 <include name="retesting"></include>
                 </run>
         </groups>
	   
	 3.Environment
	  we can drive Environment variable data.
	   Developer ;will develop on code local system. 
	   DEV STAGE PROD
	   Environment Variable
	   DEV:-
	   Url      : https://dev.crmpro.com 
	   Username : admin123
	   Password : admin
	   
	   STAGE:-
	   Url      : https://stg.crmpro.com 
	   Username : test123
	   Password : test
	   
	   PROD:-
	   Url      : https://www.crmpro.com 
	   Username : demo123
	   Password : demo
	   
	   
	   
	   
	 4.Parameters
	 To drive parameters data into test script.
	    <parameter name="website" value="https://classic.crmpro.com/index.html"></parameter>
	  
	  5.  .properties files
	    1)	Create a file add data(key n value) 
	    2)	Create an object of Properties class
              Properties prop = new Properties();
        3)	Access the file by using FileInputStream
        4)	Load file into properties object
        5)	Access property with the reference of prop object
      
              
              
              

	 */
}
