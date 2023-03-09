package package1Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) { // 2
		System.out.println("onTestStart");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");

	}

	@Override
	public void onTestFailure(ITestResult result) { // 3
		System.out.println("onTestFailure");

	}

	@Override
	public void onTestSkipped(ITestResult result) { // 4
		System.out.println("onTestSkipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) { // 5
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");

	}

	@Override
	public void onStart(ITestContext context) { // 1
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");

	}

}
