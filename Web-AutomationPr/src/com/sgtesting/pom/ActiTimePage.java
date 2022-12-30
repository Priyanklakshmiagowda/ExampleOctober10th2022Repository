package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage
{
	ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	private WebElement username;
	public WebElement getusername()
	{
		return username;

	}
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;

	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Ologin;
	public WebElement getLogin()
	{
		return Ologin;

	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getMinimizeFlooutwindow()
	{

		return gettingStartedShortcutsPanelId;

	}
	@FindBy (linkText="Logout")
	private WebElement Ologout;
	public WebElement getLogout()
	{

		return Ologout;

	}
	@FindBy (xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement User;
	public WebElement getcreateUserclick()
	{
		return User;

	}
	@FindBy (xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement getAdduser()
	{
		return adduser;

	}
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;

	}
	private WebElement lastName;
	public WebElement getlastname()
	{
		return lastName;

	}
	private WebElement email;
	public WebElement getmail() 
	{
		return email;

	}
	@FindBy (xpath="//input[@name='username']")
	private WebElement creatusername;
	public WebElement getCreateusernameclick()
	{
		return creatusername;

	}
	private WebElement password;
	public WebElement creatusergetpassword()
	{
		return password;

	}
	private WebElement passwordCopy;
	public WebElement getpasswordcopy()
	{
		return passwordCopy;

	}
	@FindBy (xpath="//span[text()='Create User']")
	private WebElement createuser;
	public WebElement getCreateuser()
	{
		return createuser;

	}
	@FindBy (xpath="//div[text()='TASKS']")
	private WebElement otask;
	public WebElement gettask()
	{
		return otask;

	}
	@FindBy (xpath="//div[text()='Add New']")
	private WebElement addnew;
	public WebElement getAddnew()
	{
		return addnew;

	}
	@FindBy (xpath="//div[text()='+ New Customer']")
	private WebElement addnewcustomer;
	public WebElement getcustomer()
	{
		return addnewcustomer;

	}
	@FindBy (xpath="//div[text()='+ New Project']")
	private WebElement addnewproject;
	public WebElement getproject()
	{
		return addnewproject;

	}
	private WebElement customerLightBox_nameField;
	public WebElement getncustomername()
	{
		return customerLightBox_nameField;

	}
	@FindBy (xpath="//span[text()='Create Customer']")
	private WebElement creattcustomer;
	public WebElement getcreatecustomer()
	{
		return creattcustomer;

	}
	
	
	@FindBy (xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
	private WebElement selectcustomer;
	public WebElement selectcreatedcustomer()
	{
		return selectcustomer;
		
	}
	
	@FindBy (xpath="//div[@class='editButton available']")
	private WebElement editbutton;
	public WebElement customerEditButton()
	{
		return editbutton;
		
	}
	@FindBy(xpath="//textarea[@placeholder='Enter customer description...']")
	private WebElement customerdesc;
	public WebElement customerdescription()
	{
		return customerdesc;
		
	}
	@FindBy(xpath="//textarea[@placeholder='Enter project description...']")
	private WebElement projectdesc;
	public WebElement projectdescription()
	{
		return projectdesc;
		
	}
	
	@FindBy (xpath="//div[text()='ACTIONS']")
	private WebElement deleteaction;
	public WebElement deletecustomeraction()
	{
		return deleteaction;
		
	}
	@FindBy (xpath="//div[text()='Delete']")
	private WebElement delete;
	public WebElement deletecustomerbutton()
	{
		return delete;
		
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement customerdeleteconfirmation()
	
	{
		return customerPanel_deleteConfirm_submitTitle;
		
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getpojectname()
	{
		return projectPopup_projectNameField;

	}
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createproject;
	public WebElement getcreateproject()
	{
		return createproject;

	}
	@FindBy (xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
	private WebElement selectproject;
	public WebElement selectcreatedprojects()
	{
		return selectproject;
		
	}
	@FindBy (xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projecteditbuton;
	public WebElement getprojecteditbutton()
	{
		return projecteditbuton;
		
	}
	@FindBy (xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement action;
	public WebElement projectdeleteaction()
	{
		return action;
		
	}
	@FindBy (xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject;
	public WebElement projectdeletebutton()
	{
		return deleteproject;
		
	}
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement projectdeleteconfirmation()
	{
		return projectPanel_deleteConfirm_submitTitle;
		
	}
	@FindBy(xpath="//span[text()='demo, sql']")
	private WebElement selectuser3;
	public WebElement getSelecteduser3()
	{
		return selectuser3;

	}
	
	@FindBy(xpath="//span[text()='demo, selenium']")
	private WebElement selectuser2;
	public WebElement getSelecteduser2()
	{
		return selectuser2;

	}
	@FindBy(xpath="//span[text()='demo, java']")
	private WebElement selectuser1;
	public WebElement getSelecteduser1()
	{
		return selectuser1;

	}	
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement selectuser;
	public WebElement getSelecteduser()
	{
		return selectuser;

	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser()
	{
		return userDataLightBox_deleteBtn;

	}
	@FindBy (xpath="//span[text()='Save Changes']")
	private WebElement  savechange;
	public WebElement getsavechanges()
	{
		return savechange;
		
	}
	@FindBy (xpath="//div[text()='Add New Task']")
	private WebElement  addnewtask;
	public WebElement addnewtask()
	{
		return addnewtask;
		
	}
	@FindBy (xpath="//div[text()='Create new tasks']")
	private WebElement cretenewtask;
	public WebElement createnewtask()
	{
		return cretenewtask;
		
	}
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement enetertaskname;
	public WebElement entertaskname()
	{
		return enetertaskname;
		
	}
	@FindBy (xpath="//span[text()='Create Tasks']")
	private WebElement createtask;
	public WebElement createtask()
	{
		return createtask;
		
	}
	@FindBy (xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
	private WebElement selectcheckbox;
	public WebElement selectCheckBox()
	{
		return selectcheckbox;
		
	}
	@FindBy(xpath="//div[@class='deleteButton']")
	private WebElement deletebutton;
	public WebElement taskdeletebutton()
	{
		return deletebutton;
		
	}
	private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
	public WebElement taskdeleteconfirmation()
	{
		return deleteTaskPopup_deleteConfirm_submitTitle;
		
	}
	@FindBy (xpath="//span[text()='Start exploring actiTIME']")
	private WebElement vidieopop;
	public WebElement vidieopopwindow()
	{
		return vidieopop;
		
	}
	








}
