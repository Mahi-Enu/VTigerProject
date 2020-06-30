package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignPageElementsM {
	@FindBy(css = "img[title='Create Campaign...']")
	private WebElement createCampaign;
	
	public WebElement getCreateCampaign()
	{
		return createCampaign;
	}
}