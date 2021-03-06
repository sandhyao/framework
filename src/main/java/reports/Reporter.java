package reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
	public static ExtentReports extent;
	public static ExtentTest suiteTest ,test;
	
	public void beginResult() {
		String workingDir = System.getProperty("user.dir");
		ExtentHtmlReporter html = new ExtentHtmlReporter(workingDir+"/reports/result.html");
		html.setAppendExisting(true);		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	
	public ExtentTest startTest(String testCaseName, String testDescription) {
		 suiteTest = extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}

	
	public ExtentTest startTestIteration(String iteration, String authorName, String category) {	
		 test = suiteTest.createNode("Leads");
		 test.assignAuthor(authorName);
		 test.assignCategory(category);
		return test;
	}

	public void reportStep(String desc,String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc);
		}
	}

	// This method create the html report finally
	public void endResult() {
		extent.flush();
	}

}

