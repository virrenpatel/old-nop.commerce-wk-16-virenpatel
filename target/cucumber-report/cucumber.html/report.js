$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computerpage.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page Test",
  "description": "As a user I would like to go to computer page into nop commerce website",
  "id": "computer-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2943751800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Product Arrange In Alphabetical Order",
  "description": "",
  "id": "computer-page-test;verify-product-arrange-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Desktop",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should select product in descending order \"Name: Z to A\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 84843800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 825965700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 730157500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: Z to A",
      "offset": 45
    }
  ],
  "location": "ComputerSteps.iShouldSelectProductInDescendingOrder(String)"
});
formatter.result({
  "duration": 70985900,
  "status": "passed"
});
formatter.after({
  "duration": 623777700,
  "status": "passed"
});
formatter.before({
  "duration": 1776933000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Product Added To Shopping Cart SuccessFully",
  "description": "",
  "id": "computer-page-test;verify-product-added-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on Desktop",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should select product in descending order \"Name: A to Z\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify Build your own computer message",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Processor by value\"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select Ram GB by value \"5\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click On HDD Radio",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click On Os Radio Vista Premium",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click On Software Total Commander",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I total Command",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click On Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify The product has been added to your shopping cart message",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I close Cart MessageBox",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I mouseHover On Shopping Cart",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click On Shopping Cart",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#    And I verify Shopping cart message"
    }
  ],
  "line": 32,
  "name": "I clear Text In Quantity Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I send Text To Quantity Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click On Update Shopping Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify price",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click On CheckBox I Agree With Terms And Condition",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click On Check Out Button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify Welcome, Please Sign In message",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click On Check Out As GuestBox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter Text To First Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter Text To Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter Text To email Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I select Text To Country Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select State To State Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I select Text To City Field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I send Text To AddressLineA",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I enter Text To AddressLineB",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I enter Text To Postcode",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I enter Text To PhoneNumber Field",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click On Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click On NextDay Air Button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click On Continue Button Again",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click On CreditCard Button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I click On Continuetwo",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click On CreditCard Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I click On Continue ButtonC",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I select MasterCard From CreditCard Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I send Text TO CardHolder Name",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I send Text TO CardNumber",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I select Month And Year For CreditCard Expire Data",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I send Text To CardCode",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I click On Continue ButtonD",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I verify get Paymen tMethod Text",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I verify Shipping Method Text",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I verify Total Price number",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I click On Confirm Button",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I verify Thank You Text",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "I verify Successfully Processed Text",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "I click On Continue ButtonF",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I get Welcome To Our Store Text",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 429158800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 353203300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: A to Z",
      "offset": 45
    }
  ],
  "location": "ComputerSteps.iShouldSelectProductInDescendingOrder(String)"
});
formatter.result({
  "duration": 107146100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnAddToCart()"
});
formatter.result({
  "duration": 280151800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyBuildYourOwnComputerMessage()"
});
formatter.result({
  "duration": 778438200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "ComputerSteps.iSelectProcessorByValue(String)"
});
formatter.result({
  "duration": 2071291100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "ComputerSteps.iSelectRamGBByValue(String)"
});
formatter.result({
  "duration": 2072145000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnHDDRadio()"
});
formatter.result({
  "duration": 2058415600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnOsRadioVistaPremium()"
});
formatter.result({
  "duration": 34980200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnSoftwareTotalCommander()"
});
formatter.result({
  "duration": 137700900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iTotalCommand()"
});
formatter.result({
  "duration": 45845700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 2058041000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyTheProductHasBeenAddedToYourShoppingCartMessage()"
});
formatter.result({
  "duration": 293737300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iCloseCartMessageBox()"
});
formatter.result({
  "duration": 46987300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iMouseHoverOnShoppingCart()"
});
formatter.result({
  "duration": 165604300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnShoppingCart()"
});
formatter.result({
  "duration": 1303738300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClearTextInQuantityField()"
});
formatter.result({
  "duration": 67586100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSendTextToQuantityField()"
});
formatter.result({
  "duration": 55410700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnUpdateShoppingCartButton()"
});
formatter.result({
  "duration": 419583700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyPrice()"
});
formatter.result({
  "duration": 46410900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCheckBoxIAgreeWithTermsAndCondition()"
});
formatter.result({
  "duration": 53283500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCheckOutButton()"
});
formatter.result({
  "duration": 480932000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyWelcomePleaseSignInMessage()"
});
formatter.result({
  "duration": 41681500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCheckOutAsGuestBox()"
});
formatter.result({
  "duration": 564277000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iEnterTextToFirstNameField()"
});
formatter.result({
  "duration": 92522700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iEnterTextToLastNameField()"
});
formatter.result({
  "duration": 75149800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iEnterTextToEmailField()"
});
formatter.result({
  "duration": 111399700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSelectTextToCountryField()"
});
formatter.result({
  "duration": 77334800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSelectStateToStateField()"
});
formatter.result({
  "duration": 219150300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSelectTextToCityField()"
});
formatter.result({
  "duration": 87236000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSendTextToAddressLineA()"
});
formatter.result({
  "duration": 102817600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iEnterTextToAddressLineB()"
});
formatter.result({
  "duration": 109355100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iEnterTextToPostcode()"
});
formatter.result({
  "duration": 138551400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iEnterTextToPhoneNumberField()"
});
formatter.result({
  "duration": 159618100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 91759600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnNextDayAirButton()"
});
formatter.result({
  "duration": 293720800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnContinueButtonAgain()"
});
formatter.result({
  "duration": 76349300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCreditCardButton()"
});
formatter.result({
  "duration": 268299400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnContinuetwo()"
});
formatter.result({
  "duration": 50510900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCreditCardRadioButton()"
});
formatter.result({
  "duration": 39360500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnContinueButtonC()"
});
formatter.result({
  "duration": 44218900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSelectMasterCardFromCreditCardDropdown()"
});
formatter.result({
  "duration": 220059100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSendTextTOCardHolderName()"
});
formatter.result({
  "duration": 93673200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSendTextTOCardNumber()"
});
formatter.result({
  "duration": 110228300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSelectMonthAndYearForCreditCardExpireData()"
});
formatter.result({
  "duration": 170082600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSendTextToCardCode()"
});
formatter.result({
  "duration": 95189100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnContinueButtonD()"
});
formatter.result({
  "duration": 85712700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyGetPaymenTMethodText()"
});
formatter.result({
  "duration": 277554900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyShippingMethodText()"
});
formatter.result({
  "duration": 53001200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyTotalPriceNumber()"
});
formatter.result({
  "duration": 38009400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnConfirmButton()"
});
formatter.result({
  "duration": 57463400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifyThankYouText()"
});
formatter.result({
  "duration": 584771200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iVerifySuccessfullyProcessedText()"
});
formatter.result({
  "duration": 34675400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnContinueButtonF()"
});
formatter.result({
  "duration": 352819800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iGetWelcomeToOurStoreText()"
});
formatter.result({
  "duration": 52975400,
  "status": "passed"
});
formatter.after({
  "duration": 801174400,
  "status": "passed"
});
formatter.uri("electronicspage.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics Page Test",
  "description": "As a user I would like to go to electronics page in nop commerce website",
  "id": "electronics-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2772393100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify User Should Navigate To CellPhones Page Successfully",
  "description": "",
  "id": "electronics-page-test;verify-user-should-navigate-to-cellphones-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouseHover On Electronic Tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click On Cell Phones",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify cell phone text",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 24400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnElectronicTab()"
});
formatter.result({
  "duration": 156103500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCellPhones()"
});
formatter.result({
  "duration": 375900000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyCellPhoneText()"
});
formatter.result({
  "duration": 32263400,
  "status": "passed"
});
formatter.after({
  "duration": 623609200,
  "status": "passed"
});
formatter.before({
  "duration": 1938634100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify That The Product Added Successfully And Place Order Successfully",
  "description": "",
  "id": "electronics-page-test;verify-that-the-product-added-successfully-and-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity1"
    },
    {
      "line": 13,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I mouseHover On Electronic Tab",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click On Cell Phones",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify cell phone text",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click On List View Tab",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click On Nokia Lumia Product",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify Nokia Lumia Text",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify Price",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I change The Quantity",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click On Add To Cart Buttons",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify Product Added In Shopping Cart Text",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click On Close Button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I hover On Shopping Cart And Click On Go To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify Shopping Cart Text",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify The Quantity Is two",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify The Total",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click On Check Box",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click On Check out Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify Welcome Message",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click On Register Tab",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify Register Text",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I enter text in mandatory Fields",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click On Registration Button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify Registration Text",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click On Continue Tab",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I check Shopping Cart Text",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter userName",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click On Terms And Services Box",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click On Checkout Last",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I fill Delivery Address Fields",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click On Continues Button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I click On second Day Air Button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click Continue",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I select Credit Card Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click Con",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I select Visa From DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I fill Card Details",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click Con Btn",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I verify Credit Card Text",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I verify second Day Air Text",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I verify Final Total",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I click On Confirm Button",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I verify Thank You Text",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I verify Successfully Processed Message",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I click On Continue",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I verify Welcome To Our Store Text",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 42200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnElectronicTab()"
});
formatter.result({
  "duration": 155956000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCellPhones()"
});
formatter.result({
  "duration": 463531100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyCellPhoneText()"
});
formatter.result({
  "duration": 49358600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnListViewTab()"
});
formatter.result({
  "duration": 69291100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnNokiaLumiaProduct()"
});
formatter.result({
  "duration": 2632612900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyNokiaLumiaText()"
});
formatter.result({
  "duration": 28907300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyPrice()"
});
formatter.result({
  "duration": 24118300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iChangeTheQuantity()"
});
formatter.result({
  "duration": 73643400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnAddToCartButtons()"
});
formatter.result({
  "duration": 40235800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyProductAddedInShoppingCartText()"
});
formatter.result({
  "duration": 271476300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCloseButton()"
});
formatter.result({
  "duration": 33207900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iHoverOnShoppingCartAndClickOnGoToCartButton()"
});
formatter.result({
  "duration": 1468353300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyShoppingCartText()"
});
formatter.result({
  "duration": 27015100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheQuantityIsTwo()"
});
formatter.result({
  "duration": 22847900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheTotal()"
});
formatter.result({
  "duration": 25390200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCheckBox()"
});
formatter.result({
  "duration": 36492900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCheckOutButton()"
});
formatter.result({
  "duration": 465929200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyWelcomeMessage()"
});
formatter.result({
  "duration": 29406600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegisterTab()"
});
formatter.result({
  "duration": 267131200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyRegisterText()"
});
formatter.result({
  "duration": 26738000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iEnterTextInMandatoryFields()"
});
formatter.result({
  "duration": 412234700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegistrationButton()"
});
formatter.result({
  "duration": 272662000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyRegistrationText()"
});
formatter.result({
  "duration": 20065924300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[text()\u003d\u0027Your registration completed\u0027]\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [8b40ce258378cf308a301e914e083907, findElement {using\u003dxpath, value\u003d//div[text()\u003d\u0027Your registration completed\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\viren\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50024}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50024/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8b40ce258378cf308a301e914e083907\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy25.getText(Unknown Source)\r\n\tat com.nopcommerce.demo.pages.ElectronicsPage.verifyRegistrationText(ElectronicsPage.java:421)\r\n\tat com.nopcommerce.demo.cucumber.steps.ElectronicsSteps.iVerifyRegistrationText(ElectronicsSteps.java:128)\r\n\tat ✽.And I verify Registration Text(electronicspage.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iCheckShoppingCartText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iEnterUserName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iEnterPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnTermsAndServicesBox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCheckoutLast()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iFillDeliveryAddressFields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinuesButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnSecondDayAirButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickContinue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectCreditCardRadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickCon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectVisaFromDropDown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iFillCardDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickConBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyCreditCardText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifySecondDayAirText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyFinalTotal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerSteps.iClickOnConfirmButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerSteps.iVerifyThankYouText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifySuccessfullyProcessedMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyWelcomeToOurStoreText()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1090714100,
  "status": "passed"
});
formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "Topmenu Page Test",
  "description": "As a user I would like to select top menu from nop commerce website",
  "id": "topmenu-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2815830200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify User Should Navigate To Computer",
  "description": "",
  "id": "topmenu-page-test;verify-user-should-navigate-to-computer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select Computer tab from top tab menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify computers text",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 25400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iSelectComputerTabFromTopTabMenu()"
});
formatter.result({
  "duration": 585793200,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iVerifyComputersText()"
});
formatter.result({
  "duration": 49828000,
  "status": "passed"
});
formatter.after({
  "duration": 766092700,
  "status": "passed"
});
formatter.before({
  "duration": 1960867200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify User Should Navigate To Electronics",
  "description": "",
  "id": "topmenu-page-test;verify-user-should-navigate-to-electronics",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I select Electronics tab from top tab menu",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify Electronics text",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 26900,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iSelectElectronicsTabFromTopTabMenu()"
});
formatter.result({
  "duration": 441835700,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iVerifyElectronicsText()"
});
formatter.result({
  "duration": 26755500,
  "status": "passed"
});
formatter.after({
  "duration": 642035000,
  "status": "passed"
});
formatter.before({
  "duration": 1735221000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "verify User Should Navigate To Apparel",
  "description": "",
  "id": "topmenu-page-test;verify-user-should-navigate-to-apparel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I select Apparel tab from top tab menu",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I verify Apparel text",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 14400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iSelectApparelTabFromTopTabMenu()"
});
formatter.result({
  "duration": 436092400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iVerifyApparelText()"
});
formatter.result({
  "duration": 25686100,
  "status": "passed"
});
formatter.after({
  "duration": 614961500,
  "status": "passed"
});
});