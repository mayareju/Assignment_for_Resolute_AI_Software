package com.qa.resolute.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

WebDriver driver=null;
	
	public static Properties prop = null;
	
	@BeforeClass
	public void onSetup() throws IOException, InterruptedException {
		prop = new Properties();
		FileInputStream pFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop.load(pFile);
		
		driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void closepage() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}
}
