package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ElectronicsSteps {
    @When("^I mouseHover On Electronic Tab$")
    public void iMouseHoverOnElectronicTab() {
        new ElectronicsPage().mouseHoverOnElectronicTab();
    }

    @And("^I click On Cell Phones$")
    public void iClickOnCellPhones() {
        new ElectronicsPage().clickOnCellPhones();
    }

    @Then("^I verify cell phone text$")
    public void iVerifyCellPhoneText() {
        Assert.assertEquals("Cell phones is not displayed", "Cell phones",
                new ElectronicsPage().getCellPhoneText());
    }

    @And("^I click On List View Tab$")
    public void iClickOnListViewTab() {
        new ElectronicsPage().clickOnListViewTab();
    }

    @And("^I click On Nokia Lumia Product$")
    public void iClickOnNokiaLumiaProduct() throws InterruptedException {
        Thread.sleep(2000);
        new ElectronicsPage().clickOnNokiaLumiaProduct();
    }

    @And("^I verify Nokia Lumia Text$")
    public void iVerifyNokiaLumiaText() {
        Assert.assertEquals("Nokia Lumia 1020 is not displayed","Nokia Lumia 1020",
                new ElectronicsPage().verifyNokiaLumiaText());
    }

    @And("^I verify Price$")
    public void iVerifyPrice() {
        Assert.assertEquals("$349.00 is not displayed","$349.00",new ElectronicsPage().verifyPrice349());
    }

    @And("^I change The Quantity$")
    public void iChangeTheQuantity() {
        new ElectronicsPage().changeTheQuantity();
    }
    @And("^I click On Add To Cart Buttons$")
    public void iClickOnAddToCartButtons() {
        new ElectronicsPage().clickOnAddToCartButton();
    }

    @And("^I verify Product Added In Shopping Cart Text$")
    public void iVerifyProductAddedInShoppingCartText() {
        Assert.assertEquals("Product add in shopping cart is not displayed","The product has been added to your shopping cart",
                new ElectronicsPage().verifyProductAddedInShoppingCartText());
    }

    @And("^I click On Close Button$")
    public void iClickOnCloseButton() {
        new ElectronicsPage().clickOnCloseButton();
    }

    @And("^I hover On Shopping Cart And Click On Go To Cart Button$")
    public void iHoverOnShoppingCartAndClickOnGoToCartButton() {
        new ElectronicsPage().hoverOnShoppingCartAndClickOnGoToCartButton();
    }

    @And("^I verify Shopping Cart Text$")
    public void iVerifyShoppingCartText() {
        Assert.assertEquals("Shopping cart is not displayed","Shopping cart",
                new ElectronicsPage().verifyShoppingCartText());
    }

    @And("^I verify The Quantity Is two$")
    public void iVerifyTheQuantityIsTwo() {
        Assert.assertEquals("Number is not displayed","(2)",new ElectronicsPage().verifyTheQuantityIs2());
    }

    @And("^I verify The Total$")
    public void iVerifyTheTotal() {
        Assert.assertEquals("$698.00 is not displayed","$698.00",new ElectronicsPage().verifyTheTotal());
    }

    @And("^I click On Check Box$")
    public void iClickOnCheckBox() {
        new ElectronicsPage().clickOnCheckBox();
    }

    @And("^I click On Check out Button$")
    public void iClickOnCheckOutButton() {
        new ElectronicsPage().clickOnCheckoutButton();
    }

    @And("^I verify Welcome Message$")
    public void iVerifyWelcomeMessage() {
        Assert.assertEquals("Welcome message is not displayed","Welcome, Please Sign In!",
                new ElectronicsPage().verifyWelcomeMessage());
    }

    @And("^I click On Register Tab$")
    public void iClickOnRegisterTab() {
        new ElectronicsPage().clickOnRegisterTab();
    }

    @And("^I verify Register Text$")
    public void iVerifyRegisterText() {
        Assert.assertEquals("Register is not displayed","Register",new ElectronicsPage().verifyRegisterText());
    }

    @And("^I enter text in mandatory Fields$")
    public void iEnterTextInMandatoryFields() {
        new ElectronicsPage().mandatoryFields();
    }

    @And("^I click On Registration Button$")
    public void iClickOnRegistrationButton() {
        new ElectronicsPage().clickOnRegistrationButton();
    }

    @And("^I verify Registration Text$")
    public void iVerifyRegistrationText() {
        Assert.assertEquals("Registration text is not displayed","Your registration completed",
                new ElectronicsPage().verifyRegistrationText());
    }

    @And("^I click On Continue Tab$")
    public void iClickOnContinueTab() {
        new ElectronicsPage().clickOnContinueTab();
    }

    @And("^I check Shopping Cart Text$")
    public void iCheckShoppingCartText() {
        Assert.assertEquals("Shopping cart is not displayed","Shopping cart",new ElectronicsPage().checkShoppingCartText());
    }

    @And("^I click On Terms And Services Box$")
    public void iClickOnTermsAndServicesBox() {
        new ElectronicsPage().clickOnTermsAndServicesBox();
    }

    @And("^I click On Checkout Last$")
    public void iClickOnCheckoutLast() {
        new ElectronicsPage().clickOnCheckoutLast();
    }

    @And("^I fill Delivery Address Fields$")
    public void iFillDeliveryAddressFields() {
        new ElectronicsPage().fillDeliveryAddressFields();
    }

    @And("^I click On Continues Button$")
    public void iClickOnContinuesButton() {
        new ElectronicsPage().clickOnContinueButton();
    }
    @And("^I click On second Day Air Button$")
    public void iClickOnSecondDayAirButton() {
        new ElectronicsPage().clickOn2ndDayAirButton();
    }

    @And("^I click Continue$")
    public void iClickContinue() {
        new ElectronicsPage().clickContinue();
    }

    @And("^I select Credit Card Radio Button$")
    public void iSelectCreditCardRadioButton() {
        new ElectronicsPage().selectCreditCardRadioButton();
    }

    @And("^I click Con$")
    public void iClickCon() {
        new ElectronicsPage().clickCon();
    }

    @And("^I select Visa From DropDown$")
    public void iSelectVisaFromDropDown() {
        new ElectronicsPage().selectVisaFromDropDown();
    }

    @And("^I fill Card Details$")
    public void iFillCardDetails() {
        new ElectronicsPage().fillCardDetails();
    }

    @And("^I click Con Btn$")
    public void iClickConBtn() {
        new ElectronicsPage().clickConBtn();
    }

    @And("^I verify Credit Card Text$")
    public void iVerifyCreditCardText() {
        Assert.assertEquals("Credit Card is not displayed","Credit Card",
                new ElectronicsPage().verifyCreditCardText());
    }

    @And("^I verify second Day Air Text$")
    public void iVerifySecondDayAirText() {
        Assert.assertEquals("2nd Day Air is not displayed","2nd Day Air",new ElectronicsPage().verify2ndDayAirText());
    }

    @And("^I verify Final Total$")
    public void iVerifyFinalTotal() {
        Assert.assertEquals("$698.00 is not displayed","$698.00",new ElectronicsPage().verifyFinalTotal());
    }

    @And("^I verify Successfully Processed Message$")
    public void iVerifySuccessfullyProcessedMessage() {
        Assert.assertEquals("Successfully processed message is not displayed","Your order has been successfully processed!",
                new ElectronicsPage().verifySuccessfullyProcessedMessage());
    }

    @And("^I click On Continue$")
    public void iClickOnContinue() {
        new ElectronicsPage().clickOnContinue();
    }

    @And("^I verify Welcome To Our Store Text$")
    public void iVerifyWelcomeToOurStoreText() {
        Assert.assertEquals("Welcome to our store is not displayed","Welcome to our store",
                new ElectronicsPage().verifyWelcomeToOurStoreText());

    }
    @Then("^I click On Logout Link$")
    public void iClickOnLogoutLink() {
        new ElectronicsPage().clickOnLogoutLink();
    }


    @And("^I click on Login$")
    public void iClickOnLogin() {
        new ElectronicsPage().clickOnLogInLink();
    }

    @And("^I enter userName$")
    public void iEnterUserName() {
        new ElectronicsPage().enterTextInUserNameField("Anit123@gmail.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new ElectronicsPage().enterTextInPasswordField("Adam123456");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new ElectronicsPage().clickOnLoginButton();
    }
}
