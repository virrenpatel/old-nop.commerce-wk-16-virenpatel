package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement getComputer;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/electronics']")
    WebElement getElectronics;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/apparel']")
    WebElement getApparel;



    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }


    public String verifyComputer() {
        log.info("verifyComputer" + getComputer.getText());
        return getTextFromElement(getComputer);
    }

    public String verifyElectronics() {
        log.info("verifyElectronics" + getElectronics.getText());
        return getTextFromElement(getElectronics);
    }

    public String verifyApparel() {
        log.info("verifyApparel" + getApparel.getText());
        return getTextFromElement(getApparel);
    }

}
