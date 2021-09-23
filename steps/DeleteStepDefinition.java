package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class DeleteStepDefinition extends BaseClass {
	@Then("Click on delete button")
	public void deleteLead() {
		driver.findElement(By.linkText("Delete")).click();
	}

	@Then("Verify the deleted result")
	public void verifyResult() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
