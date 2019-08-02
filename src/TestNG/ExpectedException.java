package TestNG;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions=ArithmeticException.class)
	public void test1(){
		System.out.println("test 1");
		int i=9/0;
	}
}
