package week2.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
				//opt.setHeadless(true);
				//ChromeDriver driver = new ChromeDriver(opt);
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps");
				driver.manage().window().maximize();
				driver.findElementById("username").sendKeys("DemoSalesManager");
				WebElement field = driver.findElementById("password");
				field.sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
				driver.findElementById("createLeadForm_firstName").sendKeys("Sandhya");
				driver.findElementById("createLeadForm_lastName").sendKeys("Oli");
				//working with dropdowns*********************
				WebElement ddid = driver.findElementById("createLeadForm_industryEnumId");
				Select dd1 = new Select(ddid);
				//dd.selectByVisibleText("Insurance");
				//dd.selectByValue("IND_HARDWARE");
			     List<WebElement>allOptions = dd1.getOptions();
				int size = allOptions.size();
							
				(dd1).selectByIndex(size-2);
				/*for (WebElement a : allOptions) {
					System.out.println(a.getText());
				}*/
				//WebElement findElementById = driver.findElementById("createLeadForm_dataSourceId");
				Select dd2 = new Select(driver.findElementById("createLeadForm_dataSourceId"));
				(dd2).selectByValue("LEAD_OTHER");
				Select dd3 = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
				(dd3).selectByVisibleText("Public Corporation");
				(dd2).selectByIndex(9);
				driver.quit();
				
				
					
				
				//System.out.println("The selected dropdown value = "+op);
				
				//driver.findElementByName("submitButton").click();
				




			}

	}

		
