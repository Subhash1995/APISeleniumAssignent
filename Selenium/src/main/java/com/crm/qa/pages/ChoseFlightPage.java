package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class ChoseFlightPage extends TestBase{

	 @FindBy(xpath = "//h3")
		WebElement choseflightpagetitle;
		
	 @FindBy(xpath = "//tr//th[1]")
		WebElement choseflightpagegridheader1;
	 @FindBy(xpath = "//tr//th[2]")
		WebElement choseflightpagegridheader2;
     @FindBy(xpath = "//tr//th[3]")
	 WebElement choseflightpagegridheader3;
     @FindBy(xpath = "//tr//th[4]")
	 WebElement choseflightpagegridheader4;
     @FindBy(xpath = "//tr//th[5]")
	 WebElement choseflightpagegridheader5;
     @FindBy(xpath = "//tr//th[6]")
	 WebElement choseflightpagegridheader6;
	
     @FindBy(xpath = "//tr[1]//td[1]//input[@value ='Choose This Flight']")
	 WebElement choosethisflightbtn;
	

	    public ChoseFlightPage() {
			PageFactory.initElements(driver, this);
		}
	
	    public String ChoseFlightPageTitle(){
			return choseflightpagetitle.getText();
		}
	    
	    public void ChoseFlightPageGridHeader(String h1 ,String h2,String h3,String h4,String h5,String h6){
	    	
	    	Assert.assertEquals(choseflightpagegridheader1.getText(), h1);
	    	Assert.assertEquals(choseflightpagegridheader2.getText(), h2);
	    	Assert.assertEquals(choseflightpagegridheader3.getText(), h3);
	    	Assert.assertEquals(choseflightpagegridheader4.getText(), h4);
	    	Assert.assertEquals(choseflightpagegridheader5.getText(), h5);
	    	Assert.assertEquals(choseflightpagegridheader6.getText(), h6);
	    	
		}
	    
	    public void ClickonChooseThisFlightbtn(){
	    	choosethisflightbtn.click();
			
		}
	    
	    
}
