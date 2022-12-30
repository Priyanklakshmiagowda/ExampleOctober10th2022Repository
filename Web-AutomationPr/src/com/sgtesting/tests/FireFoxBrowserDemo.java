package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowserfirerox();
		navigateFireFox();
		closeApplicationFireFox();

	}
	private static void launchBrowserfirerox()
	{
		try
		{
			oBrowser =new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateFireFox()
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
	private static void closeApplicationFireFox()
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
