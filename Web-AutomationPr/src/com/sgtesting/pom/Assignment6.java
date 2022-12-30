package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage actipage=null;
	public static void main(String[] args)
	{

		launchbrowser();
		navigate();
		loginpage();
		minimizeflyoutwind();
		createcustomer();
		createproject();
		modifyproject();
		modifycustomer();
		deleteproject();
		deletecustomer();
		logout();
		closeApplication();
		

	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			actipage=new ActiTimePage(oBrowser);
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
			actipage.getusername().sendKeys("admin");
			actipage.getpassword().sendKeys("manager");
			actipage.getLogin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwind()
	{
		try
		{
			actipage.getMinimizeFlooutwindow().click();
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
			actipage.gettask().click();
			Thread.sleep(2000);
			actipage.getAddnew().click();
			Thread.sleep(2000);
			actipage.getcustomer().click();
			Thread.sleep(2000);
			actipage.getncustomername().sendKeys("Gowri software sloutions private limited");
			actipage.getcreatecustomer().click();
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
			actipage.getAddnew().click();
			Thread.sleep(2000);
			actipage.getproject().click();
			Thread.sleep(2000);
			actipage.getpojectname().sendKeys("Java");
			Thread.sleep(2000);
			actipage.getcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyproject() 
	{
		try
		{
			actipage.selectcreatedprojects().click();
			Thread.sleep(2000);
			actipage.getprojecteditbutton().click();
			Thread.sleep(2000);
			actipage.projectdescription().sendKeys("java is a programming language");
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
			actipage.selectcreatedcustomer().click();
			Thread.sleep(2000);
			actipage.customerEditButton().click();
			Thread.sleep(2000);
			actipage.customerdescription().sendKeys("it is a software company");
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
			actipage.selectcreatedprojects().click();
			Thread.sleep(2000);
			actipage.getprojecteditbutton().click();
			Thread.sleep(2000);
			actipage.projectdeleteaction().click();
			Thread.sleep(2000);
			actipage.projectdeletebutton().click();
			Thread.sleep(2000);
			actipage.projectdeleteconfirmation().click();
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
			actipage.selectcreatedcustomer().click();
			Thread.sleep(2000);
			actipage.customerEditButton().click();
			Thread.sleep(2000);
			actipage.deletecustomeraction().click();
			Thread.sleep(2000);
			actipage.deletecustomerbutton().click();
			Thread.sleep(2000);
			actipage.customerdeleteconfirmation().click();
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
			actipage.getLogout().click();
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
