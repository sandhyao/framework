package week3.day1.cw;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.lang.System;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//input[text()=\'Try it\']").click();
		Alert myAlert=driver.switchTo().alert();
		System.out.println("The alert text is"+driver.findElementByXPath("//p[text()='Hello Harry Potter! How are you today?']"));
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		List<String> listOfAllWindowHandles = new ArrayList<String>();				
		listOfAllWindowHandles.addAll(allWindowHandles);
		driver.switchTo().window(listOfAllWindowHandles.get(2));
	//	Thread.sleep(3000);
		System.out.println("The 2nd window url="+driver.getCurrentUrl());
		System.out.println("The 2nd window title="+driver.getTitle());
		driver.switchTo().window(listOfAllWindowHandles.get(0));
		System.out.println("The 1nd window url="+driver.getCurrentUrl());
		System.out.println("The 1nd window title="+driver.getTitle());
		//Thread.sleep(3000);
		
		
		
		
				
		
	}

}
