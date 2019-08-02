package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	SoftAssert softAssert = new SoftAssert();
	
	
	@Test
	public void test1(){
		
		SoftAssert softAssert1 = new SoftAssert();
		
		System.out.println("Open the browser");
	    Assert.assertEquals(true, true, "Open the browser");
	    
	    System.out.println("Enter the username");
	    System.out.println("Enter the password");
	    System.out.println("Click on the OK button");
	   Assert.assertEquals(true, true, "Get valid login");

	   System.out.println("Go to the home page");
	   softAssert1.assertEquals(true, false, "Verified the home page");
	   
	   System.out.println("Go to the patient listing");
	   
	   Assert.assertEquals(true, true, "Patient listing not found");
	   
	   softAssert1.assertAll();
	   
	}
	
	@Test
	public void test2(){
		
		SoftAssert softAssert2 = new SoftAssert();
		
		System.out.println("Device enetered");
		softAssert2.assertEquals(true, false, "Device not enetered");
		
		softAssert2.assertAll();
	}

}
