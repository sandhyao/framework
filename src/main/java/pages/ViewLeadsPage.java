package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngleads.Annotations;

public class ViewLeadsPage extends Annotations {

	public ViewLeadsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp") WebElement viewLeadFirstName;
	
	public ViewLeadsPage verifyLeadFName(String data) {
		verifyExactText(viewLeadFirstName, data);
		return this;
	}
}
