package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1, enabled=true)
	public void test11(){
		
		
		System.out.println("test 1");
		throw new SkipException("not yet ready");
	}
	
	@Test(priority=2)
	public void etest22(){
		System.out.println("test 2");
	}
	
}
