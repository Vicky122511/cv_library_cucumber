package com.library.cv.pages;

import com.library.cv.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
            @FindBy(xpath = "//input[@id='keywords']")
            WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButton;

    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;

    public void acceptCookies(){
        driver.switchTo().frame(acceptIFrame);
        clickOnElement(acceptCookies);
    }
    public void enterJobTitle(String jobTitle1)
    {
        sendTextToElement(jobTitle,jobTitle1);

    }

    public void enterLocation(String location1)
    {
        sendTextToElement(location,location1);
    }

    public void selectDistance(String distance)
    {
        selectByVisibleTextFromDropDown(distanceDropdown,distance);

    }

    public void clickOnMoreSearchOptionLink()
    {
        clickOnElement(moreSearchOptionLink);
    }

    public void enterMinSalary(String minSalary)
    {
        sendTextToElement(salaryMin,minSalary);
    }

    public void enterMaxSalary(String maxSalary)
    {
        sendTextToElement(salaryMax,maxSalary);
    }

    public void selectSalaryType(String sType)
    {
        selectByVisibleTextFromDropDown(salaryTypeDropdown,sType);
    }

    public void selectJobType(String jobType)
    {
        selectByVisibleTextFromDropDown(jobTypeDropdown,jobType);
    }

    public void clickOnFindJobButton()
    {
        clickOnElement(findJobButton);
    }



}

