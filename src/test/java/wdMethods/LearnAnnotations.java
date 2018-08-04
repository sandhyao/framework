package wdMethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void f() {
	  System.out.println("i am test1");
  }
  @Test
  public void f1() {
	  System.out.println("i am test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am afterSuite");
  }

}
