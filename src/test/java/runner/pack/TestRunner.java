package runner.pack;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
//to provide location of feature file and stepdefinition file
@CucumberOptions(features="src/test/resources/Features", glue= {"stepdefinitions"},
monochrome=true,
//to generate reports use plugins

plugin = { "pretty", "html:target/HTMLReports/report.html", "json:target/JSONreports/report.json",  "junit:target/Junitreports/report.xml"})
public class TestRunner  extends AbstractTestNGCucumberTests {

}
