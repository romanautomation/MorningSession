package TestNG;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="test")
	public void test1(){
		System.out.println("test 1");
	}
	
	@Test(groups="test")
	public void test2(){
		System.out.println("test 2");
		
	}
	
	@Test(groups="logo")
	public void printLogo1(){
		System.out.println("Logo 1");
	}
	
	@Test(groups="logo")
	public void printLogo2(){
		System.out.println("Logo 2");
	}

}
