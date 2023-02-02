/**
 * 
 */
package com.EA.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.EA.actiondriver.Action;
import com.EA.base.BaseClass;
import com.EA.pageobjects.RegisterPage;

/**
 *
 */
public class HomePageTest extends BaseClass {

	// @Parameters("browser")
	@Test(priority = 1)
	public void setup() {
		String browser = "chrome";
		launchApp(browser);
		driver.get().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void clickregister() {
		RegisterPage Lin = new RegisterPage();
		Lin.register();

	}

	@Test(priority = 3)
	public void addname() {
		RegisterPage Lin = new RegisterPage();
		Lin.name();
	}

	@Test(priority = 4)
	public void submit() {
		RegisterPage Lin = new RegisterPage();
		Lin.submit();
	}

}
