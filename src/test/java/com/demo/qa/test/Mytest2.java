package com.demo.qa.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.demo.qa.page.ElementsPage;

public class Mytest2 extends BaseTest{
	public static Logger logger=Logger.getLogger("ElementsTest.class");
	public Mytest2() throws IOException {
		super();
	}
	@Test(priority=1)
	public void testRegistrationForm()
	{
		ElementsPage elePage=new ElementsPage(driver);
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
