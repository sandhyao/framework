package week2.classwork.day2;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/table.html");
				driver.manage().window().maximize();
				System.out.println("The total no. of rows in the table are = "+driver.findElementsByXPath("//div[@id='contentblock']//table//tr").size());
				System.out.println("The total no. of columns in the table are = "+driver.findElementsByXPath("//div[@id='contentblock']//table//tr[1]/th").size());
				System.out.println("The Progress value of 'Learn to interact with elements' is = "+driver.findElementByXPath("//font[text()[contains(.,'Learn to')]]/following::td[1]/font").getText());
				
			}

		}

	


