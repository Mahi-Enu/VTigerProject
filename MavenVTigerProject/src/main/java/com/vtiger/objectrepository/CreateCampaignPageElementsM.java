package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCampaignPageElementsM {
	@FindBy(name="campaignname")
	private WebElement campaignname;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;

	public WebElement getCampaignname()
	{
		return campaignname;
	}
	
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
}

	
