package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    By clickAddCustomerButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By clickOnOpenAccountTab = By.xpath(" //body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");



    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on Add Customer Button." + clickAddCustomerButton.toString() + "<br>");
        clickOnElement(clickAddCustomerButton);
    }
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking on Open Account Tab " + clickOnOpenAccountTab.toString() + "<br>");
        clickOnElement(clickOnOpenAccountTab);
    }
}
