package TestNG;

import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut=1)
	public void test1(){
		System.out.println("test1");
	}
}
