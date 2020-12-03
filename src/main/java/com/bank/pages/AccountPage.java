package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AccountPage extends Utility {
    By depositButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]");
    By amountToBeDeposited = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By depositTab = By.xpath(" //body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By depositSuccessfulText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawalTab = By.xpath(" customerLoginPage.clickOnLoginButton();");
    By amountToBeWithDraw = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By withDrawButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By transactionSuccessfulText = By.xpath("//span[contains(text(),'Transaction successful')]");

    public void enterAmountToBeDeposited(String amount) {
        Reporter.log("Enter amount " + amount + "to amount Field " + amountToBeDeposited.toString() + "<br>");
        sendTextToElement(amountToBeDeposited, amount);
    }
    public void clickOnDepositButton() {
        Reporter.log("Clicking on Deposit Button" + depositButton.toString() + "<br>");
        clickOnElement(depositButton);
    }
    public void clickOnDepositLink() {
        Reporter.log("Clicking on Deposit Link." + depositTab.toString() + "<br>");
        clickOnElement(depositTab);
    }
    public String getDepositSuccessfulText() {
        return getTextFromElement(depositSuccessfulText);
    }
    public void clickOnWithDrawTab() {
        Reporter.log("Clicking on WithDraw Button." + withdrawalTab.toString() + "<br>");
        clickOnElement(withdrawalTab);
    }
    public void enterAmountToBeWithDraw(String amount) {
        Reporter.log("Enter amount " + amount + "to amount Field " + amountToBeWithDraw.toString() + "<br>");
        sendTextToElement(amountToBeWithDraw, amount);
    }
    public void clickOnWithDrawButton() {
        Reporter.log("Clicking on Deposit Link." + withDrawButton.toString() + "<br>");
        clickOnElement(withDrawButton);
    }
    public String getTransactionSuccessfulText(){
        return getTextFromElement(transactionSuccessfulText);
    }
}
