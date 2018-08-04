package testngleads;



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
  public  String[][] getData() {
	  String[][] data = new String[2][3];
	  data[0][0] = "TCS";
	  data[0][1] = "sandhya";
	  data[0][2] ="Ram";
	  
	  data[1][0] = "TestLeaf";
	  data[1][1] = "Gayatri";
	  data[1][2] ="Krishna";
	return data;
	  
	  
  }

		
}