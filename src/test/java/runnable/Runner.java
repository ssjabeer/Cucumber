package runnable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Featruefiles/cadactin.feature", glue = {"stepdefinition"})


public class Runner {

}


