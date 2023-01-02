package com.demo.qa.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static Logger logger=Logger.getLogger("BaseTest.class");
	public WebDriver driver;
	Properties testdataprop=null;
	Properties expectedAssertProp=null;
	
	public BaseTest() throws IOException {
		logger.info("BaseTest constructor started");
		testdataprop=new Properties();
		expectedAssertProp=new Properties();
		try {
		FileInputStream file1=new FileInputStream("C:\\Users\\syedm\\eclipse-workspace\\com.demo.qa\\src\\test\\resources\\testdata.properties");
		FileInputStream file2=new FileInputStream("C:\\Users\\syedm\\eclipse-workspace\\com.demo.qa\\src\\test\\resources\\expectedAssertion.properties");
		testdataprop.load(file1);
		expectedAssertProp.load(file2);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		logger.info("BaseTest constructor ends");
	
	}
	@BeforeClass
	public WebDriver getDriver()
	{
		logger.info("getDriver method started");
		String browserName=testdataprop.getProperty("browser.name");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(testdataprop.getProperty("web.url"));
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(testdataprop.getProperty("web.url"));
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Invalid driver manager");
		}
		logger.info("getDriver Method ends");
	
		return driver;
		
	}
}
