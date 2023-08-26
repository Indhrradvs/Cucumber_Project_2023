package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  /* To import Cucumber.class, click as cmd+Shift+O */

@CucumberOptions(features="src/test/resources/Features",glue={"com.stepDefinition"},

monochrome=true,

//    plugin= {"html:Reports/HTMLReports.html"} //My Reports: Folder Name, HTMLReports: File Name

//    plugin= {"json:Reports/JsonReports.json"}

//    plugin= {"junit:Reports/JunitReports.xml"}
		

/* If you want to generate all formats at the same time then use below type */


plugin= {"html:Reports/HTMLReports/Cucumber.html", "json:Reports/JsonReports/cucumber.json", "junit:Reports/JunitReports/cucumber.xml"}, 

           /* HTMLReports, JunitReports, JSON Reports are folders */


//dryRun=true


/* dryRun = True, then it checks all the steps have the step definition
            
            and show results if something failed but it won't start execution.*/

dryRun=false /* dryRun = FALSE,then it will start execution. */


//strict= true	  /* Strict = True will fail if there are undefined or pending steps */

		)

/* FEATURES is used to locate the feature file in the product folder structure
 * 
 *  GLUE helps CUCUMBER to locate the step definition file 
 
 *  MONOCHROME = TRUE then It will make console output for the Cucumber test much more 
  
   readable and remove any unreadable character.
   
 *  MONOCHROME = FALSE then It will make console output for the Cucumber test with unreadable character.
   
 *  PLUG IN is used to specify different formatting options for output reports. Ex: HTML, JSON, XML etc
   
 */


public class Runner {

}
