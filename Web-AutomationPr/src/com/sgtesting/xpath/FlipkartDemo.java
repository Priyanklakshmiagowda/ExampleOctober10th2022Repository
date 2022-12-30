package com.sgtesting.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//LinkCollections();
		//DropDownText();
		NameDisply();
		
		

	}
	private static void launchBrowser()
	{
	    System.setProperty("webDriver.chrome.driver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	private static void navigate()
	{
		oBrowser.navigate().to("https://www.flipkart.com/");
	}
	private static void LinkCollections()
	{
		List<WebElement> link=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<link.size();i++)
		{
			String k=link.get(i).getText();
		System.out.println(k);
		}
	}
	private static void DropDownText()
	{
		try
		{
		List<WebElement> ll=oBrowser.findElements(By.xpath("//select"));
		System.out.println(ll.size());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void NameDisply()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='q']")).sendKeys("Dell laptop");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
