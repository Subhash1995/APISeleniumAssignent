package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FillDetailsPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//input[@id='inputName']")
	WebElement name; 
	
	@FindBy(xpath="//input[@id='address']")
	WebElement address;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	WebElement purchaseflightbtn;
	
	
	//Initializing the Page Objects:
	public FillDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void filltheDetails(String s1 ,String s2){
		name.sendKeys(s1);
		address.sendKeys(s2);
		
	}
	
	public void clickOnPurchaseFlightBtn(){
		purchaseflightbtn.click();
	}
	
}
