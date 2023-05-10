package com.saucedemo.www.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.www.customlisteners.CustomListeners;
import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;


    /**
     * enter EmailId
     *
     * @param email
     */
    public void enterEmailId(String email) {
        Reporter.log("Enter EmailId " + emailField.toString());
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + emailField);
        sendTextToElement(emailField, email);
    }

    /**
     * enter Password
     *
     * @param password
     */
    public void enterPassword(String password) {
        Reporter.log("Enter Password " + passwordField.toString());
        CustomListeners.test.log(Status.PASS,"Enter Password " + passwordField);
        sendTextToElement(passwordField, password);
    }

    /**
     * click On Login Button
     */
    public void clickOnLoginButton() {
        Reporter.log("click On Login Button " + loginButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Login Button " + loginButton);
        clickOnElement(loginButton);
    }
}
