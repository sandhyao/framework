package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngleads.Annotations;

public class MyLeadsPage extends Annotations {

	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Leads") WebElement createleadsLink;
	public CreateLeadPage clickCreateLead() {
		click(createleadsLink);
		return new CreateLeadPage();
	}
}
