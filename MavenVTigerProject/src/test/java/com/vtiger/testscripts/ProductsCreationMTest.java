package com.vtiger.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericlib.PrimaryClassM;
import com.vtiger.objectrepository.CreateProductsPageElementsM;
import com.vtiger.objectrepository.HomePageElementsM;
import com.vtiger.objectrepository.ProductPageElementsM;
import com.vtiger.objectrepository.ProductsInfoPageElementsM;

public class ProductsCreationMTest extends PrimaryClassM {
	@Test
	public void createdProducts() throws IOException
	
	{
		HomePageElementsM hp = PageFactory.initElements(driver, HomePageElementsM.class);
		ProductPageElementsM pp = PageFactory.initElements(driver, ProductPageElementsM.class);
		CreateProductsPageElementsM cpp = PageFactory.initElements(driver, CreateProductsPageElementsM.class);
		ProductsInfoPageElementsM pip = PageFactory.initElements(driver, ProductsInfoPageElementsM.class);
		
		hp.getProduct().click();
		pp.getCreateProducts().click();
		cpp.getProductname().sendKeys(data.getDataFromExcel("ProductData", 2, 1));
		cpp.getSaveBtn().click();
		String actProductsMsg = pip.getProductsSuccessMsg().getText();
		
		Assert.assertTrue(actProductsMsg.contains(data.getDataFromExcel("ProductData",2, 2)));
		Reporter.log("Product created successfully",true);
	}

}
