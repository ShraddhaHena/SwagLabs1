package Assertion;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basic.userdefine;

public class Facebooklogin {
WebDriver driver;

@BeforeMethod
public void launchBrowser() {
driver = userdefine.openBrowser("https://www.facebook.com/");
}
@Test
public void login() {
	
}
}
