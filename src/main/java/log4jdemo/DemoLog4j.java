package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {
	
     static Logger logs=LogManager.getLogger(DemoLog4j.class);
	
	  public static void main(String[] args) {
		  
		  
		  System.out.println("this is example of log4j");
		  
		  
		  logs.info("this is information message");
		  logs.error("this is error message");
		  logs.debug("this is debug messge");
		  logs.fatal("this is fatal message");
		  
		  

		  

		
		
		
		
		
		
	}

}
