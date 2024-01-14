package LearningTestNG;

import org.testng.annotations.Test;

public class WorkingWithMultipleTestAnnonation {

	@Test(priority = 1)
	public void register()
	{
		System.out.println("Registration done..");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login done");
	}
	
	@Test(enabled = false)
	public void addToCart()
	{
		System.out.println("Product Added to cart");
	}
	
	@Test(priority = 4)
	public void placeOrder()
	{
		System.out.println("Order Placed..");
	}
	
}
