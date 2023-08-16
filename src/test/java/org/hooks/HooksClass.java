package org.hooks;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends BaseClass {
	@Before
	public void tc01() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		System.out.println("Browser Launched Successfully");
		driver.get("https://affiliate.flipkart.com/login");
        driver.manage().window().maximize();
        System.out.println("Website Launched Successfully");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	@After
	public void tc02() {
		driver.close();
		driver.quit();
	}
	
	

}
