package package1Test;

import org.testng.annotations.Test;

public class priorityTest {

	@Test(priority=-999999999)
	public void test3() {
		System.out.println("test3");

	}

	@Test(priority=-2)
	public void test1() {
		System.out.println("test1");
	}
//
//	@Test(priority=4)
//	public void test2() {
//		System.out.println("test2");
//
//	}
//
//	@Test(priority=3)
//	public void test5() {
//		System.out.println("test5");
//
//	}
//
//	@Test(priority=999999999)
//	public void test4() {
//		System.out.println("test4");
//
//	}

}
