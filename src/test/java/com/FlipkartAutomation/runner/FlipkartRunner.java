package com.FlipkartAutomation.runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/main/java/com/FlipkartAutomation/featurefile"}
		,glue= {"com.FlipkartAutomation.StepDefinition","com.FlipkartAutomation.GeneralHooks"},
				monochrome = true,
				dryRun = false
		)

public class FlipkartRunner extends AbstractTestNGCucumberTests{
//  @Test
//  public void f() {
//  }
}
