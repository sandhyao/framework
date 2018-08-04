package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngleads.Annotations;

public class MyHomePage extends Annotations {

	public MyHomePage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Leads") WebElement leadsLink;
	public MyLeadsPage clickLeads() {
		click(leadsLink);
		return new MyLeadsPage();
	}
}
