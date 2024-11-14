package com.test;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest {
ChromeDriver driver;
	
	@Test(priority = 1)
	public void login() {
		//open chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPASUPALA\\Downloads\\Udumey_Selenium\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		//launch Orange HRM
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//Enter PAssword
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Click on Login button
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		}
	@Test(priority = 2)
	public void testAdmin() {
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	boolean isDisplayed = driver.findElement(By.xpath("//h5[text() = 'System Users']")).isDisplayed();
	Assert.assertTrue(isDisplayed);
  
	}
	@Test(priority = 3)
	public void testlogout() {
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
