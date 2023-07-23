package com.library.cv.steps;

import com.library.cv.pages.HomePage;
import com.library.cv.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifySteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }

    @When("I accept cookies")
    public void iAcceptCookies() {
        new HomePage().acceptCookies();
    }

    @And("Enter job Title {string}")
    public void enterJobTitle(String jtitle) {
        new HomePage().enterJobTitle(jtitle);
    }

    @And("Enter Location {string}")
    public void enterLocation(String loc) {
        new HomePage().enterLocation(loc);
    }

    @And("Select Distance {string}")
    public void selectDistance(String dis) {
        new HomePage().selectDistance(dis);
    }

    @And("Click on More Search Option")
    public void clickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("Enter Minimum Salary {string}")
    public void enterMinimumSalary(String minSal) {
        new HomePage().enterMinSalary(minSal);
    }

    @And("Enter Maximum Salary {string}")
    public void enterMaximumSalary(String maxSal) {
        new HomePage().enterMaxSalary(maxSal);
    }

    @And("Select Salary Type {string}")
    public void selectSalaryType(String salType) {
        new HomePage().selectSalaryType(salType);

    }

    @And("Select Job Type {string}")
    public void selectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("Click on Find job Button")
    public void clickOnFindJobButton() {
        new HomePage().clickOnFindJobButton();
    }

    @Then("User should see error Message {string}")
    public void userShouldSeeErrorMessage(String errorMessage) {
        String actualText= new ResultPage().getMessage();
        String expectedText= errorMessage;
        Assert.assertEquals(actualText,expectedText,"Header Text Not Matched");
    }
}
