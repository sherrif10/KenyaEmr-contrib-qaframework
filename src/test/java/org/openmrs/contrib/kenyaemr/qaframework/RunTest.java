package org.openmrs.contrib.kenyaemr.qaframework;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        // defining ordered by name features folder
        features = { "src/features" },
        // defining the definition steps package
        glue = " org.openmrs.contrib.kenyaemr.qaframework.automation", plugin = { "html:target/index.html",
            "message:target/cucumber.ndjson" }, monochrome = true)
public class RunTest {
	
	public class HOOK {
		
		public static final String LOGIN = "@login";
	}
}
