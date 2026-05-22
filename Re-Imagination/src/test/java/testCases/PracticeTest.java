package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

public class PracticeTest {
	
	@Test
	public void test1() throws InterruptedException {
		
		System.out.println("This is test one : Thread = " + Thread.currentThread().getId());
		Assert.assertTrue(true);
		Thread.sleep(1000);	
	}

	@Test @DataProvider(parallel = true)
	public void test2() throws InterruptedException {
		
		System.out.println("This is test two : Thread = " + Thread.currentThread().getId());
		Assert.assertTrue(true);
		Thread.sleep(1000);
	}
	
	@Test
	public void test3() throws InterruptedException {
	
	System.out.println("This is test three : Thread = " + Thread.currentThread().getId());
	Assert.assertTrue(true);
	Thread.sleep(1000);
	}
}
