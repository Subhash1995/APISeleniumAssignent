package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FillDetailsPage;
import com.crm.qa.pages.FlightBookingHomePage;

public class FillDetailsPageTest extends TestBase {

	FillDetailsPage filldetails ;
	
	public FillDetailsPageTest() {
		
	}
	@Test(priority=1)
	public void setUp() {

		//initialization() ;
		//driver.get("https://blazedemo.com/purchase.php");
		filldetails = new FillDetailsPage();
	}

	@Test(priority=2)
	public void fillDetailsOfCustomer(){
		
		filldetails.filltheDetails("subhash", "Amaravathi guntur district AndhraPradesh");	
	}
	
	@Test(priority=3)
	public void navigateToCnfPage() throws InterruptedException{
		
		filldetails.clickOnPurchaseFlightBtn();
		synchronized (driver)
		{
		driver.wait(5000);
		}
	}
	
	
}
