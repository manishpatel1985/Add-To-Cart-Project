package com.qa.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.Base;
import com.qa.automationpractice.utility.Methods;

public class PageObjects extends Base {
	Methods methods = new Methods();
	
	public PageObjects() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//img[@class='replace-2x img-responsive']")
	WebElement slectimage;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line hovered']//span[contains(text(),'More')]")
	WebElement morebtn;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	WebElement quantity;
	
	@FindBy(xpath="//select[@id='group_1']")
	WebElement selectsize;
	
	@FindBy(xpath="//button[@name='Submit']")
	WebElement addtocartbtn;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement btncheckout;
	
	@FindBy(xpath="//div[@class='shopping_cart']//span[@class='ajax_cart_quantity'][contains(text(),'3')]")
	WebElement carttext;
	
	
	
	public boolean validateAddToCart() {
		methods.performeMouseHower(slectimage, driver);
		methods.click(morebtn);
		methods.clear(quantity);
		methods.setText("3", quantity);
		methods.selectByVisibleText(selectsize, "M");
		methods.click(addtocartbtn);
		methods.clickUsingJavaScriptExecutor(btncheckout, driver);
		methods.refresh();
		methods.validateText(driver, carttext, "3");
		return methods.validateText(driver, carttext, "3");
		
		
		}
	

}
