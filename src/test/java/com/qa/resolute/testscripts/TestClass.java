package com.qa.resolute.testscripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.resolute.pages.EmployeePage;
import com.qa.resolute.pages.LoginPage;
import com.qa.resolute.pages.StudentPage;
import com.qa.resolute.utilities.ExcelUtility;

public class TestClass extends TestBase{
	
	LoginPage login;
	StudentPage std;
	EmployeePage emp;
	
	@Test(priority=1,description="Login with valid Username and valid Password")
	public void loginPageverification1 () throws IOException, InterruptedException {
		login = new LoginPage(driver);
		String email=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",0);
		String password= ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",0);
	
		login.setEmail(email);
		
	login.setPassword(password);
	Thread.sleep(3000);
	login.clicklogin();
	Thread.sleep(5000);
	boolean dashtext = login.assertdash();
	Assert.assertTrue(dashtext);
	Thread.sleep(5000);
	
	}
	@Test(priority=2,description="Click on Manage Student Button")
	public void managestudentPageVerification() throws InterruptedException {
		std = new StudentPage(driver);
		Thread.sleep(5000);
		std.clickManageStudent();
		boolean dashtext = std.assertdash();
		Assert.assertTrue(dashtext);
	}
	@Test(priority=3,description="Click on Add student using Form button")
	public void addstudentbuttonVerification() throws InterruptedException {
		std = new StudentPage(driver);
		Thread.sleep(5000);
		std.clickAddStudent();
		boolean isDetailsPresent=std.addStudentDetailsPresent();
		Assert.assertTrue(isDetailsPresent);
	}
	
	@Test(priority=4,description="Add Student Details")
	public void addstudentDetailsVerification() throws InterruptedException, IOException {
		std = new StudentPage(driver);
		Thread.sleep(5000);
		String admissionnum=ExcelUtility.getNumericData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String firstname= ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String lastname=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String fathername= ExcelUtility.getCellData(0,3,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String mobilenum=ExcelUtility.getNumericData(0,4,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String dob= ExcelUtility.getNumericData(0,11,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String address=ExcelUtility.getCellData(0,6,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String studentid= ExcelUtility.getNumericData(0,7,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String admissiondate=ExcelUtility.getNumericData(0,8,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String mothername= ExcelUtility.getCellData(0,9,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		String mothermobile=ExcelUtility.getNumericData(0,10,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",1);
		std.setAdmissionno(admissionnum);
		std.strFirstname(firstname);
		std.strLastname(lastname);
		Thread.sleep(2000);
		std.strFathername(fathername);
		Thread.sleep(2000);
		std.clickClass();
		Thread.sleep(2000);
		std.clickDivision();
		Thread.sleep(2000);
		std.clickGender();
		Thread.sleep(2000);
		std.strMobileNum(mobilenum);
		Thread.sleep(2000);
		std.clickBusNumber();
		Thread.sleep(2000);
		std.strDob(dob);
		std.clickPaymentStatus();
		Thread.sleep(2000);
		std.clickRegistered();
		Thread.sleep(2000);
		std.clickArea();
		Thread.sleep(2000);
		std.strAddress(address);
		std.strStdId(studentid);
		Thread.sleep(2000);
		std.clickAdmissionstatus();
		Thread.sleep(2000);
		std.strAdmissionDate(admissiondate);
		std.strMotherName(mothername);
		std.strMotherMobileNum(mothermobile);
		Thread.sleep(2000);
		std.clickHostel();
		Thread.sleep(2000);
		
		std.clickAddStudentDetails();
		Thread.sleep(5000);
		String error = std.errorDisplay();
		Assert.assertEquals(false, error);
		
		
	}
	
	@Test(priority=5,description="Click on Manage Licenses Button")
	public void managelicensesbuttonVerification() throws InterruptedException, IOException {
		emp= new EmployeePage(driver);
		Thread.sleep(2000);
		emp.clickManageLicense();
		Thread.sleep(1000);
		boolean dashtext = emp.assertdash();
		Assert.assertTrue(dashtext);
	
	}
	@Test(priority=6,description="Click on Add License Button")
	public void addlicensebuttonVerification() throws InterruptedException {
		emp= new EmployeePage(driver);
		Thread.sleep(2000);
		emp.clickAddLicensebutton();
		Thread.sleep(5000);
		boolean detailspage = emp.assertdetails();
		Assert.assertTrue(detailspage);
	
	}
	
	@Test(priority=7,description="Add Employee Details")
	public void addEmpDetailsVerification() throws InterruptedException, IOException {
		emp= new EmployeePage(driver);
		login = new LoginPage(driver);
		Thread.sleep(2000);
		String empid=ExcelUtility.getNumericData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String firstname= ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String lastname= ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String mobilenum=ExcelUtility.getNumericData(0,3,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String busnum=ExcelUtility.getNumericData(0,4,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String email= ExcelUtility.getCellData(0,5,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String password= ExcelUtility.getCellData(0,6,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",2);
		String photo="D:\\GROUP2\\Facegenie\\src\\main\\resources\\upload\\photo.png";
		String idcard="D:\\GROUP2\\Facegenie\\src\\main\\resources\\upload\\id.png";
		emp.setEmployeeId(empid);
		emp.strFirstname(firstname);
		emp.strLastname(lastname);
		emp.strPhoneNum(mobilenum);
		emp.strBusNum(busnum);
		Thread.sleep(2000);
		emp.setEmail(email);
		emp.setPassword(password);

		Thread.sleep(3000);
		emp.uploadphoto(photo);
		Thread.sleep(2000);
		emp.uploadIdCard(idcard);
		Thread.sleep(2000);
		emp.clickSubmitButton();
		
		String email1=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",0);
		String password1= ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx",0);
	
		login.setEmail(email1);
		
	login.setPassword(password1);
	Thread.sleep(3000);
	login.clicklogin();
	Thread.sleep(5000);
	emp.clickManageLicense();
	Thread.sleep(1000);
	boolean url = emp.assertloginpage();
	Assert.assertTrue(url);
	}
}
