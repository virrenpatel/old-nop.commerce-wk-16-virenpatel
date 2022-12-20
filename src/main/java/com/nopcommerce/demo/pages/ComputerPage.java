package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerMenu;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;

    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement sortByZToA;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement getBuildYourOwn;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorE2200;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam8GB;
    @CacheLookup
    @FindBy(xpath = "//label[text()='400 GB [+$100.00]']")
    WebElement selectHDDRadio;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOSRadioVista;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement checkBoxMSOffice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement checkBoxTotalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement getTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement getCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement hoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartClick;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement getShoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement getTotal2950;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsAndServicesCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement getTextWelcomePleaseSignInMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement selectCountry;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement selectCity;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement selectState;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement address1;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement address2;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(name = "save")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAirButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickOnContinue1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement masterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton4;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]")
    WebElement verifyPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]")
    WebElement getShippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement totalIs2950;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirm;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement getThankYouText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement getSuccessfullyProcessedText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton5;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement getWelcomeToOurStore;


    public void clickOnComputerTab() {
        log.info("clickOnComputerTab" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public void clickOnDesktop() {
        log.info("clickOnDesktop" +desktopMenu.toString());
        clickOnElement(desktopMenu);
    }

    public void getSelectByText(String value) {
        log.info("getSelectByText" +sortByZToA.toString());
        selectByVisibleTextFromDropDown(sortByZToA, value);
    }

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        log.info("clickOnAddToCart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getBuildYourOwnText() {
        log.info("getBuildYourOwnText" + getBuildYourOwn.getText());
        return getTextFromElement(getBuildYourOwn);
    }

    public void selectProcessorE2200ByValue(String value) {
        log.info("selectProcessorE2200ByValue" + processorE2200.toString());
        selectByValueFromDropDown(processorE2200, value);
    }

    public void selectRam8GBByValue(String value) {
        log.info("selectRam8GBByValue" + selectRam8GB.toString());
        selectByValueFromDropDown(selectRam8GB, value);
    }

    public void clickOnHDDRadio400GB() {
        log.info("clickOnHDDRadio400GB" + selectHDDRadio.toString());
        clickOnElement(selectHDDRadio);
    }

    public void clickOnOsRadioVistaPremium() {
        log.info("clickOnOsRadioVistaPremium" + selectOSRadioVista.toString());
        clickOnElement(selectOSRadioVista);
    }

    public void clickOnSoftwareTotalCommander() {
        log.info("clickOnSoftwareTotalCommander" + checkBoxMSOffice.toString());
        mouseHoverToElement(checkBoxMSOffice);
    }

    public void totalCommand() {
        log.info("totalCommand" + checkBoxTotalCommander.toString());
        clickOnElement(checkBoxTotalCommander);
    }

    public String getTotalPrice1475() {
        log.info("getTotalPrice1475" + getTotalPrice.toString());
        return getTextFromElement(getTotalPrice);
    }

    public void clickOnAddToCartButton() {
        log.info("clickOnAddToCartButton" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getCartText() {
        log.info("getCartText" + getCartMessage.getText());
        return getTextFromElement(getCartMessage);
    }

    public void closeCartMessageBox() {
        log.info("closeCartMessageBox" + closeCartMessage.toString());
        clickOnElement(closeCartMessage);
    }

    public void mouseHoverOnShoppingCart() {
        log.info("mouseHoverOnShoppingCart" + hoverOnShoppingCart.toString());
        mouseHoverToElementAndClick(hoverOnShoppingCart);
    }

    public void clickOnShoppingCart() {
        log.info("clickOnShoppingCart" + goToCartClick.toString());
        clickOnElement(goToCartClick);
    }

    public String getShoppingCartText() {
        log.info("getShoppingCartText" + getShoppingCartMessage.getText());
        return getTextFromElement(getShoppingCartMessage);
    }

    public void clearTextInQuantityField() {
        log.info("clearTextInQuantityField" + clearText.toString());
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        quantity.clear();
    }

    public void sendTextToQuantityField() {
        log.info("sendTextToQuantityField" + sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        log.info("clickOnUpdateShoppingCartButton" + clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }

    public String verifyTotalPrice2950() {
        log.info("verifyTotalPrice2950" + getTotal2950.getText());
        return getTextFromElement(getTotal2950);
    }

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        log.info("clickOnCheckBoxIAgreeWithTermsAndCondition" + termsAndServicesCheckbox.toString());
        clickOnElement(termsAndServicesCheckbox);
    }

    public void clickOnCheckOutButton() {
        log.info("clickOnCheckOutButton" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }

    public String getWelcomePleaseSignInText() {
        log.info("getWelcomePleaseSignInText" + getTextWelcomePleaseSignInMessage.getText());
        return getTextFromElement(getTextWelcomePleaseSignInMessage);
    }

    public void clickOnCheckOutAsGuestBox() {
        log.info("clickOnCheckOutAsGuestBox" +clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }

    public void enterTextToFirstNameField(String name) {
        log.info("enterText " + name + " ToFirstNameField" + sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, name);
    }

    public void enterTextToLastNameField(String lastName) {
        log.info("enterText " + lastName + " ToLastNameField" + sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }

    public void enterTextToEmailField(String email) {
        log.info("enterText " + email + " ToEmailField" + sendTextToEmail.toString());
        sendTextToElement(sendTextToEmail, email);
    }

    public void selectTextToCountryField() {
        log.info("selectTextToCountryField" + selectCountry.toString());
        selectByVisibleTextFromDropDown(selectCountry, "United States");
    }

    public void selectTextToCityField(String text) {
        log.info("selectText " + text + " ToCityField" + selectCity.toString());
        sendTextToElement(selectCity, text);
    }

    public void selectStateToStateField() {
        log.info("selectStateToStateField" + selectState.toString());
        selectByVisibleTextFromDropDown(selectState, "Alabama");
    }

    public void sendTextToAddressLine1(String address) {
        log.info("sendText " + address + " ToAddressLine1" + address1.toString());
        sendTextToElement(address1, address);
    }

    public void enterTextToAddressLine2(String address) {
        log.info("sendText " + address + " ToAddressLine2" + address2.toString());
        sendTextToElement(address2, address);
    }

    public void enterTextToPostcode(String postcode) {
        log.info("enterText " + postcode + " ToPostcode" + postalCode.toString());
        sendTextToElement(postalCode, postcode);
    }

    public void enterTextToPhoneNumberField(String number) {
        log.info("enter Text " + number + " To PhoneNumber Field " + phoneNumber.toString());
        sendTextToElement(phoneNumber, number);
    }

    public void clickOnContinueButton() {
        log.info("clickOnContinueButton" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public void clickOnNextDayAirButton() {
        log.info("clickOnNextDayAirButton" + nextDayAirButton.toString());
        clickOnElement(nextDayAirButton);
    }

    public void clickOnContinueButtonAgain() {
        log.info("clickOnContinueButtonAgain" + clickOnContinue1.toString());
        clickOnElement(clickOnContinue1);
    }

    public void clickOnCreditCardButton() {
        log.info("clickOnCreditCardButton" + creditCard.toString());
        clickOnElement(creditCard);
    }

    public void clickOnContinue2() {
        log.info("clickOnContinue2" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    public void clickOnCreditCardRadioButton() {
        log.info("clickOnCreditCardRadioButton" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton3() {
        log.info("clickOnContinueButton3" + continueButton3.toString());
        clickOnElement(continueButton3);
    }

    public void selectMasterCardFromCreditCardDropdown(String text) {
        log.info("selectMasterCardFromCreditCardDropdown" + masterCard.toString());
        selectByVisibleTextFromDropDown(masterCard, text);
    }

    public void sendTextTOCardHolderName(String name) {
        log.info("sendTextTOCardHolderName" + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }

    public void sendTextTOCardNumber(String num) {
        log.info("sendTextTOCardNumber" + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        log.info("selectMonthAndYearForCreditCardExpireData");
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    public void sendTextToCardCode(String code) {
        log.info("sendTextToCardCode" + cardCode.toString());
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton4() {
        log.info("clickOnContinueButton4" + continueButton4.toString());
        clickOnElement(continueButton4);
    }

    public String getPaymentMethodText() {
        log.info("getPaymentMethodText" + verifyPaymentMethod.getText());
        return getTextFromElement(verifyPaymentMethod);
    }

    public String verifyShippingMethodText() {
        log.info("verifyShippingMethodText" + getShippingMethodText.getText());
        return getTextFromElement(getShippingMethodText);
    }

    public String verifyTotalPriceIs2950() {
        log.info("verifyTotalPriceIs2950" + totalIs2950.toString());
        return getTextFromElement(totalIs2950);
    }

    public void clickOnConfirmButton() {
        log.info("clickOnConfirmButton" + confirm.toString());
        clickOnElement(confirm);
    }

    public String verifyThankYouText() {
        log.info("verifyThankYouText" + getThankYouText.getText());
        return getTextFromElement(getThankYouText);
    }

    public String verifySuccessfullyProcessedText() {
        log.info("verifySuccessfullyProcessedText" + getSuccessfullyProcessedText.getText());
        return getTextFromElement(getSuccessfullyProcessedText);
    }

    public void clickOnContinueButton5() {
        log.info("clickOnContinueButton5" + continueButton5.toString());
        clickOnElement(continueButton5);
    }

    public String getWelcomeToOurStoreText() {
        log.info("getWelcomeToOurStoreText" + getWelcomeToOurStore.getText());
        return getTextFromElement(getWelcomeToOurStore);
    }

}
