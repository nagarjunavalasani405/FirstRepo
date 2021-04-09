package log4jdemo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoLog4j {
	
	WebDriver driver;
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
        @BeforeMethod
        
        public void setup() {

        	System.setProperty("webdriver.chrome.driver", "D:\\Chrome88\\chromedriver.exe");
	        driver = new ChromeDriver();	
    	    driver.manage().deleteAllCookies();
    	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

            
		    System.out.println("this is example of log4j");
		  
		    Log.info("this is information message");
		  //logs.error("this is error message");
		  //logs.debug("this is debug messge");
		  //logs.fatal("this is fatal message");
		  }
        @Test
        public void TestCase() {
        	
           String tittle =  driver.getTitle();
        	System.out.println("the current tittle is:" + tittle);
        	Assert.assertEquals(tittle, "OrangeHRM");
        	System.out.println("test completed");
         }
        
        @AfterMethod
		public void teardown() {
			
			driver.quit();
			
			
			
		}  
		  
	}
        


