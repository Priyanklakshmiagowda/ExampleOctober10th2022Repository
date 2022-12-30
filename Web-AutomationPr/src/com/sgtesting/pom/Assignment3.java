package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage Apage=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigateActitimepage();
		loginActitimepage();
		minimizeflyoutWindow();
		createcustomer();
		deletecustomer();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.dirver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Apage=new ActiTimePage(oBrowser);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateActitimepage()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginActitimepage()
	{
		try
		{
			Apage.getusername().sendKeys("admin");
			Apage.getpassword().sendKeys("manager");
			Apage.getLogin().click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutWindow()
	{
		try
		{
			Apage.getMinimizeFlooutwindow().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try
		{
			Apage.gettask().click();
			Thread.sleep(2000);
			Apage.getAddnew().click();
			Thread.sleep(2000);
			Apage.getcustomer().click();
			Thread.sleep(2000);
			Apage.getncustomername().sendKeys("Sg software");
			Apage.getcreatecustomer().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			Apage.selectcreatedcustomer().click();
			Apage.customerEditButton().click();
			Thread.sleep(2000);
			Apage.deletecustomeraction().click();
			Thread.sleep(2000);
			Apage.deletecustomerbutton().click();
			Thread.sleep(2000);
			Apage.customerdeleteconfirmation().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			Apage.getLogout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();

		}catch(Exception e)
		{
		}
	}

}
