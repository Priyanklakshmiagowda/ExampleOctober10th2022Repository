package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePage2 
{

	ActitimePage2(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	@FindBy(xpath="//a[text()='org.openqa.selenium']")
	private WebElement seleniumopenque;
	public WebElement getusername()
	{
		return seleniumopenque;
		
	}
	
	private WebElement packageFrame;
	public WebElement getbuliding()
	{
		return packageFrame;
		
	}
	
	
	
	

}
