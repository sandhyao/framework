package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngleads.Annotations;

public class TC001TestCase extends Annotations {
	
	
	@BeforeTest
	public void setValues() {
		testName = "CreateLead";
		testDesc = "Create Lead for Mandate values";
		moduleName = "Leads";
		author = "Testleaf";
		category = "Smoke";
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void testCreateLead(String compName, String fName, String lName) {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(compName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.submitCreateLead()
		.verifyLeadFName(fName);
	}

}
