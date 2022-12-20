package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());

    public ElectronicsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement hoverOnElectronic;

    @CacheLookup
    @FindBy(xpath = "//ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellPhone;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    WebElement getCellPhoneText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//div[3]/div[1]/div[2]/h2[1]/a")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Nokia Lumia 1020']")
    WebElement getNokiaLumiaText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement getPrice349;

    @CacheLookup
    @FindBy(name = "addtocart_20.EnteredQuantity")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartTab;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement getProductAddedInShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement hoverOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement clickGoToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement getShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement checkQuantityIs2;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkTotal698;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkbox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement getWelcomeMessage;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Register']")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement checkRegisterText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement checkRegistrationText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement checkShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='terms-of-service']")
    WebElement termsOfServices;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//div/button[4]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement on2ndDayAir;

    @CacheLookup
    @FindBy(xpath = "//form/div[2]/button[1]")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;

    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickCon;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickConBtn;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement checkCreditCardText;

    @CacheLookup
    @FindBy(xpath = "//div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement check2ndDayAirText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkLastTotal;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement checkThankYouText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToOurStoreMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;



    public void mouseHoverOnElectronicTab() {
        log.info("mouseHoverOnElectronicTab" + hoverOnElectronic.toString());
        mouseHoverToElement(hoverOnElectronic);
    }

    public void clickOnCellPhones() {
        log.info("clickOnCellPhones" + clickOnCellPhone.toString());
        clickOnElement(clickOnCellPhone);
    }

    public String getCellPhoneText() {
        log.info("getCellPhoneText" + getCellPhoneText.getText());
        return getTextFromElement(getCellPhoneText);
    }

    public void clickOnListViewTab() {
        log.info("clickOnListViewTab" + listViewTab.toString());
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaProduct() {
        log.info("clickOnNokiaLumiaProduct" + nokiaLumia1020.toString());
        clickOnElement(nokiaLumia1020);
    }

    public String verifyNokiaLumiaText() {
        log.info("verifyNokiaLumiaText" + getNokiaLumiaText.getText());
        return getTextFromElement(getNokiaLumiaText);
    }

    public String verifyPrice349() {
        log.info("verifyPrice349" + getPrice349.getText());
        return getTextFromElement(getPrice349);
    }

    public void changeTheQuantity() {
        log.info("changeTheQuantity" + changeQuantity.toString());
        driver.findElement(By.name("addtocart_20.EnteredQuantity")).clear();
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnAddToCartButton() {
        log.info("clickOnAddToCartButton" + addToCartTab.toString());
        clickOnElement(addToCartTab);
    }

    public String verifyProductAddedInShoppingCartText() {
        log.info("verifyProductAddedInShoppingCartText" + getProductAddedInShoppingCart.getText());
        return getTextFromElement(getProductAddedInShoppingCart);
    }

    public void clickOnCloseButton() {
        log.info("clickOnCloseButton" +closeButton.toString());
        clickOnElement(closeButton);
    }

    public void hoverOnShoppingCartAndClickOnGoToCartButton() {
        log.info("hoverOnShoppingCartAndClickOnGoToCartButton" + clickGoToCart.toString());
        mouseHoverToElement(hoverOnShoppingCart);
        clickOnElement(clickGoToCart);
    }

    public String verifyShoppingCartText() {
        log.info("verifyShoppingCartText" + getShoppingCartText.getText());
        return getTextFromElement(getShoppingCartText);
    }

    public String verifyTheQuantityIs2() {
        log.info("verifyTheQuantityIs2" + checkQuantityIs2.getText());
        return getTextFromElement(checkQuantityIs2);
    }

    public String verifyTheTotal() {
        log.info("verifyTheTotal" + checkTotal698.getText());
        return getTextFromElement(checkTotal698);
    }

    public void clickOnCheckBox() {
        log.info("clickOnCheckBox" + checkbox.toString());
        clickOnElement(checkbox);
    }

    public void clickOnCheckoutButton() {
        log.info("clickOnCheckoutButton" +checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyWelcomeMessage() {
        log.info("verifyWelcomeMessage" + getWelcomeMessage.getText());
        return getTextFromElement(getWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        log.info("clickOnRegisterTab" + register.toString());
        clickOnElement(register);
    }

    public String verifyRegisterText() {
        log.info("verifyRegisterText" + checkRegisterText.getText());
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {
        log.info("mandatoryFields" + gender.toString());
        clickOnElement(gender);
        sendTextToElement(firstName, "Adam");
        sendTextToElement(lastName, "smith");
        selectByVisibleTextFromDropDown(day, "22");
        selectByVisibleTextFromDropDown(month, "June");
        selectByVisibleTextFromDropDown(year, "1985");
        sendTextToElement(email, "Anit123@gmail.com");
        sendTextToElement(password, "Adam123456");
        sendTextToElement(confirmPassword, "Adam123456");
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement logInLink;

    public void clickOnLogInLink(){
        clickOnElement(logInLink);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement userName;

    public void enterTextInUserNameField(String email){
        sendTextToElement(userName,email);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password1;

    public void enterTextInPasswordField(String passwordf){
        sendTextToElement(password1,passwordf);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


    public void clickOnRegistrationButton() {
        log.info("clickOnRegistrationButton" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        log.info("verifyRegistrationText" + checkRegistrationText.getText());
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        log.info("clickOnContinueTab" + continueTab.toString());
        clickOnElement(continueTab);
    }

    public String checkShoppingCartText() {
        log.info("checkShoppingCartText" + checkShoppingCartText.getText());
        return getTextFromElement(checkShoppingCartText);
    }
    public void clickOnTermsAndServicesBox(){
        log.info("clickOnTermsAndServicesBox" + termsOfServices.toString());
        clickOnElement(termsOfServices);
    }

    public void clickOnCheckoutLast(){
        log.info("clickOnCheckoutLast" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }

    public void fillDeliveryAddressFields() {
        log.info("fillDeliveryAddressFields" + country.toString());
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElement(city, "London");
        sendTextToElement(address, "1, Charlie road");
        sendTextToElement(postCode, "HA5 7NN");
        sendTextToElement(phoneNumber, "1234567890");
    }

    public void clickOnContinueButton() {
        log.info("clickOnContinueButton" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOn2ndDayAirButton() {
        log.info("clickOn2ndDayAirButton" + on2ndDayAir.toString());
        clickOnElement(on2ndDayAir);
    }

    public void clickContinue() {
        log.info("clickContinue" + clickContinue.toString());
        clickOnElement(clickContinue);
    }

    public void selectCreditCardRadioButton() {
        log.info("selectCreditCardRadioButton" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickCon() {
        log.info("clickCon" + clickCon.toString());
        clickOnElement(clickCon);
    }

    public void selectVisaFromDropDown() {
        log.info("selectVisaFromDropDown" + visa.toString());
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void fillCardDetails() {
        log.info("fillCardDetails" + cardNumber.toString());
        sendTextToElement(cardholderName, "Adam Smith");
        sendTextToElement(cardNumber, "4222222222222");
        selectByVisibleTextFromDropDown(expireMonth, "05");
        selectByVisibleTextFromDropDown(expireYear, "2025");
        sendTextToElement(cardCode, "646");
    }

    public void clickConBtn() {
        log.info("clickConBtn" + clickConBtn.toString());
        clickOnElement(clickConBtn);
    }

    public String verifyCreditCardText() {
        log.info("verifyCreditCardText" + checkCreditCardText.getText());
        return getTextFromElement(checkCreditCardText);
    }

    public String verify2ndDayAirText() {
        log.info("verify2ndDayAirText" + check2ndDayAirText.getText());
        return getTextFromElement(check2ndDayAirText);
    }

    public String verifyFinalTotal() {
        log.info("verifyFinalTotal" + checkLastTotal.getText());
        return getTextFromElement(checkLastTotal);
    }

    public void clickOnConfirmButton() {
        log.info("clickOnConfirmButton" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouText() {
        log.info("verifyThankYouText" + checkThankYouText.getText());
        return getTextFromElement(checkThankYouText);
    }

    public String verifySuccessfullyProcessedMessage() {
        log.info("verifySuccessfullyProcessedMessage" + successfullyMessage.getText());
        return getTextFromElement(successfullyMessage);
    }

    public void clickOnContinue() {
        log.info("clickOnContinue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public String verifyWelcomeToOurStoreText() {
        log.info("verifyWelcomeToOurStoreText" + welcomeToOurStoreMessage.getText());
        return getTextFromElement(welcomeToOurStoreMessage);
    }

    public void clickOnLogoutLink() {
        log.info("clickOnLogoutLink" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
}


