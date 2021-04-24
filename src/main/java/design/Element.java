package design;

import org.openqa.selenium.WebElement;

public interface Element {
	public void sendKeys(WebElement wb,String input);
	public void click(WebElement wb);
	public WebElement findElement(String type,String loc);
	public String getText(WebElement wb);
}
