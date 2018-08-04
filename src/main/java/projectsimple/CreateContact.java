package projectsimple;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateContact extends SeMethods{ 
	
 @Test
 public void ContactMethod() {
	 startApp("chrome", "http://leaftaps.com/opentaps");
     
	 
	 WebElement eleusername = locateElement("username");
		type(eleusername,"DemoSalesManager");
		WebElement elepassword =locateElement("password");
		type(elepassword,"crmsfa");
		
		//driver.findElementByClassName("decorativeSubmit").click();
		WebElement elelogin=locateElement("class","decorativeSubmit");
		click(elelogin);
		
		//driver.findElementByLinkText("CRM/SFA").click();
		WebElement elecrm=locateElement("linktext","CRM/SFA");
		click(elecrm); 
		
		WebElement elecreate=locateElement("linktext","Create Contact");
		click(elecreate);
		
		
 }


}
