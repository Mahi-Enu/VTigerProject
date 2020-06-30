package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadPageElementsM {

	@FindBy(name="lastname")
	private WebElement lastnametb;
	
	@FindBy(name="company")
	private WebElement companynametb;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	public WebElement getLastNameTb()
	{
		return lastnametb;
	}
	
	public WebElement getCompanyNameTb()
	{
		return companynametb;
	}
	
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
}
