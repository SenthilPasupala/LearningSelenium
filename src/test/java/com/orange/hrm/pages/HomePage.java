package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminlink;
	
	@FindBy(xpath = "//img[@alt=\"profile picture\"]" )
	WebElement profilePicture;
	
	@FindBy(linkText = "Logout")
	WebElement LogoutLink;
	
	public HomePage() {
		//HomePage objHomePage = new HomePage();
		//driver = new ChromeDriver()
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	Logger log = LogManager.getLogger(HomePage.class);
	
	public void clickonAdminlink() {
		adminlink.click();
		log.info("Admin link is clicked");
		
	}
	
	public void logoutFromApplication() {
		profilePicture.click();
		log.info("Profile picture is clicked");
		ExtentReportUtils.addStep("Profile picture Image is clicked");
		
		//System.out.println("Testing profile picture");
		LogoutLink.click();
		log.info("Logout button is clicked");
		ExtentReportUtils.addStep("Logout link is Clicked");
	}

}
