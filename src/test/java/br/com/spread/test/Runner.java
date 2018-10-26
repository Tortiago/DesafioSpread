package br.com.spread.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		features = "classpath:.\\features", 
		glue = "br.com.spread.definition", 
		plugin = "pretty", 
		tags = "@BuscaDeExames", 
		monochrome = true, 
		dryRun = false)
public class Runner {
		
}
