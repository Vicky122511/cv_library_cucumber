package com.library.cv.pages;

import com.library.cv.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement result;
    public String getMessage(){
        return getTextFromElement(result);
    }
}
