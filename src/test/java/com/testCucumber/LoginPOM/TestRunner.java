package com.testCucumber.LoginPOM;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="com.testCucumber.Loginpom",monochrome=true,tags="@")
public class TestRunner {

}
