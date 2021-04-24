package base;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ThreadLocalImpl {

	public static final ThreadLocal<RemoteWebDriver> localDr=new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver(RemoteWebDriver dr) {
		localDr.set(dr);
	}
	
	public RemoteWebDriver getDriver() {
		return localDr.get();
	}
}
