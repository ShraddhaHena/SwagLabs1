package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Basic.userdefine;

public class MouseAction {
public static void main(String[] args) {
	WebDriver driver = userdefine.openBrowser("https://www.globalsqa.com/demo-site/draganddrop ");
	
	WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(iframe);
	WebElement source = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
	WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
	
	Actions a = new Actions(driver);
	a.dragAndDrop(source, destination);

	a.perform();
		
}

}
