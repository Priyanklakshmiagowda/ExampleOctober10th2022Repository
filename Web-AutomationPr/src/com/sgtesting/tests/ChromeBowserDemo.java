package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBowserDemo {

	//WebDriver is  interface
	//refernce variable always null
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//closeApplication();


	}
	private static void launchBrowser()
	{
		try
		{
			//set the chrome browser path based on key and value pair
			System.setProperty("webdrevir.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			//class
			
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
