package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	
	@FindBy (xpath="//span[text()='Create Story']")
	private WebElement createstory; 
	
	@FindBy (xpath="//div[contains(@class,'oajrlxb2 g5ia77u1')]//div[1]")
	private WebElement livevideo;
	
	@FindBy (xpath="//span[text()='Photo/video']")
	private WebElement photo;
	
	@FindBy (xpath="(//div[contains(@class,'oajrlxb2 g5ia77u')])[4]")
	private WebElement feeling;
	
	@FindBy (xpath="(//div[contains(@aria-label,'video chats' )])[2]")
	private WebElement create_room;
	
	@FindBy (xpath="//span[text()='No more posts']")
	private WebElement no_more_post;
	
	@FindBy (xpath="(//span[text()='Find Friends'])[3]")
	private WebElement find_friends;
	
	public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnHomeFunction() {
		createstory.click();
		livevideo.click();
		photo.click();
		feeling.click();
		create_room.click();
		no_more_post.click();
		find_friends.click();
		
	}
	
	
	

}
