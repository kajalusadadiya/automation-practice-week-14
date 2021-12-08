package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@title='Women']")
    WebElement clickOnWomenLink;
}
