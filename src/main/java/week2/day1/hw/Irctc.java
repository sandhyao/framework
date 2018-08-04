package week2.day1.hw;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions op=new ChromeOptions();
		//op.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement usrName = driver.findElementById("userRegistrationForm:userName");
		usrName.sendKeys("User1");
		driver.findElementById("userRegistrationForm:password").sendKeys("Test1");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Test1");
		WebElement secQDd = driver.findElementById("userRegistrationForm:securityQ");
		Select dd1 = new Select(secQDd);
		List<WebElement> secQsnOptions = dd1.getOptions();
		int dd1Size = secQsnOptions.size();
		System.out.println("The security questions are: ");
		for (WebElement opt : secQsnOptions) {
			System.out.println(opt.getText());
		}
		dd1.selectByIndex(4);
		//Keys.TAB;
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Listening to Music");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Vijay");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("VG");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		System.out.println("Check if the gender option is selected = "+driver.findElementById("userRegistrationForm:gender:0").isSelected());
	    WebElement dobDateDd = driver.findElementById("userRegistrationForm:dobDay");
	    Select dd2 = new Select(dobDateDd);
	    dd2.selectByVisibleText("9");
	    WebElement dobMonthDd = driver.findElementById("userRegistrationForm:dobMonth");
	    Select dd3 = new Select(dobMonthDd);
	    dd3.selectByVisibleText("MAR");
	    WebElement dobYearDd = driver.findElementById("userRegistrationForm:dateOfBirth");
	    Select dd4 = new Select(dobYearDd);
	    dd4.selectByValue("1989");
	    WebElement occupationDd = driver.findElementById("userRegistrationForm:occupation");
	    Select dd5 = new Select(occupationDd);
	    dd5.selectByIndex(4);
	    WebElement countriesDd = driver.findElementById("userRegistrationForm:countries");
	    Select dd6 = new Select(countriesDd);
	    dd6.selectByValue("94");
	    driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
	    driver.findElementById("userRegistrationForm:mobile").sendKeys("1234567890");
	    WebElement nationalityDd = driver.findElementById("userRegistrationForm:nationalityId");
	    Select dd7 = new Select(nationalityDd);
	    dd7.selectByVisibleText("India");
	    driver.findElementById("userRegistrationForm:address").sendKeys("C405");
	    driver.findElementById("userRegistrationForm:street").sendKeys("Ramamurthy avenue");
	    driver.findElementById("userRegistrationForm:area").sendKeys("Kolapakkam");
	    driver.findElementById("userRegistrationForm:pincode").sendKeys("600122",Keys.TAB);
	    Thread.sleep(5000);
	    WebElement cityDd = driver.findElementById("userRegistrationForm:cityName");
	    Select dd8 = new Select(cityDd);
	    dd8.selectByValue("Kanchipuram");
	    driver.findElementById("userRegistrationForm:cityName").sendKeys(Keys.TAB);
	    Thread.sleep(5000);
	    WebElement poDd = driver.findElementById("userRegistrationForm:postofficeName");
	    Select dd9 = new Select(poDd);
	    dd9.selectByValue("kolapakkam");
	    Thread.sleep(5000);
	    driver.findElementById("userRegistrationForm:landline").sendKeys("04412345678");
	    System.out.println("Check if copy residence to office address is selected = "+driver.findElementById("userRegistrationForm:resAndOff:0").isSelected());
	    
	    

	}

}
