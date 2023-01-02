package com.demo.qa.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.demo.qa.page.ElementsPage;

public class ElementsTest extends BaseTest {
	public static Logger logger=Logger.getLogger("ElementsTest.class");
	public ElementsTest() throws IOException {
		super();
	}

	ElementsPage elePage=null;
	
	/*@Test(priority=1)
	public void elementsTest()
	{
		logger.info("elementsTest method started");
		elePage=new ElementsPage(driver);
		elePage.clickOnElements();
		logger.info("elementsTest method started");
	}*/
	
	@Test(priority=1)
	public void testRegistrationForm()
	{
		elePage=new ElementsPage(driver);
		elePage.clickOnFirstNameText();
		elePage.setFirstName();
		elePage.clickOnLastText();
		elePage.setLatName();
		elePage.clicOnAddress();
		elePage.setAddress();
		elePage.clickOnEmailText();
		elePage.setEmail();
		elePage.clickOnPhoneText();
		elePage.setPhone();
		elePage.clickOnGender();
		elePage.clickOnHobbies();
	}

}
