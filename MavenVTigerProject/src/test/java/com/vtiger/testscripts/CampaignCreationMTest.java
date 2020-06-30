package com.vtiger.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericlib.PrimaryClassM;
import com.vtiger.objectrepository.CampaignInfoPageElementsM;
import com.vtiger.objectrepository.CampaignPageElementsM;
import com.vtiger.objectrepository.CreateCampaignPageElementsM;
import com.vtiger.objectrepository.ElementsInMoreM;
import com.vtiger.objectrepository.HomePageElementsM;

public class CampaignCreationMTest extends PrimaryClassM{
	@Test
	public void createdCampaign() throws IOException
	{
		HomePageElementsM hp = PageFactory.initElements(driver, HomePageElementsM.class);
		CampaignPageElementsM cp = PageFactory.initElements(driver, CampaignPageElementsM.class);
		CreateCampaignPageElementsM ccp = PageFactory.initElements(driver, CreateCampaignPageElementsM.class);
		CampaignInfoPageElementsM cip = PageFactory.initElements(driver, CampaignInfoPageElementsM.class);
		ElementsInMoreM eim = PageFactory.initElements(driver, ElementsInMoreM.class);
		
		
		hp.More();
		eim.getCampaigns().click();
		cp.getCreateCampaign().click();
		ccp.getCampaignname().sendKeys(data.getDataFromExcel("CampaiginData", 2, 1));
		ccp.getSaveBtn().click();
		String actCampaignMsg = cip.getCampaignSuccessMsg().getText();
		
		Assert.assertTrue(actCampaignMsg.contains(data.getDataFromExcel("CampaiginData",2, 4)));
	}

}

