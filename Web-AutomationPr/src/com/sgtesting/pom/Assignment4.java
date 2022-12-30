package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage tpage=null;

	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeflyoutwind();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver,chrome.driver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			tpage=new ActiTimePage(oBrowser);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
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
	private static void login()
	{
		try
		{
			tpage.getusername().sendKeys("admin");
			tpage.getpassword().sendKeys("manager");
			tpage.getLogin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwind()
	{
		try
		{
			tpage.getMinimizeFlooutwindow().click();
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
			tpage.gettask().click();
			Thread.sleep(2000);
			tpage.getAddnew().click();
			Thread.sleep(2000);
			tpage.getcustomer().click();
			Thread.sleep(2000);
			tpage.getncustomername().sendKeys("Sg software");
			tpage.getcreatecustomer().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifycustomer()
	{
		try
		{
			tpage.selectcreatedcustomer().click();
			Thread.sleep(2000);
			tpage.customerEditButton().click();
			Thread.sleep(2000);
			tpage.customerdescription().sendKeys("it is a software testing institute");
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
			tpage.selectcreatedcustomer().click();
			Thread.sleep(2000);
			tpage.customerEditButton().click();
			Thread.sleep(2000);
			tpage.deletecustomeraction().click();
			Thread.sleep(2000);
			tpage.deletecustomerbutton().click();
			Thread.sleep(2000);
			tpage.customerdeleteconfirmation().click();
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
			tpage.getLogout().click();
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
