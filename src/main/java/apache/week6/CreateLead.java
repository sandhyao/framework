package apache.week6;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngleads.Annotations;

public class CreateLead extends Annotations{
	@Test(dataProvider="fetchData")
	public void createLeasMEthod(String cname, String fname, String lname) {


		click(locateElement("linktext","Create Lead"));

		type(locateElement("id","createLeadForm_companyName"),cname);

		type(locateElement("id","createLeadForm_firstName"),fname);			

		type(locateElement("id","createLeadForm_lastName"),lname);


		type(locateElement("id","createLeadForm_industryEnumId"),"createLeadForm_industryEnumId");
		click(locateElement("class","smallSubmit"));
	}
	@DataProvider(name="fetchData")
  public  Object[][] getData() throws IOException {
		ReadExcelobject excel=new ReadExcelobject();
	return excel.readexcelobj("CreateLead");
	
	  
	  
  }

	
}