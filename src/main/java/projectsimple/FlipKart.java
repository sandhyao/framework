package projectsimple;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class FlipKart extends SeMethods {

	@Test 
	public void purchase(){
	
	startApp("chrome","https://www.flipkart.com/");
	
		//driver.findElementByXPath("//button[text() = '✕']").click();	
	    WebElement signupclose=locateElement("xpath","//button[text() = '✕']");
	    click(signupclose);  
	    
	    
	
	
	}
}
