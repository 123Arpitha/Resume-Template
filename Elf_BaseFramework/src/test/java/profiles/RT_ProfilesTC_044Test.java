package profiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;

public class RT_ProfilesTC_044Test extends Base_Class{
	
	@Test
	public void Profiles() throws InterruptedException {
		ExcelUtil eu = new ExcelUtil();
		String firstname =eu.readStringDataFromExcel("Sheet1", 0, 0);
		String summary=eu.readStringDataFromExcel("Sheet1", 0, 1);
		double POY=eu.readNumberDataFromExcel("Sheet1", 0, 2);
		String PN=eu.readStringDataFromExcel("Sheet1", 0, 3);
		String expectedHomePageTitle=eu.readStringDataFromExcel("Sheet1",2 ,0 );
		String expectedFirstname = 	eu.readStringDataFromExcel("Sheet1",0, 0);
		String expectedProfilesPage =eu.readStringDataFromExcel("Sheet1",2,1);
		String expectedSummaryPage = eu.readStringDataFromExcel("Sheet1", 2, 2);
		String expectedSkillsPage =eu.readStringDataFromExcel("Sheet1",2,3);
		String expectedEducationPage= eu.readStringDataFromExcel("Sheet1",2,4);
		String expectedProjectPage = eu.readStringDataFromExcel("Sheet1",2,5);
		 
		
		HomePage homePage = new HomePage(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(),expectedHomePageTitle,"Home Page is not displayed Successfully");
		Reporter.log("Home Page is displayed successfully", true);
		
		homePage.getProfileModuleLink().click();
		
		Assert.assertEquals(homePage.getProfileModuleLink().getText(),expectedProfilesPage,"Profile Page is not displayed Successfully");
		Reporter.log("Profile Page is displayed successfully", true);
		
		homePage.javascript(driver);
		homePage.getFirstName().sendKeys(firstname);
		
		homePage.getTechnology().click();
		homePage.technology();
		
		homePage.getSummaryModuleLink().click();
		
		Assert.assertEquals(homePage.getSummaryModuleLink().getText(),expectedSummaryPage,"Summary Page is not displayed Successfully");
		Reporter.log("Summary Page is displayed successfully", true);
		
		 WebElement text = homePage.getTypeSummary();
		text.click();
		Actions action = new Actions(driver);
		action.sendKeys(summary).click().perform();
		
		homePage.getSkillsModuleLink().click();
		
		Assert.assertEquals(homePage.getSkillsModuleLink().getText(),expectedSkillsPage,"Skills Page is not displayed Successfully");
		Reporter.log("Skills Page is displayed successfully", true);
		
		homePage.getFrontEnd().click();
		
		homePage.getOption().click();
		
		homePage.getEducation().click();
		
		Assert.assertEquals(homePage.getEducation().getText(),expectedEducationPage,"Education Page is not displayed Successfully");
		Reporter.log("Education Page is displayed successfully", true);
		
		homePage.getHighestQuali().click();
		
		homePage.highestQualification();
		
		homePage.getPassOutYear().sendKeys(""+POY);
		
		homePage.getProjectDetails().click();
		
		Assert.assertEquals(homePage.getProjectDetails().getText(),expectedProjectPage,"Project Page is not displayed Successfully");
		Reporter.log("Project Page is displayed successfully", true);
		
		homePage.getProjectName().sendKeys(PN);
		
		homePage.getDuration().click();
		homePage.duration();
		
		homePage.getDownload();
		
		homePage.download(driver);
		
		homePage.getWord().click();
		
}
}
