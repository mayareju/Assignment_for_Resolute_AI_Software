package com.qa.resolute.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StudentPage {

	WebDriver driver;
	
	public StudentPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[text()='Manage Student']")
	private WebElement managstd;
	
	@FindBy(xpath="//p[text()='Dashboard/ Manage Student']")
	private WebElement dashboard;

	@FindBy(xpath="//p[text()='Add student using Form']")
	private WebElement addstd;	
	
	@FindBy(xpath="//div[@class='MuiGrid-root css-97e1ul']")
	private WebElement addstddetails;
	
	@FindBy(id=":rc:")
	private WebElement admissionno;
	
	@FindBy(id=":rd:")
	private WebElement firstname;
	
	@FindBy(id=":re:")
	private WebElement lastname;
	
	@FindBy(id=":rf:")
	private WebElement fathername;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[5]")
	private WebElement classdrop;
	
	@FindBy(xpath="//li[@data-value='CLASS 1']")
	private WebElement classdropvalue;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[6]")
	private WebElement division;
	
	@FindBy(xpath="//li[@data-value='A']")
	private WebElement divisionvalue;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[7]")
	private WebElement gender;
	
	@FindBy(xpath="//li[@data-value='F']")
	private WebElement gendervalue;
	
	@FindBy(id=":rg:")
	private WebElement mobile;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[8]")
	private WebElement busno;
	
	@FindBy(xpath="//li[@data-value='004']")
	private WebElement busnovalue;
	
	@FindBy(xpath="//input[@name='dateOfBirth']")
	private WebElement dob;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[9]")
	private WebElement payment;
	
	@FindBy(xpath="//li[@data-value='Yes']")
	private WebElement paymentvalue;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[10]")
	private WebElement registered;
	
	@FindBy(xpath="//li[@data-value='Yes']")
	private WebElement registeredvalue;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[11]")
	private WebElement area;
	
	@FindBy(xpath="//em[text()='None']")
	private WebElement areavalue;
	
	@FindBy(id=":ri:")
	private WebElement address;
	
	@FindBy(id=":rj:")
	private WebElement stdid;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[12]")
	private WebElement admissionstatus;
	
	@FindBy(xpath="//li[@data-value='Admitted']")
	private WebElement admissionstatusvalue;
	
	@FindBy(xpath="//input[@name='admissionDate']")
	private WebElement admissiondate;
	
	@FindBy(id=":rl:")
	private WebElement mothername;
	
	@FindBy(id=":rm:")
	private WebElement mothermobile;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[13]")
	private WebElement hostel;
	
	@FindBy(xpath="//li[@data-value='DaysScholar']")
	private WebElement hostelvalue;
	
	@FindBy(xpath="//p[text()='Add Student Details']")
	private WebElement addstdbutton;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation3 MuiGrid-root MuiGrid-item css-5o9k2t']")
	private WebElement fullclasserror;
	
	public void clickManageStudent() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		managstd.click();
	}
	
	public void clickAddStudent() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		addstd.click();
	}	
	
	public void setAdmissionno(String stradminum) {
		admissionno.sendKeys(stradminum);
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
	
	public void strFathername(String strFather) {
		fathername.sendKeys(strFather);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	public void clickClass() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		classdrop.click();
		classdropvalue.click();
		
	}	
	public void clickDivision() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		division.click();
		divisionvalue.click();
		
	}	
	
	public void clickGender() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		gender.click();
		gendervalue.click();
	}	
	
	public void strMobileNum(String strMobile) {
		mobile.sendKeys(strMobile);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	public void clickBusNumber() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		busno.click();
		busnovalue.click();
	}	
	
	public void strDob(String strdob) {
		dob.clear();
		dob.sendKeys(strdob);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void clickPaymentStatus() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,600)");
		payment.click();
		paymentvalue.click();
	}	
	
	public void clickRegistered() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		registered.click();
		registeredvalue.click();
	}
	public void clickArea() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		area.click();
		areavalue.click();

	}
	
	public void strAddress(String straddress) {
		address.sendKeys(straddress);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void strStdId(String strStudentid) {
		stdid.sendKeys(strStudentid);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	public void clickAdmissionstatus() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		admissionstatus.click();
		admissionstatusvalue.click();
	}
	public void strAdmissionDate(String stradmisn) {
		admissiondate.sendKeys(stradmisn);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void strMotherName(String strmothername) {
		mothername.sendKeys(strmothername);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void strMotherMobileNum(String strMotherMobile) {
		mothermobile.sendKeys(strMotherMobile);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	public void clickHostel() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		hostel.click();
		hostelvalue.click();
	}
	
	public void clickAddStudentDetails() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		addstdbutton.click();
	}
	
	public boolean assertdash() {
		boolean dashtext=dashboard.isDisplayed();
		return dashtext;
	}
	
	public boolean addStudentDetailsPresent() {
		boolean addstd=addstddetails.isDisplayed();
		return addstd;
	}
	public String getErrorMsg() {
		String error = area.getAttribute("validationMessage");
		return error;
	}
	public String errorDisplay() {
		String text=fullclasserror.getAttribute("validationMessage");
		return text;
	}
}

