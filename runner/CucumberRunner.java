package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Leads.feature",
                     glue="steps", 
                     dryRun = false,
                     monochrome= true,
                     publish = true )
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
