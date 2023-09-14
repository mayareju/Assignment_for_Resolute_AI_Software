package com.qa.resolute.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//p[text()='Dashboard/ Home']")
	private WebElement dashboard;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	public void setEmail(String strEmail) {
		email.clear();
	email.sendKeys(strEmail);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void setPassword(String strPassword) {
		password.clear();
		password.sendKeys(strPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	public void clicklogin() {
		login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public void clicklogout() {
		logout.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public boolean assertdash() {
		boolean dashtext=dashboard.isDisplayed();
		return dashtext;
	}
	
}
