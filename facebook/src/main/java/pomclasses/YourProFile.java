package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourProFile {
	
 @FindBy (xpath="//div[@aria-label='Your profile']")
 private WebElement your_profile;
		
 @FindBy (xpath="(//div[contains(@class,'qzhwtbm6 knvmm38d')])[1]")
 private WebElement profilename ;
 
 @FindBy (xpath="(//div[contains(@class,'qzhwtbm6 knvmm38d')])[2]")
 private WebElement seeprofile ;
 
 @FindBy (xpath="(//span[text()='Settings & privacy'])[1]")
 private WebElement setting ;
 
 @FindBy (xpath="//span[text()='Help & support']")
 private WebElement help_support ;
 
 @FindBy (xpath="//span[text()='Display & accessibility']")
 private WebElement display ;
 
 @FindBy (xpath="//span[text()='Give feedback']")
 private WebElement feedback;
 
 @FindBy (xpath="//span[text()='Log Out']")
 private WebElement  logout;
 
 
 public YourProFile(WebDriver Driver) {
	 PageFactory.initElements(Driver, this);
	 }
 
 public void toClickOnYourProfile() {
	
	 your_profile.click();
 }
 
 public void toClickOnProfileName() {
	 
	 profilename.click();
 }
 
 public void toClickOnSeeProfile() {
	 
	 seeprofile.click();
 }
 
 public void toClickOnSetting() {
	 
	 setting.click();
 }
 
 public void toClickOnhelp_support() {
	 
	 help_support.click();
 }
 
 public void toClickOnDisplay() {
	 
	 display.click();
 }
 
 public void toClickOnFeedback() {
	 
	 feedback.click();
 }
 
 public void toClickOnLogout() {
	 
	 logout.click();
 }		
			
				
 }
 
 
 

