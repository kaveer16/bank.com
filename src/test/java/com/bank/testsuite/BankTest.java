package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage =new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();


    @Test
    public void bankMangerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLoginLink();
        homePage.getAddCustomerText();
        bankManagerLoginPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName("Kaveer");
        addCustomerPage.enterLastName("kumar");
        addCustomerPage.enterPostcode("WD250PQ");
        addCustomerPage.clickOnAddCustomerButton();

    }

    @Test
    public void bankMangerShouldOpenAccountSuccessfully()  {
        homePage.clickOnBankManagerLoginLink();
        homePage.clickOnOpenAccountTab();
        int num = getRandomNumeric();
        openAccountPage.selectCustomer("kaveer kumar" + num);
        openAccountPage.selectCurrency("pounds");
        openAccountPage.clickOnProcessButton();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnCustomerLoginLink();
        int num  = getRandomNumeric();
        customerLoginPage.selectYourName("Kaveer kumar" + num);
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.getKaveerkumarText();
        customerLoginPage.clickOnLogOutButton();
        String expectedMessage = "Your Name";
        String actualMessage = customerLoginPage.getYourNameText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginLink();
        waitFor(2);
        int num = getRandomNumeric();
        customerLoginPage.selectYourName("Kaveer kumar" + num);
        waitFor(2);
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        waitFor(2);
        accountPage.enterAmountToBeDeposited("100");
        waitFor(2);
        accountPage.clickOnDepositLink();
        accountPage.getDepositSuccessfulText();
        waitFor(2);
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getDepositSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLoginLink();
        waitFor(2);
        int num = getRandomNumeric();
        customerLoginPage.selectYourName("Kaveer kumar" + num);
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithDrawTab();
        accountPage.enterAmountToBeWithDraw("50");
        accountPage.clickOnWithDrawButton();
        accountPage.getTransactionSuccessfulText();
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getTransactionSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
