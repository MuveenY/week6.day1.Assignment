package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class DuplicateLeadStepDefinition extends BaseClass {

	
	@Then("Click on duplicate lead button")
	public void clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
}
