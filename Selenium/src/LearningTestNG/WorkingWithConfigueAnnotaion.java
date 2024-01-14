package LearningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithConfigueAnnotaion {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Establish the connection to server");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Establish the connection to DB");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch the browser");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login");
	}

	@Test
	public void testCase1() {
		System.out.println("Test Case 1 Pass..");
	}

//	@Test
//	public void testCase2() {
//		System.out.println("Test Case 2 Pass..");
//	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Close the browser");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Disconnect from DB");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Disconnect from server");
	}

}
