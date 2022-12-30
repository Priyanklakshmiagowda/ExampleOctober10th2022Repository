package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage timepage=null;


	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		loginpage();
		minimizeflyoutwind();
		createcustomer();
		createproject();
		deleteproject();
		deletecustomer();
		logout();
		closeApplication();


	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			timepage=new ActiTimePage(oBrowser);
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
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginpage()
	{
		try
		{
			timepage.getusername().sendKeys("admin");
			timepage.getpassword().sendKeys("manager");
			timepage.getLogin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwind()
	{
		try
		{
			timepage.getMinimizeFlooutwindow().click();
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
			timepage.gettask().click();
			Thread.sleep(2000);
			timepage.getAddnew().click();
			Thread.sleep(2000);
			timepage.getcustomer().click();
			Thread.sleep(2000);
			timepage.getncustomername().sendKeys("Sg software");
			timepage.getcreatecustomer().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createproject()
	{
		try
		{
			timepage.getAddnew().click();
			Thread.sleep(2000);
			timepage.getproject().click();
			Thread.sleep(2000);
			timepage.getpojectname().sendKeys("Java");
			Thread.sleep(2000);
			timepage.getcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try
		{
			timepage.selectcreatedprojects().click();
			Thread.sleep(2000);
			timepage.getprojecteditbutton().click();
			Thread.sleep(2000);
			timepage.projectdeleteaction().click();
			Thread.sleep(2000);
			timepage.projectdeletebutton().click();
			Thread.sleep(2000);
			timepage.projectdeleteconfirmation().click();
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
			timepage.selectcreatedcustomer().click();
			Thread.sleep(2000);
			timepage.customerEditButton().click();
			Thread.sleep(2000);
			timepage.deletecustomeraction().click();
			Thread.sleep(2000);
			timepage.deletecustomerbutton().click();
			Thread.sleep(2000);
			timepage.customerdeleteconfirmation().click();
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
			timepage.getLogout().click();
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
