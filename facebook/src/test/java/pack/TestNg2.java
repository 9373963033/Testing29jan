package pack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utility;
import pomclasses.HeaderFile;
import pomclasses.LoginPage;
import pomclasses.YourProFile;

public class TestNg2 {


	WebDriver driver;
	HeaderFile  headerfile;
	LoginPage loginpage;
	YourProFile yourprofile;
@BeforeClass
public void browserLaunch()
{
	System.setProperty("webdriver.chrome.driver","D:\\selenum\\chromedriver_win32 (3)\\chromedriver.exe"); 	
	 driver= new ChromeDriver();
}
@BeforeMethod
public void loginToApplication() throws EncryptedDocumentException, IOException
{
	 driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
//		
//		 loginpage= new LoginPage(driver);
//		 String data= Utility.fetchDataFromEXcelsheet("sheet", 2, 2);
//		loginpage.sendusername(data);
//		data= Utility.fetchDataFromEXcelsheet("sheet", 2, 2);                                //nonstatic method la objectcreate karun call kela 
//		loginpage.sendpassword(data);// object ne call method la
//	    loginpage.clickonloginbutton();
//
	
}

@Test
public void cerifyHomeTab() throws InterruptedException
{
	  headerfile =new HeaderFile(driver);
	  Thread.sleep(3000);
	   headerfile.clickOnHomeTab();
	   
	   
		  Thread.sleep(3000); 
	  String url= driver.getCurrentUrl();
	  String title= driver.getTitle();
	
	  
	 Assert.assertEquals("https://www.facebook.com/", url);
	  Assert.assertEquals("(3) Facebook", title);
	  System.out.println(url);
	  System.out.println(title);
	  
	  
	  
	  
}

@Test
public void derifyfriendTab() throws InterruptedException
{

    headerfile =new HeaderFile(driver);
    Thread.sleep(3000);
    headerfile.clickFriendsTab();
    Thread.sleep(3000);
 String url= driver.getCurrentUrl();
 String title= driver.getTitle();

 
    Assert.assertEquals("https://www.facebook.com/friends",url);
    Assert.assertEquals("(3) Friends | Facebook", title);
    
    System.out.println(url);
  System.out.println(title);
}

@AfterMethod
public void logoutFromApplication()
{
	   yourprofile= new YourProFile(driver);
	    yourprofile.toClickOnYourProfile();
	     yourprofile.toClickOnLogout();
}

@AfterClass
public void closeBrowser()
{
	driver.close();
}	
	
	
	
	
}
