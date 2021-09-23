package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
	
	@When("Click on Create Lead")
  	public void createLead() {
      	driver.findElement(By.linkText("Create Lead")).click();

  	}
      @Given("Enter the first name as {string}")
  	public void firstName(String fName) {
      	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

  	}
      @Given("Enter the last name as {string}")
  	public void lastName(String lName) {
      	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

  	}
      @Given("Enter the phone number as {string}")
  	public void phoneNo(String ph) {
      	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);

  	}
      @Given("Enter the company name as {string}")
  	public void companyName(String company) {
      	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);

  	}
      @Then("Click on submit button")
  	public void submit() {
      	driver.findElement(By.name("submitButton")).click();

  	}

}
