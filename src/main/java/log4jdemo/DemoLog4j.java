package log4jdemo;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoLog4j {
	WebDriver driver;
	
      static Logger logs=LogManager.getLogger(DemoLog4j.class);
     
        @BeforeMethod
        
        public void setup() {

    		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    	    driver=new ChromeDriver();
    	    driver.manage().deleteAllCookies();
    	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");


		    System.out.println("this is example of log4j");
		    System.out.println("hiii helo this example of log4j");
		  
		  
		  logs.info("this is information message");
		  logs.error("this is error message");
		  logs.debug("this is debug messge");
		  logs.fatal("this is fatal message");
		  }
        @Test
        public void TestCase() {
        	
        	String title = driver.getTitle();
        	System.out.println("the current tittle is:"+title);
        	Assert.assertEquals(title, "OrangeHRM");
        	System.out.println("test completed");
         }
        
        @AfterMethod
		public void teardown() {
			
			driver.quit();
			
			
			
		}  
		  
	}
        


