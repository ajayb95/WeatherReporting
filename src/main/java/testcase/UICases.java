package testcase;

import org.testng.annotations.Test;

import annotations.Annotations;
import pages.HomePage;

public class UICases extends Annotations{
	
	@Test
	public void TC001() {
		new HomePage().goToWeather().searchCity("Mangalore").selectCity().expandCityDetail().getTemp();
	}
}
