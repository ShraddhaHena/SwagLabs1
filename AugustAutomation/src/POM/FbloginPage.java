//For every POM Page Object Module ,,class name ends with Page
// In this page we r creating object repository which means storing all the data members & smethod functions in a separate file.
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPage {
 
	@FindBy(xpath ="//input[@id='email']")private WebElement Email;
	// @FindBy will find out email by using xpath and will save it in private webElement Email.
	@FindBy(xpath ="//input[@id='pass']")private WebElement password; // reference variables are at the end of the program line
	@FindBy(xpath ="//button[@name='login']")private WebElement login;
	@FindBy(xpath ="//a[text()='Forgotten password?']")private WebElement forgot;
	@FindBy(xpath ="//a[@data-testid='open-registration-form-button']")private WebElement Signup;
	@FindBy(xpath ="//a[text()='Create a Page']")private WebElement createpage;
     // elements in pom are always private but constructor should be  public 
    // Codes in side Constructor always Executes first(only Once)
	//@findby also needs driver but here there is no driver ,, There is class PageFactory in selenium helps as driver & initElement is method of PageFactory
    //initElement helps @Findby to run
		public FbloginPage(WebDriver driver) // constructor
		{
			PageFactory.initElements(driver,this ); // "this" stands for InitElement will trigger or run only this(FbloginPage) class.
		}
	// initElement is static method because it is called using class name & it trigger @FindBY to find elements
		
		
		
		public void enterEmaild(String mail) 
		{
			Email.sendKeys(mail);
		}
		
		public void enterpassword(String pass) 
		{
			password.sendKeys(pass);
		}
		public void clickLOgin() 
		{
			login.click();
		}
		public void clickOnForgot()
		{
			forgot.click();
		}
		 public void clickOnCreatepage()
		{
			createpage.click(); 
		}
		
}
/// IN POM we use an annotation @FindBy , @FindBY Works as FindElement i.e; helps to find out Web Element

































