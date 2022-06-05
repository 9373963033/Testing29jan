package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()='Log In']")
	private WebElement login;
	
	@FindBy (xpath="//a[text()='Create New Account']")
	private WebElement cre_n_acc;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendusername() {
		username.sendKeys("9373963033");
	}
	public void sendpassword() {
		password.sendKeys("priyapawar");
	}
	public void clickonloginbutton() {
		login.click();
	}
	
/*	public void loginToApplication() {
		username.sendKeys("9373963033");
		password.sendKeys("priyapawar");
		login.click();*/

	
	
	
	
	
}

