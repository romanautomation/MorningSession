package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void test1(){
		int a=10, b=20;
		
		System.out.println(a+b);
	}
}
