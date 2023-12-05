package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorDropDown = By.xpath("//select[@id='product_attribute_1']");
    By ramDropDown = By.xpath("//select[@id='product_attribute_2']");
    By radioHDD400GB = By.xpath("//input[@id='product_attribute_3_7']");
    By radioOSVistaPremium = By.xpath("//label[text()='Vista Premium [+$60.00]']");
    By totalCommanderRadio = By.xpath("//input[@id='product_attribute_5_12']");
    By actualPrice = By.xpath("//div[@class='product-price']/span");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1'] ");
    By actualProductAddedToShoppingCart = By.xpath("//div[@class='bar-notification success']/p");
    By closeButton = By.xpath("//div[@class='bar-notification success']/span");
    By shoppingCartHover = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");
    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumiaPrice = By.id("price-value-20");
    By quantity = By.id("product_enteredQuantity_20");
    By addToCartButtonNokia = By.id("add-to-cart-button-20");
    By successfullyAddedMessage = By.xpath("//body/div[@id='bar-notification']/div[1]");
    By successCloseButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public String getBuildYourOwnComputerText(){
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String inputProcessor) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(processorDropDown,inputProcessor);
    }
    public void selectRAM(String inputRAM) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(ramDropDown, inputRAM);
    }

    public void clickHDD() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(radioHDD400GB);
    }

    public void clickOS() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(radioOSVistaPremium);
    }

    public void clickTotalCommander() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(totalCommanderRadio);
    }

    public String getTextActualPrice() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(actualPrice);
    }

    public void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getProductAddedToCartMessage() {
        return getTextFromElement(actualProductAddedToShoppingCart);
    }

    public void clickCloseButton() {
        clickOnElement(closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartHover);
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCartButton);
    }

    public String getNokiaLumiaText() {
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaLumiaPrice() {
        return getTextFromElement(nokiaLumiaPrice);
    }
    public void clearQuantity(){
        driver.findElement(quantity).clear();
    }
    public void sendQuantity(String inputQuantity){
        sendTextToElement(quantity,inputQuantity);
    }

    public void clickAddToCartNokia() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButtonNokia);
    }
    public String getSuccessfullyAddedMessage(){
        return getTextFromElement(successfullyAddedMessage);
    }
    public void closeSuccessMessage(){
        clickOnElement(successCloseButton);
    }

}
