package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By welcomeText = By.xpath("//div[@class='page-title']/h1");
    By checkoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickCheckoutAsGuest() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkoutAsGuest);
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
    }
}
