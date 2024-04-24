package StepDefinitions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import TestRunner.listener;
import io.cucumber.java.en.*;

//@Listeners(listener.class)
public class loginPageSteps {
	static WebDriver driver;
	@Test
	@Given("User is on login page")
	public void user_is_on_login_page() {
	 driver = new ChromeDriver();  // chrome driver
		
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.saucedemo.com/");
	}
	
	//@When("User enter valid username and password")
		//public void user_enter_valid_username_and_password() {
	@Test

	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) {
	
	 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	 
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	
	}
	@Test
	@And("click on Login Button")
	public void click_on_login_button() {
	  driver.findElement(By.id("login-button")).click();
	}
	@Test
	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		boolean status = driver.findElement(By.cssSelector(".app_logo")).isDisplayed();
		Assert.assertEquals(true, status);
	}
	@Test
	@And("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
