package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
public static ExtentReports createReport() {
	ExtentReports report = new ExtentReports();
	ExtentSparkReporter html = new ExtentSparkReporter("ExtentReport.html");
	report.attachReporter(html);
	report.setSystemInfo("CreatedBy", "Shraddha");
	report.setSystemInfo("TestSuite", "Regression");
	return report;

}
}
