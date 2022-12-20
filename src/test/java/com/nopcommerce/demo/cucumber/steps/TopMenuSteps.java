package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class TopMenuSteps {
    @When("^I select Computer tab from top tab menu$")
    public void iSelectComputerTabFromTopTabMenu() {
        new TopMenuPage().selectMenu("Computers");
    }

    @Then("^I verify computers text$")
    public void iVerifyComputersText() {
        Assert.assertEquals("Message not displayed", "Computers",
                new TopMenuPage().verifyComputer());
    }

    @When("^I select Electronics tab from top tab menu$")
    public void iSelectElectronicsTabFromTopTabMenu() {
        new TopMenuPage().selectMenu("Electronics");
    }

    @Then("^I verify Electronics text$")
    public void iVerifyElectronicsText() {
        Assert.assertEquals("Message not displayed","Electronics",
                new TopMenuPage().verifyElectronics() );
    }

    @When("^I select Apparel tab from top tab menu$")
    public void iSelectApparelTabFromTopTabMenu() {
        new TopMenuPage().selectMenu("Apparel");
    }

    @Then("^I verify Apparel text$")
    public void iVerifyApparelText() {
        Assert.assertEquals("Message not displayed","Apparel",
                new TopMenuPage().verifyApparel());
    }
}
