package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By customerLoginLink = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]");
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By addCustomerText = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By clickAddCustomerButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By clickOnOpenAccountTab = By.xpath(" //body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");


    public void clickOnCustomerLoginLink(){
        Reporter.log("Clicking On CustomerLogin Link" + customerLoginLink.toString() + "<br>");
        clickOnElement(customerLoginLink);
    }
    public void clickOnBankManagerLoginLink(){
        Reporter.log("Clicking on Bank Manager Login Link." + bankManagerLoginLink.toString() + "<br>");
        clickOnElement(bankManagerLoginLink);
    }
    public String getAddCustomerText(){
        return getTextFromElement(addCustomerText);

    }
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on Add Customer Button." + clickAddCustomerButton.toString() + "<br>");
        clickOnElement(clickAddCustomerButton);
    }
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking on Open Account Tab " + clickOnOpenAccountTab.toString() + "<br>");
        clickOnElement(clickOnOpenAccountTab);
    }
}
