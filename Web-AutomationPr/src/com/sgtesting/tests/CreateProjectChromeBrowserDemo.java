package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProjectChromeBrowserDemo 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{

		launchBrowser();
		navigate();
		login();
		maximize();
		minimizewindow();
		createcutomer();
		createProject();
		deleteproject();
		deletcutomer();
		logout();
		closeApplication();


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
	private static  void deleteproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void deletcutomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static  void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static  void closeApplication()
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
