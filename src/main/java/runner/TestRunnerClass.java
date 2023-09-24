package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/main/java/feature1.feature",  //path of feature file package in project
	glue = "stepDefination",      //Name of package in which all step definition files are present
//	tags = "@smoke and @sanity",              //tags= "not @Payment"
//	tags = "@smoke or @sanity",  
//	tags = "@smoke , @sanity",  
//	dryRun=true,                    //ony provide runs step
//	stepNotifications = true       //only provde notification
//	name = "Amazon"
//  monochrome=true
	plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}

)
public class TestRunnerClass {

}
