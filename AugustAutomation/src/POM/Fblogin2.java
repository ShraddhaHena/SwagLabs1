package POM;

import org.openqa.selenium.WebDriver;

import Basic.userdefine;

public class Fblogin2 {
   public void LoginWithValidCredentials() 
   {
	   WebDriver driver = userdefine.openBrowser("https://www.facebook.com");
	   FbloginPage fblogin =new FbloginPage(driver);
	   fblogin.enterEmaild("shraddhanjalinayak007@gmail.com");
	   fblogin.enterpassword("shraddha@21");
	   fblogin.clickLOgin();
	 
   }
   
   
}
