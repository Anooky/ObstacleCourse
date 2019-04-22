package com.anooky.obstacles;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
	
WebDriver driver = null;
	
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
