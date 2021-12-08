package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_gender1")
    WebElement selectMaleRadioButton;
    @FindBy(id = "id_gender2")
    WebElement selectFemaleRadioButton;
    @FindBy(id = "customer_firstname")
    WebElement enterFirstName;
    @FindBy(id = "customer_lastname")
    WebElement enterLastName;
    @FindBy(id = "email")
    WebElement enterEmail;
    @FindBy(id = "passwd")
    WebElement enterPassword;
    @FindBy(id = "days")
    WebElement selectDays;
    @FindBy(id = "months")
    WebElement selectMonth;
    @FindBy(id = "years")
    WebElement selectYears;
    @FindBy(id = "newsletter")
    WebElement selectNewsLetter;
    @FindBy(id = "optin")
    WebElement selectSpecialOffer;
    @FindBy(id = "firstname")
    WebElement enterFirstNameAgain;
    @FindBy(id = "lastname")
    WebElement enterLastNameAgain;
    @FindBy(id = "company")
    WebElement enterCompanyName;
    @FindBy(id = "address1")
    WebElement enterAddressLine1;
    @FindBy(id = "address2")
    WebElement enterAddressLine2;
    @FindBy(id = "city")
    WebElement enterCity;
    @FindBy(id = "id_state")
    WebElement selectState;
    @FindBy(id = "postcode")
    WebElement enterPostcode;
    @FindBy(id = "id_country")
    WebElement selectCountry;
    @FindBy(id = "other")
    WebElement enterOtherDetails;
    @FindBy(id = "phone")
    WebElement enterHomePhone;
    @FindBy(id = "phone_mobile")
    WebElement enterMobilePhone;
    @FindBy(id = "alias")
    WebElement enterAddressAlias;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;
    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement verifyMyAccount;

    public void fillPersonalInformationForm(String firstName, String lastName, String password) {

        sendTextToElement(enterFirstName, firstName);
        sendTextToElement(enterLastName, lastName);
        sendTextToElement(enterPassword, password);

    }

    public void fillYourAddressDetails(String addLn1, String city, String state, String zipCd, String country, String mobileNb, String addAlias) {
        sendTextToElement(enterAddressLine1, addLn1);
        sendTextToElement(enterCity, city);
        selectByVisibleTextFromDropDown(selectState, state);
        sendTextToElement(enterPostcode, zipCd);
        selectByVisibleTextFromDropDown(selectCountry, country);
        sendTextToElement(enterMobilePhone, mobileNb);
        sendTextToElement(enterAddressAlias, addAlias);
        clickOnElement(registerButton);
    }

    public String verifyMyAccountText() {
        return getTextFromElement(verifyMyAccount);
    }
}
