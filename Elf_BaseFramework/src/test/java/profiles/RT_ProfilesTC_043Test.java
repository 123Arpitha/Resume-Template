package profiles;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;

public class RT_ProfilesTC_043Test extends Base_Class {
	@Test
	public void Profiles(){
		ExcelUtil eu = new ExcelUtil();
		String firstname =eu.readStringDataFromExcel("Sheet1", 0, 0);
		String lastname =eu.readStringDataFromExcel("Sheet1", 1, 0);
		String expectedHomePageUrl=eu.readStringDataFromExcel("Sheet1",2 ,0 );
		String expectedFirstname = 	eu.readStringDataFromExcel("Sheet1",0, 0);
		String expectedProfilesPage =eu.readStringDataFromExcel("Sheet1",2,1);
		
		HomePage homePage = new HomePage(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(),expectedHomePageUrl,"Home Page is not displayed Successfully");
		Reporter.log("Home Page is displayed successfully", true);
		
		homePage.getProfileModuleLink().click();
		
		Assert.assertEquals(homePage.getProfileModuleLink().getText(),expectedProfilesPage,"Profile Page is not displayed Successfully");
		Reporter.log("Profile Page is displayed successfully", true);
		
		homePage.javascript(driver);
		homePage.getFirstName().sendKeys(firstname);
		
		homePage.getLastName().click();
		
		homePage.javascript1(driver);
		homePage.getLastName().sendKeys(lastname);
		
		homePage.getTechnology().click();
		homePage.technology();
		
		homePage.getTotalExperienceYear().click();
		
		homePage.totalExpYear();
				
		homePage.totalExpierenceMon();
		
		
		homePage.relExpYear();
		
		homePage.relExpierenceMon();
		
		homePage.getDownload();
		
		homePage.download(driver);
		
		homePage.getPdf().click();
		
		
		
	}

}
