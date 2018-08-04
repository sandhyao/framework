
package testngleads;


import org.testng.annotations.Test;

import testngleads.Annotations;

public class CreateContact extends Annotations{ 

	@Test(invocationCount=2)
	public void contactMethod() {
		click(locateElement("linktext","Create Contact"));

		type(locateElement("id","firstNameField"),"sandhya");

		type(locateElement("id","lastNameField"),"Ramsankar");

		click(locateElement("class","smallSubmit")); 
		
		
		
		/*WebElement firstnamelocal = driver.findElementById("createContactForm_firstNameLocal");
		firstnamelocal.sendKeys("Prianka");
		WebElement lastnamelocal = driver.findElementById("createContactForm_lastNameLocal");
		lastnamelocal.sendKeys("Siva");
		WebElement salutation = driver.findElementById("createContactForm_personalTitle");
		salutation.sendKeys("Ms");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("title");
		driver.findElementById("createContactForm_departmentName").sendKeys("CSE");
		WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dd = new Select(currency);
		dd.selectByVisibleText("INR - Indian Rupee" ); 
		WebElement description = driver.findElementById("createContactForm_description");
		description.sendKeys("I want to join in Test Leaf");
		driver.findElementById("createContactForm_importantNote").sendKeys("abcdefghijklmn");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("10");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("91");
		
		driver.findElementById("createContactForm_primaryEmail").sendKeys("sandheya@gmail.com");
		
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9840545105");
		
	
	driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("abcd");
	

	driver.findElementById("generalToNameField").sendKeys("Sandhya");
	

	driver.findElementById("createContactForm_generalAddress1").sendKeys("casa grand vivant");
	

	driver.findElementById("createContactForm_generalCity").sendKeys("chennai");
	

	driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	

	driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("123");
	

	driver.findElementById("createContactForm_generalAttnName").sendKeys("sandy");
	

	driver.findElementById("createContactForm_generalAddress2").sendKeys("III main road");
	 
	
	WebElement country = driver.findElementById("createContactForm_generalCountryGeoId"); 
	Select dd1 =new Select(country);
	dd1.selectByVisibleText("India");
	
	
	
	WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId"); 
	Select dd2 =new Select(state);
	dd2.selectByVisibleText("TAMILNADU");
	
	
	driver.findElementByName("submitButton").click(); */
	
	/*String text = driver.findElement(By.id("generalToNameField")).getAttribute("value");
	
	if(text.contain(firstname))
	{
			System.out.println("The name"+text+"is matched");
	}
	else*/
		
	
			
	/*driver.findElementByClassName("subMenuButton").click();
	WebElement market = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
	Select dd3= new Select(market);
	dd3.selectByVisibleText("Car and Driver");*/
	
	




	}

		
	}



