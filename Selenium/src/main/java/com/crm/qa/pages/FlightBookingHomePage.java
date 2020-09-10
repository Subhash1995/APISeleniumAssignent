package com.crm.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

 public class FlightBookingHomePage extends TestBase {
	 
    @FindBy(xpath = "//h1[text() = 'Welcome to the Simple Travel Agency!']")
	WebElement Homepagetitle;
	
    @FindBy(xpath = "//select[@class= 'form-inline' and @name ='fromPort']")
  	WebElement departurecitydrpdown;
    
    
    
    @FindBy(xpath = "//select[@class= 'form-inline' and @name ='toPort']")
  	WebElement destinationcitydrpdown;
    
  //  Select select1 = new Select(destinationcitydrpdown);
  
    
    @FindBy(xpath = "//input[@class= 'btn btn-primary']")
  	WebElement findflightsbtn;
    
    
    public FlightBookingHomePage() {
		PageFactory.initElements(driver, this);
	}
    
    
    public String verifyHomePageTitle(){
    	
    String s =	Homepagetitle.getText();
   // System.out.println(s);
		return s;
	}
    
    public void Selectdeparturecity(String depcity){
    	Select select = new Select(departurecitydrpdown);
    	select.selectByVisibleText(depcity);
	}
    
    public void Selectdestinationcity(String destcity){
    	Select select = new Select(destinationcitydrpdown);
    	select.selectByVisibleText(destcity);
	}
    
    
    public void ClickonFindFlights(){
    	findflightsbtn.click();
		
	}
    
  
 }