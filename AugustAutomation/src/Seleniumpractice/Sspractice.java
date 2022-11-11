package Seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sspractice {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\Users\\shrad\\OneDrive\\Desktop\\Screenshot\\hii.png");
	
	FileHandler.copy(source, destination);
	
}
	

}
