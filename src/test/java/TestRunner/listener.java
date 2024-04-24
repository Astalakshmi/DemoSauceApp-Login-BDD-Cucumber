package TestRunner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public  class listener implements ITestListener{
@Override

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	//ITestListener.super.onFinish(context);
	System.out.println("on Finish");
}
@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	System.out.println("on start");
	}
@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	System.out.println(" onTestFailedButWithinSuccessPercentage");
	}
@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	System.out.println("on TestFailedWithTimeout");
	}
@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
	System.out.println("onTestFailure");
	}
@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	System.out.println("onTestSkipped");
	}@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
		//	ITestListener.super.onTestStart(result);
		System.out.println("onTestStart");
		}
	@Override
		public void onTestSuccess(ITestResult result) { 
			// TODO Auto-generated method stub
		//	ITestListener.super.onTestSuccess(result);
		System.out.println("on TestSuccess");
		}
}
