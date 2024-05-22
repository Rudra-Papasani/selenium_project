package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;
import pom.HomePage;

public class HomePageActions {

	public static void searchFor(String item) {
		WebElement searchBox = Base.driver.findElement(By.xpath(HomePage.searchBox));
		searchBox.sendKeys(item);
		WebElement searchButton = Base.driver.findElement(By.xpath(HomePage.searchButton));
		searchButton.click();
	}

	public static boolean searchResultExist() {
		try {
			Base.driver.findElement(By.xpath(HomePage.searchResult));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
