package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.SeleniumBase;

public class WeatherPage extends SeleniumBase{
	String city;
	
	public WeatherPage searchCity(String city) {
		this.city=city;
		wt.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
		dr.findElementById("searchBox").sendKeys(city);
		return this;
	}
	
	public WeatherPage selectCity() {
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(city))).click();
		return this;
	}
	
	public WeatherPage expandCityDetail() {
		WebElement cty = wt.until(ExpectedConditions
				.visibilityOf(dr.findElement(By.xpath("//div[@class='cityText' and text()='"+city+"']"))));
		cty.click();
		return this;
	}
	
	public WeatherPage getTemp() {
		uiCel = Integer.parseInt(dr.findElementByXPath("//b[starts-with(text(),'Temp in Degrees')]").getText().replaceAll("\\D+", ""));
		uiFar = Integer.parseInt(dr.findElementByXPath("//b[starts-with(text(),'Temp in Fahrenheit')]").getText().replaceAll("\\D+", ""));
		System.out.println(uiCel);
		System.out.println(uiFar);
		return this;
	}
}
