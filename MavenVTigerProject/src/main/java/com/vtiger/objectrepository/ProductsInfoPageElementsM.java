package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsInfoPageElementsM {
	
	@FindBy(xpath = "//span[contains(text(),'Product Information')]")
	private WebElement ProductSuccessMsg;
	
	public WebElement getProductsSuccessMsg()
	{
		return ProductSuccessMsg;
	}
}
