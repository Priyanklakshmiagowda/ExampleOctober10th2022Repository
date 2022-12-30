package com.sgtesting.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo 
{
	public static WebDriver oBrowser=null;
	

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlingframes();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webDriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void handlingframes()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			//oBrowser.switchTo().
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
