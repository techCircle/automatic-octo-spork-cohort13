package package1Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	
	
	
	@Test
	@Parameters("myName")
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is : " + myName );
	}
	
	@Test
	@Parameters("carModel")
	public void parameterTestCar(String carModel) {
		System.out.println("my car model is: " + carModel);
	}
	
	
	
	
	
	
}
