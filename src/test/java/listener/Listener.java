package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
	}

	@Override
	public  void onTestFailure(ITestResult result) {
		System.out.println("Failed");
	}

}
