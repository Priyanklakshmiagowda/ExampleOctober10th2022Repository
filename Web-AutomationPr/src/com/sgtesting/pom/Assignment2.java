package com.sgtesting.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage actipage=null;

	public static void main(String[] args) 
	{
		launchBrowserDemo();
		navigateACtitime();
		loginActitime();
		minimizeflyoutwindow();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeApplication();

	}
	private static void launchBrowserDemo()
	{
		try
		{
			System.setProperty("webdriver.chrome.diver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			actipage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateACtitime()
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
	private static void loginActitime()
	{
		try
		{
			actipage.getusername().sendKeys("admin");
			actipage.getpassword().sendKeys("manager");
			actipage.getLogin().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void minimizeflyoutwindow()
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
	private static void createuser()
	{
		try
		{
			actipage.getcreateUserclick().click();
			Thread.sleep(2000);
			actipage.getAdduser().click();
			Thread.sleep(2000);
			actipage.getfirstname().sendKeys("Test");
			actipage.getlastname().sendKeys("java");
			actipage.getmail().sendKeys("Test@gmail.com");
			actipage.getCreateusernameclick().sendKeys("testjava");
			actipage.creatusergetpassword().sendKeys("qwerty");
			actipage.getpasswordcopy().sendKeys("qwerty");
			actipage.getCreateuser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try
		{
			actipage.getSelecteduser().click();
			Thread.sleep(2000);
			actipage.getfirstname().clear();
			actipage.getfirstname().sendKeys("selenium");
			Thread.sleep(2000);
			actipage.getsavechanges().click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser() 
	{
		try
		{
			actipage.getSelecteduser().click();
			Thread.sleep(2000);
			actipage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert ole=oBrowser.switchTo().alert();
			String text=ole.getText();
			System.out.println(text);
			ole.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  logout()
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
			e.printStackTrace();
		}
	}

}
