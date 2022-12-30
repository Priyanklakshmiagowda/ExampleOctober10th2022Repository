package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTaskchromeBrowserDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		

	}
	private static  void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver,chrome,driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void maximize()
	{
		try
		{
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void minimizewindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void createcutomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("TATA");
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("JAVA");
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
