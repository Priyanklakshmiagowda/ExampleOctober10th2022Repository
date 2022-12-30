package com.sgtesting.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8
{
	
	public static WebDriver oBrowser=null;
	public static ActiTimePage apage=null;
	public static void main(String[] args)
	{
		launchbrowser();
		navigate();
		loginpage();
		minimizeflyoutwind();
		createUser();
		logoutasadmin();
		loginuser1();
		logoutuser1();
		loginuser2();
		logoutuser2();
		loginuser3();
		logoutuser3();
		modifyuserpassword();
		loginwithmodifiedpasswordasuser();
		loginasadminandmodifypassword();
		loginwithmodifyuserasadmin();
		deleteuser();
		logout();
		closeApplication();
	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			apage=new ActiTimePage(oBrowser);
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
			apage.getusername().sendKeys("admin");
			apage.getpassword().sendKeys("manager");
			apage.getLogin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwind()
	{
		try
		{
			apage.getMinimizeFlooutwindow().click();
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

			apage.getcreateUserclick().click();
			Thread.sleep(2000);
			apage.getAdduser().click();
			Thread.sleep(2000);
			apage.getfirstname().sendKeys("java");
			apage.getlastname().sendKeys("demo");
			apage.getmail().sendKeys("java@gmail.com");
			apage.getCreateusernameclick().sendKeys("JavaDemo");
			apage.creatusergetpassword().sendKeys("9900");
			apage.getpasswordcopy().sendKeys("9900");
			Thread.sleep(2000);
			apage.getCreateuser().click();
			Thread.sleep(2000);
			
			apage.getAdduser().click();
			Thread.sleep(2000);
			apage.getfirstname().sendKeys("selenium");
			apage.getlastname().sendKeys("demo");
			apage.getmail().sendKeys("selenium@gmail.com");
			apage.getCreateusernameclick().sendKeys("seleniumDemo");
			apage.creatusergetpassword().sendKeys("9845");
			apage.getpasswordcopy().sendKeys("9845");
			Thread.sleep(2000);
			apage.getCreateuser().click();
			Thread.sleep(2000);
			
			apage.getAdduser().click();
			Thread.sleep(2000);
			apage.getfirstname().sendKeys("sql");
			apage.getlastname().sendKeys("demo");
			apage.getmail().sendKeys("sql@gmail.com");
			apage.getCreateusernameclick().sendKeys("sqlDemo");
			apage.creatusergetpassword().sendKeys("9980");
			apage.getpasswordcopy().sendKeys("9980");
			Thread.sleep(2000);
			apage.getCreateuser().click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasadmin()
	{
		try
		{
			apage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser1()
	{
		try
		{
			apage.getusername().sendKeys("JavaDemo");
			apage.getpassword().sendKeys("9900");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.vidieopopwindow().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1()
	{
		try
		{
			apage.getLogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try
		{
			apage.getusername().sendKeys("seleniumDemo");
			apage.getpassword().sendKeys("9845");
			apage.getLogin().click();
			Thread.sleep(3000);
			apage.vidieopopwindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2()
	{
		try
		{
			apage.getLogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try
		{
			apage.getusername().sendKeys("sqlDemo");
			apage.getpassword().sendKeys("9980");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.vidieopopwindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3()
	{
		try
		{
			apage.getLogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuserpassword()
	{
		try
		{
			apage.getusername().sendKeys("JavaDemo");
			apage.getpassword().sendKeys("9900");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.getcreateUserclick().click();
			Thread.sleep(2000);
			apage.getSelecteduser1().click();
			Thread.sleep(2000);
			apage.creatusergetpassword().sendKeys("6742");
			apage.getpasswordcopy().sendKeys("6742");
			apage.getsavechanges().click();
			Thread.sleep(2000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			
			apage.getusername().sendKeys("seleniumDemo");
			apage.getpassword().sendKeys("9845");
			apage.getLogin().click();
			Thread.sleep(3000);
			apage.getcreateUserclick().click();
			Thread.sleep(2000);
			apage.getSelecteduser2().click();
			Thread.sleep(2000);
			apage.creatusergetpassword().sendKeys("2895");
			apage.getpasswordcopy().sendKeys("2895");
			apage.getsavechanges().click();
			Thread.sleep(2000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			
			apage.getusername().sendKeys("sqlDemo");
			apage.getpassword().sendKeys("9980");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.getcreateUserclick().click();
			Thread.sleep(2000);
			apage.getSelecteduser3().click();
			Thread.sleep(2000);
			apage.creatusergetpassword().sendKeys("9542");
			apage.getpasswordcopy().sendKeys("9542");
			apage.getsavechanges().click();
			Thread.sleep(2000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifiedpasswordasuser()
	{
		try
		{
			apage.getusername().sendKeys("JavaDemo");
			apage.getpassword().sendKeys("6742");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			apage.getusername().sendKeys("seleniumDemo");
			apage.getpassword().sendKeys("2895");
			apage.getLogin().click();
			Thread.sleep(3000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			apage.getusername().sendKeys("sqlDemo");
			apage.getpassword().sendKeys("9542");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasadminandmodifypassword()
	{
		try
		{
			apage.getusername().sendKeys("admin");
			apage.getpassword().sendKeys("manager");
			apage.getLogin().click();
			Thread.sleep(3000);
			apage.getcreateUserclick().click();
			Thread.sleep(2000);
			
			apage.getSelecteduser1().click();
			Thread.sleep(2000);
			apage.creatusergetpassword().sendKeys("4258");
			apage.getpasswordcopy().sendKeys("4258");
			apage.getsavechanges().click();
			Thread.sleep(2000);
			
			apage.getSelecteduser2().click();
			Thread.sleep(2000);
			apage.creatusergetpassword().sendKeys("9584");
			apage.getpasswordcopy().sendKeys("9584");
			apage.getsavechanges().click();
			Thread.sleep(2000);
			
			apage.getSelecteduser3().click();
			Thread.sleep(2000);
			apage.creatusergetpassword().sendKeys("4298");
			apage.getpasswordcopy().sendKeys("4298");
			apage.getsavechanges().click();
			Thread.sleep(2000);
			
			apage.getLogout().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginwithmodifyuserasadmin()
	{
		try
		{
			apage.getusername().sendKeys("JavaDemo");
			apage.getpassword().sendKeys("4258");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			apage.getusername().sendKeys("seleniumDemo");
			apage.getpassword().sendKeys("9584");
			apage.getLogin().click();
			Thread.sleep(3000);
			apage.getLogout().click();
			Thread.sleep(2000);
			
			apage.getusername().sendKeys("sqlDemo");
			apage.getpassword().sendKeys("4298");
			apage.getLogin().click();
			Thread.sleep(2000);
			apage.getLogout().click();
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
			apage.getusername().sendKeys("admin");
			apage.getpassword().sendKeys("manager");
			apage.getLogin().click();
			Thread.sleep(2000);
			
			apage.getcreateUserclick().click();
			Thread.sleep(2000);
			apage.getSelecteduser1().click();
			Thread.sleep(2000);
			apage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert olert=oBrowser.switchTo().alert();
			String text=olert.getText();
			System.out.println(text);
			olert.accept();
			Thread.sleep(2000);
			
			apage.getSelecteduser2().click();
			Thread.sleep(2000);
			apage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert alt=oBrowser.switchTo().alert();
			String cntent=alt.getText();
			System.out.println(cntent);
			olert.accept();
			Thread.sleep(2000);
			
			apage.getSelecteduser3().click();
			Thread.sleep(2000);
			apage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert war=oBrowser.switchTo().alert();
			String info=war.getText();
			System.out.println(info);
			olert.accept();
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
			apage.getLogout().click();
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
