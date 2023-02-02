/**
 * 
 */
package com.EA.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.EA.actiondriver.Action;
import com.EA.base.BaseClass;

public class RegisterPage extends BaseClass {

	Action action = new Action();

	public void register() {
		driver.get().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dddddddddd");

		JavascriptExecutor jse = (JavascriptExecutor) driver.get();
		jse.executeScript("document.getElementsByClassName('signup-btn')[0].click();");

	}

	public void name() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element = driver.get().findElement(By.id("fullName"));
		element.sendKeys("JavaTpoint");

	}

	public void submit() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element1 = driver.get().findElement(By.xpath("//button[@type='submit']"));
		element1.click();
	}
}
