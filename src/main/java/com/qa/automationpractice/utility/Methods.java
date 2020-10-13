package com.qa.automationpractice.utility;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.automationpractice.base.Base;

public class Methods extends Base {
	
	Actions actions ;
	
	public void performeMouseHower(WebElement element , WebDriver driver) {
		actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void setText(String text, WebElement element) {
		element.sendKeys(text);
	}
	
	public void selectByVisibleText(WebElement selectsize, String text) {
		Select s = new Select(selectsize);
		s.selectByVisibleText(text);
		
	}
	
	public void clickUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", element);
		
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public boolean validateText(WebDriver driver, WebElement element, String expectedtext) {
		
		String observedtext = element.getText();
		if(observedtext.equals(expectedtext)) {
			return true;
		}
		return false;
	}

}
