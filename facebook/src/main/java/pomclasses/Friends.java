package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Friends {

 @FindBy (xpath="//span[text()='Home']")	
 private WebElement frnhome;
 
 @FindBy (xpath="(//div[contains(@class,'gs1a9yip ow4ym5g4')])[2]")	
 private WebElement friend_request ;
 
 @FindBy (xpath="(//div[contains(@class,'gs1a9yip ow4ym5g4')])[3]")	
 private WebElement suggestion ;
 
 @FindBy (xpath="(//div[contains(@class,'gs1a9yip ow4ym5g4')])[4]")	
 private WebElement allfrnds ;
 
 @FindBy (xpath="(//div[contains(@class,'gs1a9yip ow4ym5g4')])[5]")	
 private WebElement birthdays;
 
 @FindBy (xpath="(//div[contains(@class,'gs1a9yip ow4ym5g4')])[6]")	
 private WebElement customlist;

 
 public Friends (WebDriver Driver) {
	 PageFactory.initElements(Driver, this);
 }
 
 public void clickOnfrnhomeTab() {
	 frnhome.click();
 }
 
 public void clickOnfriend_requestTab() {
	 friend_request.click();
 }
 
 public void clickOnsuggestionTab() {
	 suggestion.click();
 }
 
 public void clickOnallfrndsTab() {
	 allfrnds.click();
 }
	
 public void clickOnbirthdaysTab() {
	 birthdays.click();
 }	 
	 
 public void clickOncustomlistTab () {
	customlist.click();
	
 }	 
	 
	 
 
 
 
 
 
 
 
 
 
 
 
 
}
