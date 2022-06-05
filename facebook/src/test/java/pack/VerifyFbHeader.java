package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.HeaderFile;
import pomclasses.LoginPage;
import pomclasses.YourProFile;


public class VerifyFbHeader {
public static void main(String[] args) throws InterruptedException {
               //testcase1

	System.setProperty("webdriver.chrome.driver","D:\\chrom\\chromedriver_win32 (1)\\chromedriver.exe"); 	
	WebDriver driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	driver.get("https://www.facebook.com/");
	
	LoginPage loginpage= new LoginPage(driver);
	loginpage.sendusername(); //nonstatic method la objectcreate karun call kela 
	loginpage.sendpassword();// object ne call method la
    loginpage.clickonloginbutton();

    Thread.sleep(3000);
    HeaderFile  headerfile =new HeaderFile(driver);
   headerfile.clickOnHomeTab();
   
  String url= driver.getCurrentUrl();
  String title= driver.getTitle();
  
   if (url.equals("https://www.facebook.com/?sk=welcome")&&(title.equals("Facebook")))
   {
	  System.out.println(title ); 
	  System.out.println(url);
   	System.out.println("pass");
   }
   else
   {
	  System.out.println(title ); 
	  System.out.println(url);
   	System.out.println("fail");
   }
   Thread.sleep(3000);
     YourProFile yourprofile= new YourProFile(driver);
     Thread.sleep(200);
     yourprofile.toClickOnYourProfile();
     yourprofile.toClickOnLogout();
  //driver.close();
     
	 driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

     driver.get("https://www.facebook.com/");
    loginpage= new LoginPage(driver);
	loginpage.sendusername(); //nonstatic method la objectcreate karun call kela 
	loginpage.sendpassword();// object ne call method la
    loginpage.clickonloginbutton();

 
  Thread.sleep(2000);

    headerfile =new HeaderFile(driver);
    headerfile.clickFriendsTab();
 
  url= driver.getCurrentUrl();
  title= driver.getTitle();

  if (url.equals("https://www.facebook.com/?sk=welcome")&& title.equals("Facebook"))
  {
	  System.out.println(url);
	  System.out.println(title);
 	System.out.println("pass");
  }
  else
  {
	  System.out.println(url);
	  
	  System.out.println(title);    
 	System.out.println("fail");
  }
  
  Thread.sleep(6000);
   yourprofile= new YourProFile(driver);
  Thread.sleep(200);
  yourprofile.toClickOnYourProfile();
  Thread.sleep(4000);
  yourprofile.toClickOnLogout();
driver.close();
 
 
   
}
	

}
