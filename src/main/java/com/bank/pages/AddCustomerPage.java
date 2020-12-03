package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    By firstNameField = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By lastNameField = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By postCodeField = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By addCustomerButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");

    public void enterFirstName(String firstName){
        Reporter.log("Enter First Name" + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName) {
        Reporter.log("Enter First Name" + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);
    }
    public void enterPostcode(String postcode){
        Reporter.log("Enter Postcode " + postCodeField.toString() + "<br>");
        sendTextToElement(postCodeField,postcode);
    }
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on add customer button" + addCustomerButton.toString() + "<br>");
        clickOnElement(addCustomerButton);
    }

}
