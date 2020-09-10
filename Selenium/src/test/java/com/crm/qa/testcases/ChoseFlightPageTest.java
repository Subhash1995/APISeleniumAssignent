/*
 * @author Naveen Khunteta
 * 
 */

package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ChoseFlightPage;

public class ChoseFlightPageTest extends TestBase{

	ChoseFlightPage chooseflight ;
	public ChoseFlightPageTest(){
			super();
			
	}
	
	
	@Test(priority=1)
	public void setUp() {
		
	//	initialization() ;
		//driver.get("https://blazedemo.com/reserve.php");
		chooseflight = new ChoseFlightPage();
	}
	
//	@Test(priority=1)
//	public void verifyPageTitle(){
//		String f =chooseflight.ChoseFlightPageTitle() ;
//		Assert.assertEquals(f,"Flights from Paris to London:" );
//	}
//
//	@Test(priority=2)
//	public void verifyPageHeaders(){
//		
//		chooseflight.ChoseFlightPageGridHeader("Choose","Flight #", "Airline", "Departs: Paris", "Arrives: London", "Price");
//		
//	}
	
	@Test(priority=2)
	public void ClickonChooseThisFlightbtn(){
		
		chooseflight.ClickonChooseThisFlightbtn();
	}
	
	
	
}
