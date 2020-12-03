package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    By customerLink = By.xpath("//select[@id='userSelect']");
    By currencyLink = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[contains(text(),'Process')]");

    public void selectCustomer(String name) {
        Reporter.log("select name of customer" + customerLink.toString() + "<br");
       sendTextToElement(customerLink,name);
    }
    public void selectCurrency(String currency){
        Reporter.log("select currency" + currencyLink.toString() + "<br>");
        sendTextToElement(currencyLink,currency);
    }
    public void clickOnProcessButton(){
        Reporter.log("clicking on process button" + processButton.toString() + "<br>");
        clickOnElement(processButton);
    }
}
