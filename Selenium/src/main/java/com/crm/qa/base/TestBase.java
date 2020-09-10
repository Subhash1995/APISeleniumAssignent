package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver 	;
	public static Properties prop ;
	

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.getMessage();
			//System.out.println(e);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	public static void initialization(){
		//TestBase tes =new TestBase();s
		//prop = new Properties();
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/Raju/Desktop/subhash/chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:/Users/Raju/Desktop/subhash/chromedriver1.exe");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
}
	
	
	

