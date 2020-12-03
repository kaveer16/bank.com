package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    By yourNameLink = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    By kaveerKumarText = By.xpath("//span[contains(text(),'kaveer kumar')]");
    By logOutButton = By.xpath("//button[contains(text(),'Logout')]");
    By yourNameText =By.xpath("//label[contains(text(),'Your Name :')]");

    public void selectYourName(String yourName){
        Reporter.log("select your name" + yourNameLink.toString() + "<br>");
        sendTextToElement(yourNameLink,yourName);
    }
    public void clickOnLoginButton() {
        Reporter.log("Clicking on Add Customer Button." + loginButton.toString() + "<br>");
        clickOnElement(loginButton);
    }
    public String getKaveerkumarText() {

        return getTextFromElement(kaveerKumarText);
    }
    public void clickOnLogOutButton() {
        Reporter.log("Clicking on Add Customer Button." + logOutButton.toString() + "<br>");
        clickOnElement(logOutButton);
    }
    public String getYourNameText(){
        return getTextFromElement(yourNameText);
    }

}
