package com.demo.qa.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public static Logger logger=Logger.getLogger("BasePage.class");
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		logger.info("BasePage constructor started");
		this.driver=driver;
		PageFactory.initElements(driver,this);
		logger.info("BasePage constructor ends");
	}
	
}
