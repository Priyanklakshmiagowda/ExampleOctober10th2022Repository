package com.sgtesting.xpath;

public class AutoItDemo {

	public static void main(String[] args) {
		

		excecutAutoIt();
	}
	private static void excecutAutoIt() 
	{
		try
		{
			//Runtime.getRuntime().exec("D:\\AutoIt\\FirstTestScriptDemo.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("D:\\AutoIt\\FirstTestScriptDemo.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
