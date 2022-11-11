package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Basic.userdefine;

public class Keyboardaction {
public static void main(String[] args) {
	WebDriver driver = userdefine.openBrowser("https://demoqa.com/text-box");
	WebElement Firstname = driver.findElement(By.xpath("//input[@id='userName']"));
	Firstname.sendKeys("Heena");
 
	Actions a = new Actions(driver);
	a.sendKeys(Keys.TAB);
	
	a.sendKeys("xyz@gmail.com");
	
	a.perform();
	
	
	
	
}
}
