package com.demo.qa.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ElementsPage extends BasePage {
	public static Logger logger=Logger.getLogger("ElementsPage.class");
	
	@FindBy(xpath="//h5[text()='Elements']")
	protected WebElement btnElements;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	protected WebElement txtFirstName;
	

	@FindBy(xpath="//input[@placeholder='Last Name']")
	protected WebElement txtLastName;
	
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-valid ng-touched']")
	protected WebElement txtAddress;
	
	@FindBy(xpath="//input[@type='email']")
	protected WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='tel']")
	protected WebElement txtPhone;
	
	@FindBy(xpath="//input[@value='Male']")
	protected WebElement rdoGender;
	
	@FindBy(xpath="//input[@value='Cricket']")
	protected WebElement chkHobies;
	
	@FindBy(xpath="//div[@id='msdd']")
	protected WebElement txtlanguages;
	
	

	public ElementsPage(WebDriver driver) {
		super(driver);
		logger.info("ElementsPage Constructor started");
		logger.info("ElementsPage Constructor started");
		
	}
	

	public void clickOnFirstNameText()
	{
		logger.info("clickOnFirstNameText method started");
		txtFirstName.click();
		logger.info("clickOnFirstNameText method started");
	}
	
	public void setFirstName() {
		txtFirstName.sendKeys("Syed");
	}
	
	public void clickOnLastText()
	{
		logger.info("clickOnFirstNameText method started");
		txtLastName.click();
		logger.info("clickOnFirstNameText method started");
	}
	
	public void setLatName() {
		txtLastName.sendKeys("Azmal");
	}
	
	public void clicOnAddress()
	{
		logger.info("clickOnFirstNameText method started");
		txtAddress.click();
		logger.info("clickOnFirstNameText method started");
	}
	
	public void setAddress() {
		txtAddress.sendKeys("Bellampalli,Mancherial,Telangana");
	}
	
	public void clickOnEmailText()
	{
		logger.info("clickOnFirstNameText method started");
		txtEmail.click();
		logger.info("clickOnFirstNameText method started");
	}
	
	public void setEmail() {
		txtEmail.sendKeys("Azmal@gmail.com");
	}
	
	public void clickOnPhoneText()
	{
		logger.info("clickOnFirstNameText method started");
		txtPhone.click();
		logger.info("clickOnFirstNameText method started");
	}
	
	public void setPhone() {
		txtPhone.sendKeys("9701195395");
	}
	
	
	public void clickOnGender()
	{
		logger.info("clickOnFirstNameText method started");
		rdoGender.click();
		logger.info("clickOnFirstNameText method started");
	}
	
	
	public void clickOnHobbies()
	{
		logger.info("clickOnFirstNameText method started");
		chkHobies.click();
		logger.info("clickOnFirstNameText method started");
	}
	

}
