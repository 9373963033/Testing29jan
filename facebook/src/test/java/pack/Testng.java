package pack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser.Base;
import Utils.Utility;
import pomclasses.HeaderFile;
import pomclasses.LoginPage;
import pomclasses.YourProFile;

public class Testng {
	
	WebDriver driver;
	HeaderFile  headerfile;
	LoginPage loginpage;
	YourProFile yourprofile;
	int	i;
@Parameters("browser")	
@BeforeTest	
public void launchBrowser(String browser)	{
	
 System.out.println(browser);
 
 if (browser.equals("Chrome"))
 {
	 driver= Base.openChromeBrowser();
 }
// if(browser.equals("Firefox"))
// {
//	 driver= Base.OpenFireFoxBrowser();
// }
 if (browser.equals("Edge"))
 {
	 driver=Base.EdgeBrowser();
	 }
 driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);

}
	
	
@BeforeClass
public void pomClassObject() 
{      
	loginpage= new LoginPage(driver);	
	  headerfile =new HeaderFile(driver);
	  yourprofile= new YourProFile(driver);
	
	}
@BeforeMethod
public void loginToApplication() throws InterruptedException, EncryptedDocumentException, IOException
{
	
		driver.get("https://www.facebook.com/");
		
		 Thread.sleep(3000);
		// String data= Utility.fetchDataFromEXcelsheet("sheet", 1, 1);
		loginpage.sendusername();
		//data=Utility.fetchDataFromEXcelsheet();                                   // nonstatic method la objectcreate karun call kela 
		loginpage.sendpassword();
		Thread.sleep(3000);// object ne call method la
	    loginpage.clickonloginbutton();
		
	
}

@Test
public void aerifyHomeTab() throws InterruptedException
{
	  Thread.sleep(5000);
	   headerfile.clickOnHomeTab();
	    
	   
	   Thread.sleep(2000);
	  String url= driver.getCurrentUrl();
	  String title= driver.getTitle();

	 Assert.assertEquals("https://www.facebook.com/", url);
	  Assert.assertEquals("(3) Facebook", title);
	  System.out.println(url);
	  System.out.println(title);
	  
	  
	  
	  
}

@Test
public void berifyfriendTab() throws InterruptedException
{

	 Thread.sleep(2000);
   
    headerfile.clickFriendsTab();
   
 String url= driver.getCurrentUrl();
 String title= driver.getTitle();

//  if (url.equals("https://www.facebook.com/?sk=welcome")&& title.equals("Facebook"))
//  {
//	  System.out.println(url);
//	  System.out.println(title);
// 	System.out.println("pass");
//  }
//  else
//  {
//	 
//	  System.out.println(url);
//	  System.out.println(title); 
// 	System.out.println("fail");
//  }
 Thread.sleep(2000);
    Assert.assertEquals("https://www.facebook.com/friends",url);
    Assert.assertEquals(" Friends | Facebook", title);
    System.out.println(url);
  System.out.println(title);  
  Thread.sleep(2000);
}

@AfterMethod
public void logoutFromApplication(ITestResult result) throws IOException, InterruptedException {    
i++;
	if(ITestResult.FAILURE==result.getStatus())
	{ Utility.getScreenshot(driver,i);}
	
	    yourprofile.toClickOnYourProfile();
	     yourprofile.toClickOnLogout();
	     Thread.sleep(2000);
	     
	     
}


@AfterClass
public void clearBrowser() throws InterruptedException
{ 
	  Thread.sleep(2000);
	loginpage=null;
	headerfile=null;
	yourprofile=null;
}

@AfterTest
 public void closeBrowser() {
	
	driver.close();
	driver=null;
	System.gc();
}
}





