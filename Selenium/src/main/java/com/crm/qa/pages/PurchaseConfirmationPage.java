package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PurchaseConfirmationPage extends TestBase {

	@FindBy(xpath = "//h1[text() ='Thank you for your purchase today!']")
	WebElement title;

	@FindBy(xpath = "//tr[1]//td[2]")
	WebElement idtext;
	

	// Initializing the Page Objects:
	public PurchaseConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String PurchaseIdConfirmation(){
		
		return idtext.getText();
	}
	
	
	

}
