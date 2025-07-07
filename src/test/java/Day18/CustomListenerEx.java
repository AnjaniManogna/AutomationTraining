package Day18;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListenerEx implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed "+result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed "+result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped "+result);
    }
}
