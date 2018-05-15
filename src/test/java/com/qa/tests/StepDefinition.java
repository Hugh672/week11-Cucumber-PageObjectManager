package com.qa.tests;

import org.junit.After;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectManagement.EmployeePage;
import pageObjectManagement.LoginPage;

public class StepDefinition {


WebDriver driver = null;
	
@Before
public void method() {
	System.setProperty("webdriver.chrome.driver","C:\\Development\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	LoginPage page = PageFactory.initElements(driver, LoginPage.class);
	page.enterUserName("Admin");
	page.enterUserPassword("admin");
	page.submitButton();
		
	}

@Given("^the Add Employee Tab$")
public void the_Add_Employee_Tab() {
	EmployeePage page = PageFactory.initElements(driver, EmployeePage.class);
	page.submitButton();
}

@When("^I fill out the Employee Details correctly$")
public void i_fill_out_the_Employee_Details_correctly() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I choose to create Login Details$")
public void i_choose_to_create_Login_Details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I fill out the Login Details correctly$")
public void i_fill_out_the_Login_Details_correctly() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click the Save button$")
public void i_click_the_Save_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I can see information about the user$")
public void i_can_see_information_about_the_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@After
public void tearDown() throws InterruptedException {

	Thread.sleep(500);
	driver.close();

}
	
}
