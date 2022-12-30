package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndScenariChromeBrowserDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{

		launchBrowser();
		navigate();
		Login();
		maximizeWindow();
		minimizeflyoutWindow();
		createuser1();
		createuser2();
		createuser3();
		logoutadmin();
		Loginuser1();
		logoutuser1();
		Loginuser2();
		logoutuser2();
		Loginuser3();
		logoutuser3();
		Loginuser11();
		modifyuser1();
		logoutuser11();
		Loginuser22();
		modifyuser2();
		logoutuser22();
		Loginuser33();
		modifyuser3();
		logoutuser33();
		Loginuser11withnewpwd();
		logoutuser111();
		Loginuser22withnewpwd();
		logoutuser222();
		Loginuser33withnewpwd();
		logoutuser333();
		LoginasAdmin();
		modifyuser1admin();
		modifyuser2admin();
		modifyuser3admin();
		logoutasadmin();
		Loginuser11withnewpwdasadmin();
		logoutuser1111();
		Loginuser22withnewpwdasadmin();
		logoutuser2222();
		Loginuser33withnewpwdasadmin();
		logoutuser3333();
		Loginadmin();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logoutasAdminuser();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver,chrome,diver", ".\\Library\\drivers\\chromedriver.exe");
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
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void maximizeWindow()
	{
		try
		{
			oBrowser.manage().window().maximize();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void minimizeflyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Java");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("javaDemo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("JavaDemo");
			oBrowser.findElement(By.name("password")).sendKeys("12345");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("selenium");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("seleniumDemo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("seleniumDemo");
			oBrowser.findElement(By.name("password")).sendKeys("qwerty");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("sql");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("sqlDemo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("sqlDemo");
			oBrowser.findElement(By.name("password")).sendKeys("welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutadmin()
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
	private static void Loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("JavaDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		    oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		    Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logoutuser1()
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
	private static void Loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seleniumDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("qwerty");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		    Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logoutuser2()
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
	private static void Loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("sqlDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			  Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logoutuser3()
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
	private static void Loginuser11()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("JavaDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Java']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("9900");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("9900");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser11()
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
	private static void Loginuser22()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seleniumDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("qwerty");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, selenium']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("9845");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("9845");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser22()
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
	private static void Loginuser33()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("sqlDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, sql']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("9980");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("9980");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser33()
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
	private static void Loginuser11withnewpwd()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("JavaDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("9900");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser111()
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
	private static void Loginuser22withnewpwd()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seleniumDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("9845");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser222()
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
	private static void Loginuser33withnewpwd()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("sqlDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("9980");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser333()
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
	private static void LoginasAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void modifyuser1admin()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Java']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("6742");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("6742");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser2admin()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//span[text()='Demo, selenium']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("2895");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("2895");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser3admin()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//span[text()='Demo, sql']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("9542");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("9542");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasadmin()
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
	private static void Loginuser11withnewpwdasadmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("JavaDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("6742");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1111()
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
	private static void Loginuser22withnewpwdasadmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seleniumDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("2895");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2222()
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
	private static void Loginuser33withnewpwdasadmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("sqlDemo");
			oBrowser.findElement(By.name("pwd")).sendKeys("9542");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3333()
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
	private static void Loginadmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Java']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
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
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Demo, selenium']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
	        Alert oAlert=oBrowser.switchTo().alert();
	       String content= oAlert.getText();
	       System.out.println(content);
	       oAlert.accept();
	       Thread.sleep(3000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Demo, sql']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
	        Alert oAlert=oBrowser.switchTo().alert();
	       String info= oAlert.getText();
	       System.out.println(info);
	       oAlert.accept();
	       Thread.sleep(3000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasAdminuser()
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
