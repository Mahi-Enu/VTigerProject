package com.vtiger.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericlib.PrimaryClassM;
import com.vtiger.objectrepository.CreateProductsPageElementsM;
import com.vtiger.objectrepository.ProductPageElementsM;
import com.vtiger.objectrepository.ProductsInfoPageElementsM;

public class ProductsCreationMTest extends PrimaryClassM {
	@Test
	public void createdProducts() throws IOException
	
	{
		ProductPageElementsM pp = PageFactory.initElements(driver, ProductPageElementsM.class);
		CreateProductsPageElementsM cpp = PageFactory.initElements(driver, CreateProductsPageElementsM.class);
		ProductsInfoPageElementsM pip = PageFactory.initElements(driver, ProductsInfoPageElementsM.class);
		
		
		pp.getCreateProducts().click();
		cpp.getProductname().sendKeys(data.getDataFromExcel("ProductsData", 2, 1));
		cpp.getSaveBtn().click();
		String actProductsMsg = pip.getProductsSuccessMsg().getText();
		
		Assert.assertTrue(actProductsMsg.contains(data.getDataFromExcel("ProductsData",2, 2)));
	}

}
