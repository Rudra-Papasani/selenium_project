package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions.HomePageActions;
import base.Base;

public class SampleTest extends Base {
	Base base = null;

	@BeforeMethod(alwaysRun = true)
	public void beforeTest() {
		base = new Base();
		base.initialize();
	}

	@Test(priority = 1)
	public void test() {
		HomePageActions.searchFor("Laptop");
		Assert.assertTrue(HomePageActions.searchResultExist());
	}

	@AfterMethod(alwaysRun = true)
	public void afterTest() {

	}

}
