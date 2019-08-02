package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethods {


	@Test
	public void test1(){
		System.out.println("test1");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="test1")
	public void test2(){
		System.out.println("test2");
	}
}
