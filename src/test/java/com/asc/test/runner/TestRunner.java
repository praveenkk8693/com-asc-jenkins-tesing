package com.asc.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\projects\\com-asc-jenkins-tesing\\src\\test\\resources\\features",glue= {"com.asc.test.stepdefs"})
public class TestRunner {

}
