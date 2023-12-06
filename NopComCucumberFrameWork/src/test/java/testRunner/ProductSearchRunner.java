package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\MyProjects\\NopComCucumberFrameWork\\src\\test\\resource\\Feature\\ScenarioOutProductSearch.feature",
                 glue= {"stepDefination"},
                 plugin= {"pretty","html:target/myreports/product.html"},
                 monochrome=true)

public class ProductSearchRunner {
}
