package CucumberOptions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRMBDD\\src\\test\\java\\FeatureFile\\Login.feature"
,glue="stepDefination"
,monochrome=true,
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun=false)
public class TestRunner {

}
