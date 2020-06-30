package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePageElementsM {

	@FindBy(linkText = "Leads")
	private WebElement leads;
	
	@FindBy(linkText = "Organizations")
	private WebElement Organizations;
	
	@FindBy(linkText = "Products")
	private WebElement Products;
	
	@FindBy(linkText = "More")
	private WebElement More;
	
	@FindBy(xpath = "//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement SignOutDD;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	
	public WebElement getLeads()
	{
		return leads;
	}
	
	public WebElement getOrganization()
	{
		return Organizations;
	}
	
	public WebElement getProduct()
	{
		return Products;
	}
	
	public WebElement getSignOutDD()
	{
		return SignOutDD;
	}
	
	public WebElement getsignoutLink()
	{
		return signoutLink;
	}
	
	public void LogOutFromApp()
	{
		Actions act = new Actions(com.vtiger.genericlib.PrimaryClassM.driver);
		act.moveToElement(SignOutDD).perform();
		signoutLink.click();
	}
	
	public void More()
	{
		Actions act = new Actions(com.vtiger.genericlib.PrimaryClassM.driver);
		act.moveToElement(More).perform();
		More.click();
	}
}
