package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\bddframework\\src\\test\\java\\com\\bdd\\feature",
glue="com.bdd.stepdefinition",
plugin= {"pretty","html:newtarget/newreport"},
tags= {"@Test"})
public class TestRunnerFile {

}
