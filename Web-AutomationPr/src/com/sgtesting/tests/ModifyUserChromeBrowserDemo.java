package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserChromeBrowserDemo
{
	public static WebDriver oBrowser=null;
	

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		maximizewindow();
		minimzewindow();
		createuser();
		modifyuser();
		deletuser();
		logout();
		closeApplication();
		

		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("wbdriver,chrome,driver",".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
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
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
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
	private static void minimzewindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("java");
			oBrowser.findElement(By.name("email")).sendKeys("Demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demojava");
			oBrowser.findElement(By.name("password")).sendKeys("qwerty");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			oBrowser.findElement(By.xpath("//span[text()='java, Demo']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("lastName")).sendKeys("Test");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void deletuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Test, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert ole=oBrowser.switchTo().alert();
			String info=ole.getText();
			System.out.println(info);
			ole.accept();
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
			oBrowser.findElement(By.linkText("L"
					+ "ogout")).click();
			Thread.sleep(2000);;
			
			
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
