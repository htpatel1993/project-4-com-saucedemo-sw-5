package com.saucedemo.www.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.www.customlisteners.CustomListeners;
import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productMessage;


    By listOfProduct = By.xpath("//div[@class='inventory_item']");


    /**
     * This method is used to get the title of homepage
     *
     * @return
     */
    public String getProductMessage() {
        Reporter.log("Get product Text " + productMessage.toString());// ReportNG
        CustomListeners.test.log(Status.PASS,"Get product Text " + productMessage);// Extend report
        return getTextFromElement(productMessage);
    }

    /**
     * This method is used to get the list of product
     *
     * @return
     */
    public int getNumberofProductOnHomePage() {
        Reporter.log("Get list of product " + listOfProduct.toString());
        CustomListeners.test.log(Status.PASS,"Get list of product  " + listOfProduct);
        List<WebElement> totalproduct = driver.findElements(listOfProduct);
        return totalproduct.size();
    }
}
