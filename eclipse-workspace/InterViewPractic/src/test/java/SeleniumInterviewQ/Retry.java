package SeleniumInterviewQ;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int retry = 0;
	private static final int maxretry = 3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		if (retry < maxretry) {
			retry++;
			return true;
		}
		return false;
	}

}
