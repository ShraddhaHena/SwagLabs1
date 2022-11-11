package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Basic.userdefine;

public class p1 {

	public static void main(String[] args) {
		WebDriver driver = userdefine.openBrowser("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("phonepe"); 
		WebElement search1 = driver.findElement(By.xpath("(//input[@value='Google Search'][1])"));
		search1.click(); 
	}
}
