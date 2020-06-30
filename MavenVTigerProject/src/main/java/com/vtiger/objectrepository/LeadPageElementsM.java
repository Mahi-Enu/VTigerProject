package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPageElementsM {

	@FindBy(css = "img[title='Create Lead...']")
	private WebElement createLead;
	
	public WebElement getCreateLead()
	{
		return createLead;
	}
}
