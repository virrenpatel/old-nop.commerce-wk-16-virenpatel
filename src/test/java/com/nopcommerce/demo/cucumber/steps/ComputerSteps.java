package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ComputerSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @And("^I click on Desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }
    @And("^I should select product in descending order \"([^\"]*)\"$")
    public void iShouldSelectProductInDescendingOrder(String orderInAsc)  {
        new ComputerPage().getSelectByText(orderInAsc);
    }
    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new ComputerPage().clickOnAddToCart();
    }

    @And("^I verify Build your own computer message$")
    public void iVerifyBuildYourOwnComputerMessage() {
        Assert.assertEquals("Message not displayed","Build your own computer",
                new ComputerPage().getBuildYourOwnText());
    }

    @And("^I select Processor by value\"([^\"]*)\"$")
    public void iSelectProcessorByValue(String value) throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().selectProcessorE2200ByValue(value);
    }

    @And("^I select Ram GB by value \"([^\"]*)\"$")
    public void iSelectRamGBByValue(String num) throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().selectRam8GBByValue(num);
    }

    @And("^I click On HDD Radio$")
    public void iClickOnHDDRadio() throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().clickOnHDDRadio400GB();
    }

    @And("^I click On Os Radio Vista Premium$")
    public void iClickOnOsRadioVistaPremium() {
       new ComputerPage().clickOnOsRadioVistaPremium();
    }

    @And("^I click On Software Total Commander$")
    public void iClickOnSoftwareTotalCommander() {
        new ComputerPage().clickOnSoftwareTotalCommander();
    }

    @And("^I total Command$")
    public void iTotalCommand() {
        new ComputerPage().totalCommand();
    }

    @And("^I click On Add To Cart Button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().clickOnAddToCartButton();
    }

    @And("^I verify The product has been added to your shopping cart message$")
    public void iVerifyTheProductHasBeenAddedToYourShoppingCartMessage() {
        Assert.assertEquals("Not displayed","The product has been added to your shopping cart",
                new ComputerPage().getCartText() );
    }

    @And("^I close Cart MessageBox$")
    public void iCloseCartMessageBox() {
        new ComputerPage().closeCartMessageBox();
    }

    @And("^I mouseHover On Shopping Cart$")
    public void iMouseHoverOnShoppingCart() {
        new ComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^I click On Shopping Cart$")
    public void iClickOnShoppingCart() {
        new ComputerPage().clickOnShoppingCart();
    }

    @And("^I verify Shopping cart message$")
    public void iVerifyShoppingCartMessage() {
        Assert.assertEquals("Not Displayed","Shopping cart",new ComputerPage().getShoppingCartText());
    }

    @And("^I clear Text In Quantity Field$")
    public void iClearTextInQuantityField() {
        new ComputerPage().clearTextInQuantityField();
    }

    @And("^I send Text To Quantity Field$")
    public void iSendTextToQuantityField() {
        new ComputerPage().sendTextToQuantityField();
    }

    @And("^I click On Update Shopping Cart Button$")
    public void iClickOnUpdateShoppingCartButton() {
        new ComputerPage().clickOnUpdateShoppingCartButton();
    }

    @And("^I verify price$")
    public void iVerifyPrice() {
        Assert.assertEquals("Price not displayed","$2,950.00",new ComputerPage().verifyTotalPrice2950());
    }

    @And("^I click On CheckBox I Agree With Terms And Condition$")
    public void iClickOnCheckBoxIAgreeWithTermsAndCondition() {
        new ComputerPage().clickOnCheckBoxIAgreeWithTermsAndCondition();
    }

    @And("^I click On Check Out Button$")
    public void iClickOnCheckOutButton() {
        new ComputerPage().clickOnCheckOutButton();
    }

    @And("^I verify Welcome, Please Sign In message$")
    public void iVerifyWelcomePleaseSignInMessage() {
        Assert.assertEquals("Text not displayed","Welcome, Please Sign In!",new ComputerPage().getWelcomePleaseSignInText());
    }

    @And("^I click On Check Out As GuestBox$")
    public void iClickOnCheckOutAsGuestBox() {
        new ComputerPage().clickOnCheckOutAsGuestBox();
    }

    @And("^I enter Text To First Name Field$")
    public void iEnterTextToFirstNameField() {
        new ComputerPage().enterTextToFirstNameField("Manan");
    }

    @And("^I enter Text To Last Name Field$")
    public void iEnterTextToLastNameField() {
        new ComputerPage().enterTextToLastNameField("Shah");
    }

    @And("^I enter Text To email Field$")
    public void iEnterTextToEmailField() {
        new ComputerPage().enterTextToEmailField("mshah123@gmail.com");
    }

    @And("^I select Text To Country Field$")
    public void iSelectTextToCountryField() {
        new ComputerPage().selectTextToCountryField();
    }

    @And("^I select State To State Field$")
    public void iSelectStateToStateField() {
        new ComputerPage().selectStateToStateField();
    }

    @And("^I select Text To City Field$")
    public void iSelectTextToCityField() {
        new ComputerPage().selectTextToCityField("London");
    }

    @And("^I send Text To AddressLineA$")
    public void iSendTextToAddressLineA() {
        new ComputerPage().sendTextToAddressLine1("1,Luton road");
    }

    @And("^I enter Text To AddressLineB$")
    public void iEnterTextToAddressLineB() {
        new ComputerPage().enterTextToAddressLine2("Luton");
    }

    @And("^I enter Text To Postcode$")
    public void iEnterTextToPostcode() {
        new ComputerPage().enterTextToPostcode("LU7 8NJ");
    }

    @And("^I enter Text To PhoneNumber Field$")
    public void iEnterTextToPhoneNumberField() {
        new ComputerPage().enterTextToPhoneNumberField("020874343");
    }

    @And("^I click On Continue Button$")
    public void iClickOnContinueButton() {
        new ComputerPage().clickOnContinueButton();
    }

    @And("^I click On NextDay Air Button$")
    public void iClickOnNextDayAirButton() {
        new ComputerPage().clickOnNextDayAirButton();
    }

    @And("^I click On Continue Button Again$")
    public void iClickOnContinueButtonAgain() {
        new ComputerPage().clickOnContinueButtonAgain();
    }

    @And("^I click On CreditCard Button$")
    public void iClickOnCreditCardButton() {
        new ComputerPage().clickOnCreditCardButton();
    }
    @And("^I click On Continuetwo$")
    public void iClickOnContinuetwo() {
        new ComputerPage().clickOnContinue2();
    }

    @And("^I click On CreditCard Radio Button$")
    public void iClickOnCreditCardRadioButton() {
        new ComputerPage().clickOnCreditCardRadioButton();
    }

    @And("^I click On Continue ButtonC$")
    public void iClickOnContinueButtonC() {
        new ComputerPage().clickOnContinueButton3();
    }

    @And("^I select MasterCard From CreditCard Dropdown$")
    public void iSelectMasterCardFromCreditCardDropdown() {
        new ComputerPage().selectMasterCardFromCreditCardDropdown("Master card");
    }

    @And("^I send Text TO CardHolder Name$")
    public void iSendTextTOCardHolderName() {
        new ComputerPage().sendTextTOCardHolderName("Adam");
    }

    @And("^I send Text TO CardNumber$")
    public void iSendTextTOCardNumber() {
        new ComputerPage().sendTextTOCardNumber("1111222233334444");
    }

    @And("^I select Month And Year For CreditCard Expire Data$")
    public void iSelectMonthAndYearForCreditCardExpireData() {
        new ComputerPage().selectMonthAndYearForCreditCardExpireData();
    }

    @And("^I send Text To CardCode$")
    public void iSendTextToCardCode() {
        new ComputerPage().sendTextToCardCode("749");
    }
    @And("^I click On Continue ButtonD$")
    public void iClickOnContinueButtonD() {
        new ComputerPage().clickOnContinueButton4();
    }

    @And("^I verify get Paymen tMethod Text$")
    public void iVerifyGetPaymenTMethodText() {
        Assert.assertEquals("Card not Displayed", "Payment Method: Credit Card",
                new ComputerPage().getPaymentMethodText());

    }

    @And("^I verify Shipping Method Text$")
    public void iVerifyShippingMethodText() {
        Assert.assertEquals("Shipping method not displayed","Shipping Method: Next Day Air",
                new ComputerPage().verifyShippingMethodText() );
    }

    @And("^I verify Total Price number$")
    public void iVerifyTotalPriceNumber() {
        Assert.assertEquals("Price Not matched","$2,950.00",new ComputerPage().verifyTotalPriceIs2950());
    }

    @And("^I click On Confirm Button$")
    public void iClickOnConfirmButton() {
        new ComputerPage().clickOnConfirmButton();
    }

    @And("^I verify Thank You Text$")
    public void iVerifyThankYouText() {
        Assert.assertEquals("Thank you not displayed","Thank you",new ComputerPage().verifyThankYouText());
    }

    @And("^I verify Successfully Processed Text$")
    public void iVerifySuccessfullyProcessedText() {
        Assert.assertEquals("Message not displayed","Your order has been successfully processed!",
                new ComputerPage().verifySuccessfullyProcessedText() );
    }

    @And("^I click On Continue ButtonF$")
    public void iClickOnContinueButtonF() {
        new ComputerPage().clickOnContinueButton5();
    }

    @And("^I get Welcome To Our Store Text$")
    public void iGetWelcomeToOurStoreText() {
        Assert.assertEquals("Message not displayed","Welcome to our store",
                new ComputerPage().getWelcomeToOurStoreText());
    }


}
