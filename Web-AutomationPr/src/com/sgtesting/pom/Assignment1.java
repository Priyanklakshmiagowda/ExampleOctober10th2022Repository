package com.sgtesting.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigateurl();
		maximizewindow();
		login();
		minimizeflyoutwind();
		/*createUser();
		deleteuser();
		logout();
		closeApplication();*/

	}
	private static void launchBrowser() 
	{
		try
		{
			System.setProperty("webdriver.chrome.diver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigateurl()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void maximizewindow()
	{
		try
		{
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			oPage.getLogin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void minimizeflyoutwind()
	{
		try
		{
			oPage.getMinimizeFlooutwindow().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{

			oPage.getcreateUserclick().click();
			oPage.getAdduser().click();
			oPage.getfirstname().sendKeys("Demo");
			oPage.getlastname().sendKeys("java");
			oPage.getmail().sendKeys("Demo@gmail.com");
			oPage.getCreateusernameclick().sendKeys("JavaDemo");
			oPage.creatusergetpassword().sendKeys("12345");
			oPage.getpasswordcopy().sendKeys("12345");
			Thread.sleep(2000);
			oPage.getCreateuser().click();
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
			oPage.getSelecteduser().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert olert=oBrowser.switchTo().alert();
			String text=olert.getText();
			System.out.println(text);
			olert.accept();
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
			oPage.getLogout().click();
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

