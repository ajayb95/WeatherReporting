package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.SeleniumBase;

public class Annotations extends SeleniumBase{

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wt = new WebDriverWait(dr, 20);
		dr.get("https://www.ndtv.com/");
	}
	
	@AfterMethod
	public void after() {
		dr.close();
	}
}
