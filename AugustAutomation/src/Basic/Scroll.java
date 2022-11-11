 package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = userdefine.openBrowser("https://vctcpune.com/selenium/practice.html");
	
	WebElement mouse = driver.findElement(By.xpath("//button[@id='mousehover']"));
	Thread.sleep(2000);
	
	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", mouse);
	
//"arguments[0].scrollIntoView(true)" means  driver execute script from zero level to scrollIntoView must be true(mouse).
      ((JavascriptExecutor)driver).executeScript("window.scrollBy(700,200)");

}
}
//done