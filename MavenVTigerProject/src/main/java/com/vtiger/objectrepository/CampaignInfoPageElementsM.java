package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignInfoPageElementsM {
	@FindBy(xpath = "//span[contains(text(),'Campaign Information')]")
	private WebElement campaignsuccessMsg;
	
	public WebElement getCampaignSuccessMsg()
	{
		return campaignsuccessMsg;
	}
}
