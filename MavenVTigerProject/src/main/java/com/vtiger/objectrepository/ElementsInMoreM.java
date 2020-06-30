package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsInMoreM {
	 
	@FindBy(name = "Campaigns")
	private WebElement Campaigns;
	
	public WebElement getCampaigns()
	{
		return Campaigns;
	}
	
}
