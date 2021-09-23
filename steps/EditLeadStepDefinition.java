package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass {
	@When("Click on Find Leads button")
	public void findLeads() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
	}
    @When("Click on Phone")
	public void clickPhone() {
    	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
    @When("Enter the search phone number as {string}")
	public void enterPhNo(String ph) {
    	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}

	/*
	 * @Then("Click on Find Leads button") public void findLead() throws
	 * InterruptedException {
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * Thread.sleep(2000); }
	 */
    @Then("Click on first displayed result")
	public void clickFirstResult() {
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
     @Then("Click on edit button")
	public void clickEdit() {
    	 driver.findElement(By.linkText("Edit")).click();
	}
     @Then("Enter the update company name as {string}")
	public void enterCompany(String cName) {
    	 WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
 		companyName.clear();
 		companyName.sendKeys(cName);
	}

}
