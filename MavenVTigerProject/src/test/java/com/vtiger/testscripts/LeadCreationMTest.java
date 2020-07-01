package com.vtiger.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericlib.PrimaryClassM;
import com.vtiger.objectrepository.CreateLeadPageElementsM;
import com.vtiger.objectrepository.HomePageElementsM;
import com.vtiger.objectrepository.LeadInfoPageElementsM;
import com.vtiger.objectrepository.LeadPageElementsM;

@Listeners(com.vtiger.genericlib.ListenerFunctionalityM.class)

public class LeadCreationMTest extends PrimaryClassM {

	@Test
	public void createdLead() throws IOException
	{
		HomePageElementsM hp = PageFactory.initElements(driver, HomePageElementsM.class);
		LeadPageElementsM lp = PageFactory.initElements(driver, LeadPageElementsM.class);
		CreateLeadPageElementsM clp = PageFactory.initElements(driver, CreateLeadPageElementsM.class);
		LeadInfoPageElementsM lip = PageFactory.initElements(driver, LeadInfoPageElementsM.class);
		
		hp.getLeads().click();
		lp.getCreateLead().click();
		clp.getLastNameTb().sendKeys(data.getDataFromExcel("CreateLead", 2, 1));
		clp.getCompanyNameTb().sendKeys(data.getDataFromExcel("CreateLead", 2, 2));
		clp.getSaveBtn().click();
		String actLeadMsg = lip.getLeadSuccessMsg().getText();
		
		Assert.assertTrue(actLeadMsg.contains(data.getDataFromExcel("CreateLead",2, 3)));
		Reporter.log("Lead created successfully",true);
	}

}
