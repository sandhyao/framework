package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngleads.Annotations;

public class CreateLeadPage extends Annotations {

	public CreateLeadPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCName;
	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastname;
	@FindBy(name = "smallSubmit")
	WebElement eleSubmit;

	public CreateLeadPage typeCompanyName(String Cname) {
		type(eleCName, Cname);
		return this;
	}

	public CreateLeadPage typeFirstName(String fname) {
		type(eleFirstName, fname);
		return this;
	}

	public CreateLeadPage typeLastName(String lname) {
		type(eleLastname, lname);
		return this;
	}

	public ViewLeadsPage submitCreateLead() {
		click(eleSubmit);
		return new ViewLeadsPage();
	}
}
