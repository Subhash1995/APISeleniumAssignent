
  
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.PurchaseConfirmationPage;

public class PurchaseConfirmationPageTest extends TestBase{
	PurchaseConfirmationPage confirmation;
	public PurchaseConfirmationPageTest() {
		//super();
	}
	@Test(priority=1)
	public void setUp() {
		//initialization() ;
		confirmation = new PurchaseConfirmationPage();
		//driver.get("https://blazedemo.com/confirmation.php");
	}
	
	@Test(priority=2)
public void purchaseIdVerification() {
//		synchronized (driver)
//		{
//		    driver.wait(5000);
//		}
		boolean d =confirmation.PurchaseIdConfirmation() != null;
		driver.quit();
}
}

