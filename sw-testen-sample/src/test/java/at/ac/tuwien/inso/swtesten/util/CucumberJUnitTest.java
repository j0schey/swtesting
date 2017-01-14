package at.ac.tuwien.inso.swtesten.util;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 * Connects Cucumber .feature-files and JUnit Runner and
 * allows to run all scenarios that are annotated with @Sample
 * or @Lab as JUnit4 test.
 * 
 * TODO: Replace existing @CucumberOptions with uncommented
 * when developing your own Cucumber test cases in the lab.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/sample"}, 
				 glue = {"at.ac.tuwien.inso.swtesten.sample"}, 
				 format = {"html:target/cucumber-html-report","json:target/cucumber-json-report.json"}
)

//@CucumberOptions(features={"src/test/resources/lab"}, 
//				 glue= {"at.ac.tuwien.inso.swtesten.lab"}, 
//				 format = {"html:target/cucumber-html-report","json:target/cucumber-json-report.json"}
//)

public class CucumberJUnitTest {
}
