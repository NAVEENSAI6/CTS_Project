package com.TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\resources\\Feature\\Addtocart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_Loginpage ","@TC02_Addtocart","@TC03_Deletefromcart","@TC04_Proceedtocheck","@TC05_Iteminstock","@TC06_Paymentdetails"},
		glue = {"com.StepDefinition"},
		monochrome=true
		)
public class AddtocartTR
{

}