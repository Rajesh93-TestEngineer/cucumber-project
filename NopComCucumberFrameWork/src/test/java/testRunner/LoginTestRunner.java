package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\MyProjects\\NopComCucumberFrameWork\\src\\test\\resource\\Feature\\LoginFunction.feature",
		         glue={"stepDefination"},
		         plugin= {"pretty","html:target/myreports/login.html"},
		         monochrome =true)

public class LoginTestRunner {
	

}
