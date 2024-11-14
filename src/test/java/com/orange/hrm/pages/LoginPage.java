package com.orange.hrm.pages;

//import java.time.Duration;
//import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.bidi.log.Log;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class LoginPage {
	//public static WebDriver driver = new ChromeDriver() ;
	
	//Username
	@FindBy(name = "username")
	WebElement userNameTextBox;
	
	//Password
	@FindBy(name = "password")
	WebElement passwordTextBox;
		
	//login button
	@FindBy(xpath = "//button[@type = \"submit\"]")
	WebElement loginBtn;
	
	public LoginPage() {
	PageFactory.initElements(BaseTest.driver, this);
}
	
	Logger log = LogManager.getLogger(LoginPage.class);
	
	public void loginintoApplication(String userName, String password) {
		userNameTextBox.sendKeys(userName);
		log.info("Username is entered in Username text box");
		ExtentReportUtils.addStep("UserName is entered");
				
		passwordTextBox.sendKeys(password);
		log.info("Password is entered in password text box");
		ExtentReportUtils.addStep("Password is entered");
		
		loginBtn.click();
		log.info("Login Button is clicked");
		ExtentReportUtils.addStep("Login Button is clicked");
	}
}
