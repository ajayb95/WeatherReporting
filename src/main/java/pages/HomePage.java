package pages;

import base.SeleniumBase;

public class HomePage extends SeleniumBase{
	
	public HomePage expandMenu() {
		dr.findElementById("h_sub_menu").click();
		return this;
	}
	
	public HomePage clickWeather() {
		dr.findElementByLinkText("WEATHER").click();
		return this;
	}
	
	public WeatherPage goToWeather() {
		expandMenu().clickWeather();
		return new WeatherPage();
	}
}
