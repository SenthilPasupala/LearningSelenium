package com.orange.hrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

@Test
public class LoginTest extends BaseTest {
	
	public void loginwithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
		
		LoginPage loginPage = new LoginPage();
		//loginPage.loginintoApplication("Admin", "admin123");
		//loginPage.loginintoApplication(ExcelUtility.getTestData(1, 0), ExcelUtility.getTestData(1, 1));
		loginPage.loginintoApplication(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"));
	}

}
