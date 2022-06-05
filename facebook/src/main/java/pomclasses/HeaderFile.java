package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderFile {

	
	@FindBy (xpath= "//label[contains(@class,'lzcic4wl')]")
	private WebElement search;
	
    @FindBy(xpath= "//a[@aria-label='Home']")	
	private WebElement home; 
		
	@FindBy (xpath="//a[@aria-label='Friends']")	
	private WebElement friends;
	
	@FindBy(xpath="//a[@aria-label='Groups']")
	private WebElement group;
	
	@FindBy (xpath= "//a[@aria-label='More']")
	private WebElement more;
	
	@FindBy (xpath="//div[@fill-rule='evenodd']")
	private WebElement create;
	
	@FindBy (xpath="(//div[@aria-label='Messenger'])[1]")
	private WebElement messenger ;
	
	@FindBy (xpath= "//a[@aria-label='Notifications']")
	private WebElement notifications;
	
         
    
	public HeaderFile(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		
	public void clickOnSearchTab() {
	
		search.click();
		 
	}
	
	public void clickOnHomeTab() {
	    home.click();
	}
	
	public void clickFriendsTab () {
		friends.click();
	}
	
	public void clickOnGroupTab() {
		group.click();
	}
	public void clickOnMoreTab() {
		more.click();
	}
	
	public void ClikOnCreateTab() {
	 create.click();
	}
	
	public void clickonMassengertab() {
	messenger.click();
	}
	
	public void clickonNotisfication() {
	notifications.click();	
	}
	
	
	}
	

