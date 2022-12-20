Feature:  Computer Page Test
  As a user I would like to go to computer page into nop commerce website

  @smoke
  @regression
  Scenario: Verify Product Arrange In Alphabetical Order
    Given I am on Homepage
    When I click on Computer tab
    And I click on Desktop
    Then I should select product in descending order "Name: Z to A"
  @sanity
  @regression
  Scenario: Verify Product Added To Shopping Cart SuccessFully
    Given I am on Homepage
    When I click on Computer tab
    And I click on Desktop
    And I should select product in descending order "Name: A to Z"
    And I click on add to cart
    And I verify Build your own computer message
    And I select Processor by value"1"
    And I select Ram GB by value "5"
    And I click On HDD Radio
    And I click On Os Radio Vista Premium
    And I click On Software Total Commander
    And I total Command
    And I click On Add To Cart Button
    And I verify The product has been added to your shopping cart message
    And I close Cart MessageBox
    And I mouseHover On Shopping Cart
    And I click On Shopping Cart
#    And I verify Shopping cart message
    And I clear Text In Quantity Field
    And I send Text To Quantity Field
    And I click On Update Shopping Cart Button
    And I verify price
    And I click On CheckBox I Agree With Terms And Condition
    And I click On Check Out Button
    And I verify Welcome, Please Sign In message
    And I click On Check Out As GuestBox
    And I enter Text To First Name Field
    And I enter Text To Last Name Field
    And I enter Text To email Field
    And I select Text To Country Field
    And I select State To State Field
    And I select Text To City Field
    And I send Text To AddressLineA
    And I enter Text To AddressLineB
    And I enter Text To Postcode
    And I enter Text To PhoneNumber Field
    And I click On Continue Button
    And I click On NextDay Air Button
    And I click On Continue Button Again
    And I click On CreditCard Button
    And I click On Continuetwo
    And I click On CreditCard Radio Button
    And I click On Continue ButtonC
    And I select MasterCard From CreditCard Dropdown
    And I send Text TO CardHolder Name
    And I send Text TO CardNumber
    And I select Month And Year For CreditCard Expire Data
    And I send Text To CardCode
    And I click On Continue ButtonD
    And I verify get Paymen tMethod Text
    And I verify Shipping Method Text
    And I verify Total Price number
    And I click On Confirm Button
    And I verify Thank You Text
    And I verify Successfully Processed Text
    And I click On Continue ButtonF
    And I get Welcome To Our Store Text


