package LearningTestNG;

import org.testng.annotations.Test;

public class WorkingWithDependsOnMethods {

//	@Test
//	public void bregister()
//	{
//		System.out.println("Registration done..");
//	}
	
	@Test(invocationCount = 5)
	public void login()
	{
		System.out.println("Login done");
	}
	
	
	
}
