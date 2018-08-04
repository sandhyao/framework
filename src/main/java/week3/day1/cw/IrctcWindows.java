package week3.day1.cw;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
public class IrctcWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsp");
		driver.manage().window().maximize();
		driver.findElementByLinkText("CONTACT US").click();
		System.out.println("contact us url is="+driver.getCurrentUrl());
		System.out.println("contact us title is= "+driver.getTitle());
		//Thread sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Compatible Browsers").click();  
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		List<String> listOfAllWindowHandles = new ArrayList<String>();				
		listOfAllWindowHandles.addAll(allWindowHandles);
		driver.switchTo().window(listOfAllWindowHandles.get(0));

		
		System.out.println("compatible browser url is="+driver.getCurrentUrl());
		System.out.println("compatible browser title is= "+driver.getTitle());
		
		//driver.switchTo().window(listOfAllWindowHandles.get(2));

		//System.out.println(driver.getWindowHandles());
		
			driver.quit();

		
		
	}

}
