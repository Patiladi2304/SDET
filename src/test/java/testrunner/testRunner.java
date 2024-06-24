package testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/",
		glue = "stepDefination",  
		dryRun = false,           //to check stepdefination method to compare feature file
		plugin = {"pretty","html:test-output"}, //check poutput 
		monochrome = false    //remove unnessary character from console window 
		)

public class testRunner {

}  
//execute all the : feature file {features = ".//Features/"}  & particular 2 to 3 file then {,} give only comma symbol & we use curly brases {feature 1,feature 2}
