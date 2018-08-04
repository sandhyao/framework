package dropdownlist;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement secddcountry = driver.findElementById("userRegistrationForm:countries");
		Select dd=new Select(secddcountry);
		List<WebElement> selcoun = dd.getOptions();
		int ddSize = selcoun.size();
		System.out.println("The countries are: ");
		for (WebElement opt : selcoun) {
			System.out.println(opt.getText());
		}
		dd.selectByIndex(16);
		
	}

}
