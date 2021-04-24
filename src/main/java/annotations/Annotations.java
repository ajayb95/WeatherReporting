package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import base.SeleniumBase;

public class Annotations extends SeleniumBase {

	@DataProvider(parallel = true)
	public Object[] data() {
		return new Object[] { "Kanpur", "Mangalore", "Pune" };
	}

	@BeforeMethod
	public void before() {
		launchBrowser("chrome", "./drivers/chromedriver.exe");
		maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wt = new WebDriverWait(getDriver(), 20);
		get("https://www.ndtv.com/");
	}

	@AfterMethod
	public void after() {
		//closeBrowser();
	}
}
