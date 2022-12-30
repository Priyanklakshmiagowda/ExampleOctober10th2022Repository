package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserChromeBrowserDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		maximize();
		minimixeflyoutwindow();
		createuser();
		deleteUser();
		logout();

		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdrevir.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			
			oBrowser =new ChromeDriver();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void maximize() 
	{
		try
		{
			oBrowser.manage().window().maximize();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void minimixeflyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
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
			oBrowser.findElement(By.name("firstName")).sendKeys("Test");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("Demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("TestDemo");
			oBrowser.findElement(By.name("password")).sendKeys("12345");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Demo, Test']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			
	        Alert oAlert=oBrowser.switchTo().alert();
	       String Text= oAlert.getText();
	       System.out.println(Text);
	       oAlert.accept();
	       Thread.sleep(3000);
	        
	         
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
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
