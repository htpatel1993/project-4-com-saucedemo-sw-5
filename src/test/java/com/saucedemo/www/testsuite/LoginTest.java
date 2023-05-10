package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.HomePage;
import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Utility {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        String expectedText = "Products";
        // Enter “standard_user” username
        loginPage.enterEmailId("standard_user");
        // Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // Verify that product message is displayed
        String actualText = homePage.getProductMessage();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatSixProductsAreDisplayedOnPage() {
        int expectedText = 6;
        // Enter “standard_user” username
        loginPage.enterEmailId("standard_user");
        // Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // Verify that six products are displayed on page
        int actualText = homePage.getNumberofProductOnHomePage();
        Assert.assertEquals(actualText, expectedText, "product not display");
    }
}
