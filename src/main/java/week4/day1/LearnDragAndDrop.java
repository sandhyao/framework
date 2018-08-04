package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elem = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(elem);
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
			
		
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(drag,drop);
		builder.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
		
		


	}

}
