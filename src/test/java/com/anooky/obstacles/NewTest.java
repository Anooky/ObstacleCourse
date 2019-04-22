package com.anooky.obstacles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
WebDriver driver = new FirefoxDriver();
	
  @Test
  public void f() {
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.gecko.driver", "./geckodriver");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
