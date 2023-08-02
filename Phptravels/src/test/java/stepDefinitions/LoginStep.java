package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseTest.BaseTest;
import PageObjects.LoginLocators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseTest{
	
	
	
@When("clicked on login button")
public void clicked_on_login_button() throws IOException {
	 
	landingPage();
	loginloc.landPage();
   
}
@Given("^Enter (.+) and (.+) in login page$")
public void enter_godd_gmail_com_and_password123_in_login_page(String emailid, String password) throws InterruptedException {
	loginloc.login(emailid, password);
	}
@When("verify not a robot by clicking checkbox")
public void verify_not_a_robot_by_clicking_checkbox() {
    
}
@When("click on login button")
public void click_on_login_button() {
    
}
@Then("home page should be displayed")
public void home_page_should_be_displayed() {
    
}


}
