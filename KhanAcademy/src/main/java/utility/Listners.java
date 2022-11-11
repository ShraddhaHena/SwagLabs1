package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends Baseclass implements ITestListener {
 public void onTestStart(ITestResult result) {
	 System.out.println("Test started"+ result.getName());
 }
 public void onTestSuccess(ITestResult result) {
	 try {
		Screenshot.clickss(result.getName(),driver);
	} catch (IOException e) { 
		e.printStackTrace();
	}
 }
 public void onTestFailure(ITestResult result) {
	 
 }
 
 public void onTestSkipped(ITestResult result) {
	 
 }
}
