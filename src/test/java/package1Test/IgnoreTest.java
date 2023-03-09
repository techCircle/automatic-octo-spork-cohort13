package package1Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.*;

import org.testng.annotations.Test;

public class IgnoreTest {

	String message = "Juret Aka";
	String name = "Rimer";

	@Test(enabled = true, groups = "fj")
	public void testPrint() {

		System.out.println(message);

	}

	@Test(groups = "smokeTestSuite")
	public void testPrint2() {
		System.out.println("Second Test -- " + name);
	}

}
