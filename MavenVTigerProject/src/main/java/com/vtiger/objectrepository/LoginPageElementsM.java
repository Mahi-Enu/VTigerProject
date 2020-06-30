package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementsM {

	@FindBy(name = "user_name")
	private WebElement username;
	
	@FindBy(name = "user_password")
	private WebElement password;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[contains(text(),'specify a valid')]")
	private WebElement errorMsg;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement getUserpassword()
	{
		return password;
	}
	
	public WebElement loginBtn()
	{
		return loginBtn;
	}
	
	
	public WebElement getErrormsg()
	{
		return errorMsg;
	}
	
	public void LoginToApp(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
}
