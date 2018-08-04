package projectsimple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//login with username & password
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		driver.findElementByLinkText("Create Contact").click();
		WebElement firstname = driver.findElementById("firstNameField");
		firstname.sendKeys("Sandhya");
		WebElement lastname = driver.findElementById("lastNameField");
		lastname.sendKeys("Ramsankar");
		WebElement firstnamelocal = driver.findElementById("createContactForm_firstNameLocal");
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
	
	
	driver.findElementByName("submitButton").click(); 
	
	/*String text = driver.findElement(By.id("generalToNameField")).getAttribute("value");
	
	if(text.contain(firstname))
	{
			System.out.println("The name"+text+"is matched");
	}
	else*/
		
	
			
	driver.findElementByClassName("subMenuButton").click();
	WebElement market = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
	Select dd3= new Select(market);
	dd3.selectByVisibleText("Car and Driver");
	
	
	
	//driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	//driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	//driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	//driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	//driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	//driver.findElementById("createContactForm_generalPostalCode").sendKeys("600088");
	
	
	
	
	
	
	

}
}