package com.cucu.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\GUNTUKU GEETHANJALI\\Downloads\\CucumberCA2\\Cucumber\\features",
glue="com.cucu.stepDefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:test-output"})

public class Runner {

}
