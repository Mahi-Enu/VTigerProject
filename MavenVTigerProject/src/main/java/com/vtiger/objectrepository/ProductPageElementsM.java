package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementsM {
	
	@FindBy(css = "img[title='Create Product...']")
	private WebElement createProducts;
	
	public WebElement getCreateProducts()
	{
		return createProducts;
	}
}
