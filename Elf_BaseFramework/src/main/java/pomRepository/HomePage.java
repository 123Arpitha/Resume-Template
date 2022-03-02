package pomRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Profile']") 
	private WebElement profileModuleLink;

	public WebElement getProfileModuleLink() {
		return profileModuleLink;
	}
	
	@FindBy(xpath="//label[text()='FirstName']/..//input[@type='text']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(xpath="//input[@value='LastName']")
	private WebElement lastName;
	
	
	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(id="Technology")
	private WebElement technology;
		

	public WebElement getTechnology() {
		return technology;
	}
	@FindBy(xpath="//button[text()='Summary']")
	private WebElement summaryModuleLink;

	public WebElement getSummaryModuleLink() {
		return summaryModuleLink;
	}
	@FindBy(xpath="//div[@class='input-data']")
	private WebElement typeSummary;
	
	public WebElement getTypeSummary() {
		return typeSummary;
	}
	@FindBy(xpath="//button[text()='Skills']")
	private WebElement skillsModuleLink;
	
	@FindBy(xpath="//li[.='React js']")
	private WebElement option;
 
	public WebElement getOption() {
		return option;
	}
	public WebElement getSkillsModuleLink() {
		return skillsModuleLink;
	}
	@FindBy(xpath="//li[.='React js']")
	private WebElement FECheckbox;
	
	@FindBy(xpath="//input[@placeholder='Frontend Technologies']")
	private WebElement frontEnd;
	
	@FindBy(xpath="//input[@placeholder='Backend Technologies']")
	private WebElement backEnd;
	
	@FindBy(xpath="//button[text()='Education']")
	private WebElement education;
	
	@FindBy(id="Highest Education")
	private WebElement highestQuali;
	
	@FindBy(xpath="//label[text()='Pass out Year']/..//input[@type='number']")
	private WebElement PassOutYear;
	
	@FindBy(xpath="//button[text()='ProjectDetails']")
	private WebElement projectDetails;
	
	@FindBy(xpath="//label[text()='Project Name']/..//input[@type='text']")
	private WebElement projectName;
	
	@FindBy(id="Duration")
	private WebElement duration;
	
	@FindBy(xpath="//button[text()='Download as']")
	private WebElement download;
	
	@FindBy(xpath="//button[text()='PDF']")
	private WebElement pdf;
	
	@FindBy(id="Total Experience")
	private WebElement totalExperienceYear;
	
	@FindBy(xpath="//option[@value='3']/../..//label[text()='Total Exp(month)']/../..//select[@id='Total Experience']")
	private WebElement totalExMonth;
	
	@FindBy(xpath="//option[@value='5']/../..//option[text()='Select Year']/../..//select[@id='Relevant Experience']")
	private WebElement relExpYear;
	
	@FindBy(xpath="//option[@value='6']/../..//label[text()='Relevant Exp(month)']/../..//select[@id='Relevant Experience']")
	private WebElement relExpMonth;
	
	@FindBy(xpath="//button[text()='WORD']")
	private WebElement word;
	
	
	public WebElement getWord() {
			return word;
		}
	public WebElement getRelExpMonth() {
			return relExpMonth;
		}
	public WebElement getRelExpYear() {
			return relExpYear;
		}
	public WebElement getTotalExMonth() {
			return totalExMonth;
		}
	public WebElement getTotalExperienceYear() {
			return totalExperienceYear;
		}
	public WebElement getPdf() {
			return pdf;
		}
	public WebElement getDownload() {
			return download;
		}
	public WebElement getDuration() {
			return duration;
		}
	public WebElement getProjectName() {
			return projectName;
		}
	public WebElement getProjectDetails() {
			return projectDetails;
		}
	public WebElement getPassOutYear() {
			return PassOutYear;
		}
	public WebElement getHighestQuali() {
			return highestQuali;
		}
	public WebElement getEducation() {
			return education;
		}
	public WebElement getBackEnd() {
			return backEnd;
		}
	public WebElement getFrontEnd() {
			return frontEnd;
		}
	public WebElement getFECheckbox() {
			return FECheckbox;
		}
	public void javascript(WebDriver driver) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='';", firstName);
	}
	public void technology() {
		Select select = new Select(technology);
		select.selectByVisibleText("Java Full Satck");
	}
	
	public void highestQualification() {
		Select select = new Select(highestQuali);
		select.selectByValue("0");
	}
	public void duration() {
		Select select = new Select(duration);
		select.selectByValue("7");
	}
	public void download(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(download).perform();
		
	}
	public void javascript1(WebDriver driver) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='';", lastName);
	}
	public void totalExpYear() {
		Select select = new Select(totalExperienceYear);
		select.selectByValue("7");
	}
	public void totalExpierenceMon() {
		Select select = new Select(totalExMonth);
		select.selectByValue("7");
	}
	
	public void relExpYear() {
		Select select = new Select(relExpYear);
		select.selectByValue("8");
	}
	public void relExpierenceMon() {
		Select select = new Select(relExpMonth);
		select.selectByValue("9");
	}
	}