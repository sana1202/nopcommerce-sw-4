package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//input[@class='qty-input']");
    By updateButton = By.xpath("//button[@class='button-2 update-cart-button']");
    By totalPrice = By.xpath("//span[@class='value-summary']/strong");
    By termsOfService = By.xpath("//input[@name='termsofservice']");
    By checkout = By.xpath("//button[@name='checkout']");


    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    public void clearQuantity() {
        driver.findElement(quantity).clear();
    }

    public void sendQuantity(String quantityNum) {
        sendTextToElement(quantity, quantityNum);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateButton);
    }

    public String getTotalPriceShoppingCart() {
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService() {
        clickOnElement(termsOfService);
    }

    public void clickOnCheckout() {
        clickOnElement(checkout);
    }

    public String getQuantity() {
        return driver.findElement(quantity).getAttribute("value");
    }
}
