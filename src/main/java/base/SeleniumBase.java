package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import design.Browser;
import design.Element;

public class SeleniumBase implements Browser, Element {

	public static ChromeDriver dr;
	public static WebDriverWait wt;
	public static int uiCel, uiFar;

	public void sendKeys(WebElement wb, String input) {
		wb.clear();
		wb.sendKeys(input);
	}

	public void click(WebElement wb) {
		wb.click();
	}

	@Override
	public WebElement findElement(String type, String loc) {
		switch (type) {
		case "id":
			return dr.findElement(By.id(loc));
		case "xpath":
			return dr.findElement(By.xpath(loc));
		}
		return null;
	}
	
	@Override
	public void launchBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
}
