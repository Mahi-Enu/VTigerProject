package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadInfoPageElementsM {

	@FindBy(xpath = "//span[contains(text(),'Lead Information')]")
	private WebElement leadsuccessMsg;
	
	public WebElement getLeadSuccessMsg()
	{
		return leadsuccessMsg;
	}
}
