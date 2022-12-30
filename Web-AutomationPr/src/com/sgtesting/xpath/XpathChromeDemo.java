package com.sgtesting.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathChromeDemo 
{

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchSampleBrowser();
		navigateSample();
	//UsingTagNameonly();
		//usingtagnameonly();
		//UisngTagNamewithIndex();
		//usingTagnameAttributename();
		//usingAttributeandvalue();
		//UsingAttributeValueOlone();
		//UsingMultipleAttributeValueAndName();
		//UsingMultipleAttributeValueAndNameusingAnd();
		//UsingMultipleAttributeValueAndNameusingOr();
		//UsingPartialmatching();
		//textcontent();
		//UsingTagNameAttributeName();
		//NoofLinksAvailable();
		//DropdownCount();
	//LInkDisplay();
		//DropDown();
		DropDownCount();

	}
	private static void launchSampleBrowser()
	{
		try
		{
		System.setProperty("webdriver,chrome,dirver", "D:\\JavaPractice\\Java\\Web-AutomationPr\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateSample()
	{
		try
		{
			oBrowser.get("D:\\javanotes3\\xpathaxesnotes\\WebTableHTML.html"
					+ "");
			//oBrowser.get("D:\\javanotes3\\xpathnotes\\Sample.html");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//using tagName
	private static void UsingTagNameonly()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("priyanak");
	}
	private static void usingtagnameonly()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("Devika");
	}
	private static void UisngTagNamewithIndex()

	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("manager");
	}
	private static void usingTagnameAttributename()
	{
		oBrowser.findElement(By.xpath("//input[@id='chk1windows']")).click();
	}
	private static void usingAttributeandvalue()
	{
		oBrowser.findElement(By.xpath("//*[@class='linus']")).click();
	}
	private static void UsingAttributeValueOlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='chk1windows']")).click();
	}
	private static void UsingMultipleAttributeValueAndName()
	{
		oBrowser.findElement(By.xpath("//input[@name='linus'][@class='linus']")).click();
	}
	private static void UsingMultipleAttributeValueAndNameusingAnd()
	{
		oBrowser.findElement(By.xpath("//input[@name='firefox'and @class='firefox']")).click();
	}
	private static void UsingMultipleAttributeValueAndNameusingOr()
	{
		oBrowser.findElement(By.xpath("//input[@name='firefox' or @class='firefox']")).click();
	}
	private static void UsingPartialmatching()
	{
		//oBrowser.findElement(By.xpath("//input[starts-with(@id,'uid1')]")).sendKeys("priyanka");
		oBrowser.findElement(By.xpath("//input[contains(@id,'uid1')]")).sendKeys("priyanka");
		
	}
	
	private static void textcontent()
	{
		//oBrowser.findElement(By.xpath("//a[text()='S G Software Testing']")).click();
		//oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
	}
    private static void UsingTagNameAttributeName()
    {
    	oBrowser.findElement(By.xpath("//input[@value]")).click();
    }
    private static void NoofLinksAvailable()
    {
    	List<WebElement>links=oBrowser.findElements(By.xpath("//a[@href]"));
    	System.out.println(links.size());
    }
    private static void DropdownCount()
    {
    	List<WebElement>dropdown=oBrowser.findElements(By.xpath("//select"));
    	System.out.println(dropdown.size());
    	
    }
    private static void LInkDisplay()
    {
    	List<WebElement> linkavl=oBrowser.findElements(By.xpath("//a[@href]"));
    	for(int i=0;i<linkavl.size();i++)
    	{
    		String kk=linkavl.get(i).getText();
    		System.out.println(kk);
    		
    	}
    	
    }
    private static void DropDown()
    {
    	oBrowser.findElement(By.xpath("//td[text()='Narendra Modi']/following::td[2]/select")).click();
    }
    private static void DropDownCount()
    {
    	try
    	{
    		List<WebElement> pp=oBrowser.findElements(By.xpath("//select"));
    		for(int i=0;i<pp.size();i++)
    		{
    			String ll=pp.get(i).getText();
    			System.out.println(ll);
    		}
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		
    	}
    }
	
}
