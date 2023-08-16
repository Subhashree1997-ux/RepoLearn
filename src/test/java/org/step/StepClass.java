package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClass {
	public static WebDriver driver;
	@Given("User must be in Homepage of Facebook")
	public void tc01() {
		try {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			System.out.println("Browser Launched Successfully");
		}
		catch(Exception e){
			System.out.println("Browser not Launched Successfully");
		}
	    
	}
	@When("User should enter the username and password")
	public void tc02() {
		try{
			driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        System.out.println("Website Launched Successfully");
			}
			catch(Exception e) {
				System.out.println("Website not Launched Successfully");
			}
	    
	}
	@When("User should click the login button")
	public void tc03() {
		try {
			WebElement userName = driver.findElement(By.name("email"));
			userName.sendKeys("subamuki@");
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("12345");
			System.out.println("Credentials successfully entered");

			}
		catch(Exception e) {
			System.out.println("Username not Entered Successfully");
	}
	   
	}
	@Then("User should verify the login error message")
	public void tc04() {
	    System.out.println("Done");
	}




}
