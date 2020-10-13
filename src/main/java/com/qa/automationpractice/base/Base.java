package com.qa.automationpractice.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

/*
 * This is a base class
 */



public class Base {
	public static String file = "C:\\Selenium\\manishSelenium\\manishSelenium\\AddToCartPorject\\src\\main\\java\\com\\qa\\automationpractice\\base\\config.properties";
	public static Properties prop;
	public static WebDriver driver;
	
	
	public Base() {
		
		try {
			prop= new Properties();
			FileInputStream fp = new FileInputStream(file);
			prop.load(fp);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		
	
	}
	
	public static void initialization() {
	String browser=	prop.getProperty("browser");
	if(browser.contains("chrome")) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}else if(browser.equals("FF")) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	}
	
	
	
}
