package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@title='Women']")
    WebElement clickOnWomenLink;
    @FindBy(xpath = "(//a[@title='Dresses'][normalize-space()='Dresses'])[1]")
    WebElement clickOnDressesLink;
    @FindBy(xpath = "(//a[@title='T-shirts'][normalize-space()='T-shirts'])[2]")
    WebElement clickOnTShirtsLink ;
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInLink;
    @FindBy(xpath ="//img[@alt='My Store']" )
    WebElement logoLink;


    public void setClickOnWomenLink(){
        //Reporter.log("Clicking on Women link " + clickOnWomenLink.toString() + "<br>");
        clickOnElement(clickOnWomenLink);
    }

    public void setClickOnDressesLink(){
        //Reporter.log("Clicking on Dresses link " + clickOnDressesLink.toString() + "<br>");
        clickOnElement(clickOnDressesLink);
    }
    public void setClickOnTShirtsLink(){
        //Reporter.log("Clicking on T-Shirt link " + clickOnTShirtsLink.toString() + "<br>");
        clickOnElement(clickOnTShirtsLink);
    }
    public void setClickOnSignInLink() {
        //Reporter.log("Clicking on SignIn link " + signInLink.toString() + "<br>");
        clickOnElement(signInLink);
    }
    public String verifyLogo(){
        // Reporter.log("Verifying Logo " + logoLink.toString()+"<br>");
        return getTextFromElement(logoLink);
    }
    public String signButtonVerify(){
        return getTextFromElement(signInLink);
    }
}
