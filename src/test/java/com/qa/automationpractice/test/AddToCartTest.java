package com.qa.automationpractice.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.Base;
import com.qa.automationpractice.pages.PageObjects;

public class AddToCartTest extends Base {
	public AddToCartTest() {
		super();
	}
	
	PageObjects page=new PageObjects();
	
	@BeforeMethod
	public void setUP() {
		initialization();
	}
	
	@Test
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToCart());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}
