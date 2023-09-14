package com.qa.resolute.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	
	WebDriver driver;
	
	public EmployeePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[text()='Manage Licenses']")
	private WebElement managemp;
	
	@FindBy(xpath="//p[text()='Dashboard/ License']")
	private WebElement dashboard;
	
	@FindBy(xpath="//p[text()='Add License']")
	private WebElement addlicensebutton;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation3 MuiGrid-root css-137m1uk']")
	private WebElement assertclass;
	
	@FindBy(xpath="//input[@name='empId']")
	private WebElement empid;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement phonenum;
	
	@FindBy(xpath="//input[@name='busNo']")
	private WebElement busnum;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='empPhotos']")
	private WebElement photo;
	
	@FindBy(xpath="//input[@id='adharphotos']")
	private WebElement idcard;
	
	@FindBy(xpath="//p[text()='Submit Details']")
	private WebElement submit;
	
	
	public void clickManageLicense() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		managemp.click();
	}

	public void clickAddLicensebutton() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		addlicensebutton.click();
	}
	
	public void setEmployeeId(String strempid) {
		empid.sendKeys(strempid);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}	
	public void strFirstname(String strfirst) {	
		firstname.sendKeys(strfirst);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	public void strLastname(String strlast) {
		lastname.sendKeys(strlast);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void strPhoneNum(String strphone) {
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,1000)");
		phonenum.sendKeys(strphone);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void strBusNum(String strbus) {
		busnum.sendKeys(strbus);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void setEmail(String strEmail) {
	email.sendKeys(strEmail);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public void uploadphoto(String strPhoto) {
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		photo.sendKeys(strPhoto);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public void uploadIdCard(String strId) {
		idcard.sendKeys(strId);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public void clickSubmitButton() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		submit.click();
	}
	
	public boolean assertdash() {
		boolean dashtext=dashboard.isDisplayed();
		return dashtext;
	}
	public boolean assertdetails() {
		boolean detailsclass=assertclass.isDisplayed();
		return detailsclass;
	}
	public boolean assertloginpage() {
		boolean url = driver.getCurrentUrl().contains("facegenie-ams-school.web.app");
		return url;
	}
}
