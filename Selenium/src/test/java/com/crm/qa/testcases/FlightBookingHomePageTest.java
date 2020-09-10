package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FlightBookingHomePage;

public class FlightBookingHomePageTest extends TestBase {
	
	FlightBookingHomePage FlightBook ;
	
	public FlightBookingHomePageTest() {
		//super();
		
	}
	@BeforeTest
	public void setUp() {

		initialization() ;
		 FlightBook = new FlightBookingHomePage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle(){
		String f =FlightBook.verifyHomePageTitle() ;
		Assert.assertEquals(f,"Welcome to the Simple Travel Agency!" );
	}
	
	@Test(priority=2)
	public void selectDepartureandDestinationcity(){
		
	FlightBook.Selectdeparturecity("Paris");
		FlightBook.Selectdestinationcity("Buenos Aires");
		
		FlightBook.ClickonFindFlights();
	}

}
