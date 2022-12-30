package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage atpage=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		loginpage();
		minimizeflyoutwind();
		createcustomer();
		createproject();
		createtask();
		taskdelete();
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
			atpage=new ActiTimePage(oBrowser);
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
			atpage.getusername().sendKeys("admin");
			atpage.getpassword().sendKeys("manager");
			atpage.getLogin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwind()
	{
		try
		{
			atpage.getMinimizeFlooutwindow().click();
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
			atpage.gettask().click();
			Thread.sleep(2000);
			atpage.getAddnew().click();
			Thread.sleep(2000);
			atpage.getcustomer().click();
			Thread.sleep(2000);
			atpage.getncustomername().sendKeys("Business one technology");
			atpage.getcreatecustomer().click();
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
			atpage.getAddnew().click();
			Thread.sleep(2000);
			atpage.getproject().click();
			Thread.sleep(2000);
			atpage.getpojectname().sendKeys("selenium");
			Thread.sleep(2000);
			atpage.getcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createtask()
	{
		try
		{
			atpage.addnewtask().click();
			Thread.sleep(2000);
			atpage.createnewtask().click();
			Thread.sleep(2000);
			atpage.entertaskname().sendKeys("testscript");
			Thread.sleep(2000);
			atpage.createtask().click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void taskdelete()
	{
		try
		{
			atpage.selectCheckBox().click();
			Thread.sleep(2000);
			atpage.taskdeletebutton().click();
			Thread.sleep(2000);
			atpage.taskdeleteconfirmation().click();
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
			atpage.selectcreatedprojects().click();
			Thread.sleep(2000);
			atpage.getprojecteditbutton().click();
			Thread.sleep(2000);
			atpage.projectdeleteaction().click();
			Thread.sleep(2000);
			atpage.projectdeletebutton().click();
			Thread.sleep(2000);
			atpage.projectdeleteconfirmation().click();
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
			atpage.selectcreatedcustomer().click();
			Thread.sleep(2000);
			atpage.customerEditButton().click();
			Thread.sleep(2000);
			atpage.deletecustomeraction().click();
			Thread.sleep(2000);
			atpage.deletecustomerbutton().click();
			Thread.sleep(2000);
			atpage.customerdeleteconfirmation().click();
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
			atpage.getLogout().click();
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
			e.printStackTrace();
		}
	}


}
