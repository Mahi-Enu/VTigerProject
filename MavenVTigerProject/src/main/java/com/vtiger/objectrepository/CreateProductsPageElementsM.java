package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProductsPageElementsM {

	@FindBy(name="productname")
	private WebElement productname;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;

	public WebElement getProductname()
	{
		return productname;
	}
	
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
}

