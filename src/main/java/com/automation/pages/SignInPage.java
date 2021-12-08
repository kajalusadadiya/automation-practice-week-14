package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "email")
    WebElement clickOnEmail;
    @FindBy(id = "passwd")
    WebElement clickOnPassword;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]/i[1]")
    WebElement clickOnSignInButton;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement clickOnCreateAnAccount;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement verifyAuthentication;
    @FindBy(xpath = "button[id='SubmitCreate'] span")
    WebElement verifyCreateAnAccount;
    @FindBy(id = "email_create")
    WebElement createNewEmail;
    @FindBy(xpath = "(//div[@class='alert alert-danger'])[1]")
    WebElement verifyAuthenticationFailedMessage;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement verifyLogOutLink;


    public void signInWithUserNameAndPassword(String userName, String password) {
        sendTextToElement(clickOnEmail, userName);
        sendTextToElement(clickOnPassword, password);
        clickOnElement(clickOnSignInButton);
    }

    public void setClickOnCreateAnAccount(String userName) {
        sendTextToElement(createNewEmail, userName);
        clickOnElement(clickOnCreateAnAccount);

    }

    public String verifyAuthenticationText() {
        return getTextFromElement(verifyAuthentication);
    }

    public String verifyCreateAnAccountText() {
        return getTextFromElement(verifyCreateAnAccount);
    }

    public String getVerifyAuthenticationFailedMessage() {
        return getTextFromElement(verifyAuthenticationFailedMessage);
    }

    public String verifyLogOutLink() {
        return getTextFromElement(verifyLogOutLink);
    }

    public void clickOnSignOut() {
        clickOnElement(verifyLogOutLink);
    }
}
