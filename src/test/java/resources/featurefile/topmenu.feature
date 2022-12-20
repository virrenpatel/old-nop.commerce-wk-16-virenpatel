Feature:  Topmenu Page Test
  As a user I would like to select top menu from nop commerce website

  @smoke
  @regression
  Scenario: Verify User Should Navigate To Computer
    Given I am on Homepage
    When I select Computer tab from top tab menu
    Then I verify computers text

  @sanity
  @regression
  Scenario: Verify User Should Navigate To Electronics
    Given I am on Homepage
    When I select Electronics tab from top tab menu
    Then I verify Electronics text

  @regression
  Scenario: verify User Should Navigate To Apparel
    Given I am on Homepage
    When I select Apparel tab from top tab menu
    Then I verify Apparel text





