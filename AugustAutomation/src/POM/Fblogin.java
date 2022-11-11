package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Basic.userdefine;

public class Fblogin{
	
public void loginwithvalidcredential() {
		WebDriver driver =userdefine.openBrowser("https://www.facebook.com/");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("xyz@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
        login.click();
}
public void loginWithoutPassword() {
	WebDriver driver =userdefine.openBrowser("https://www.facebook.com/");
	
	WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("xyz@gmail.com");
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    login.click();
}
public void loginWithoutEmail() {
	WebDriver driver =userdefine.openBrowser("https://www.facebook.com/");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("12345");
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    login.click();
}


//normal execution not POM This class will shorted by pom execution in class Fblogin2





}
