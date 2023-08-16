package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\LoginPage.feature", glue = "org.step")
public class TestRunnerClass {
//	@AfterClass
//	public static void tc01() {
//		ReportingClass.generateReport("target\\jsonReport.json");
	// plugin({"html:C:\Users\Dinesh\Desktop\New
	// Folder2\htmlReport","json:C:\Users\Dinesh\Desktop\New
	// Folder2\jsonReport.json","junit:C:\Users\Dinesh\Desktop\New
	// Folder2\junitReport.junit"})
}
