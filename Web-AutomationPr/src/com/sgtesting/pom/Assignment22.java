package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22 {

	public static WebDriver oBrowser=null;
	public static ActitimePage2 opage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		handlingframs();


	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webDriver.chrome.diver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActitimePage2(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void handlingframs()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			Thread.sleep(2000);

			opage.getusername().click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);

			oBrowser.switchTo().frame(1);
			Thread.sleep(2000);

			opage.getbuliding().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
