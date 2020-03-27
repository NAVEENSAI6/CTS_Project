package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\hp\\Downloads\\845200_ctsproject\\src\\main\\resources\\Feature\\Addtocart.feature",
	    plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		//tags = {"@TC_01,@TC_02,@TC_03,@TC_04,@TC_05, @TC_06"},
		glue = {"com.StepDefinition"},
		monochrome=true
		)
public class AddtocartTR
{
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}