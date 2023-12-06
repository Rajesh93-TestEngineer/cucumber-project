package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\MyProjects\\NopComCucumberFrameWork\\src\\test\\resource\\Feature\\Customers.feature",
                 glue= {"stepDefination"},
                  plugin = {"pretty","html:target/myreports/customer.html"},
                   monochrome=true)
                 
public class CustomerRunner {

}
