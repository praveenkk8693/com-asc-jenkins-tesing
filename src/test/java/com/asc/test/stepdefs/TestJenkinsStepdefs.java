package com.asc.test.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class TestJenkinsStepdefs {
	WebDriver driver;
	@Given("open url")
	public void open_url() {
	    System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_107\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	}

}
