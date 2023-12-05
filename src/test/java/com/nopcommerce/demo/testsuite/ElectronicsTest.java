package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonesPage = new CellPhonePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.hoverOnElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhones();
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getCellPhonesText(), "Cell phones", "Cell phones text not displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.hoverOnElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhones();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getCellPhonesText(), "Cell phones", "Cell phones text not displayed");
        //2.4 Click on List View Tab
        Thread.sleep(1000);
        cellPhonesPage.clickListTab();
        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        cellPhonesPage.clickOnNokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(productPage.getNokiaLumiaText(), "Nokia Lumia 1020", "Nokia Lumia Text not displayed");
        //2.7 Verify the price “$349.00”
        Assert.assertEquals(productPage.getNokiaLumiaPrice(), "$349.00", "Price not $349.00");
        //2.8 Change quantity to 2
        productPage.clearQuantity();
        productPage.sendQuantity("2");
        //2.9 Click on “ADD TO CART” tab
        productPage.clickAddToCartNokia();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(500);
        Assert.assertEquals(productPage.getSuccessfullyAddedMessage(), "The product has been added to your shopping cart", "Successfully added message not displayed");
        //After that close the bar clicking on the cross button.
        //Thread.sleep(500);
        productPage.closeSuccessMessage();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        //Thread.sleep(500);
        productPage.mouseHoverOnShoppingCart();
        //Thread.sleep(500);
        productPage.clickOnGoToCart();
        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartMessage(), "Shopping cart", "Not on shopping cart");
        //2.13 Verify the quantity is 2
        Assert.assertEquals(shoppingCartPage.getQuantity(), "2", "Quantity not 2");
        //2.14 Verify the Total $698.00
        Assert.assertEquals(shoppingCartPage.getTotalPriceShoppingCart(), "$698.00", "Price not $698.00");
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfService();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckout();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.getWelcomeText(), "Welcome, Please Sign In!", "Welcome text not displayed");
        //2.18 Click on “REGISTER” tab
        signInPage.clickOnRegister();
        //2.19 Verify the text “Register”
        Assert.assertEquals(registerPage.getRegisterText(), "Register", "Register page not displayed");
        //2.20 Fill the mandatory fields
        Thread.sleep(1000);
        registerPage.enterFirstName("Hello");
        Thread.sleep(200);
        registerPage.enterLastName("Patel");
        Thread.sleep(200);
        registerPage.enterEmail("Hellopatel");
        Thread.sleep(200);
        registerPage.enterPassword("Jaynika123");
        Thread.sleep(200);
        registerPage.enterConfirmPassword("Jaynika123");
        Thread.sleep(200);
        //2.21 Click on “REGISTER” Button
        registerPage.clickRegisterButton();
        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals(registerPage.registrationCompleteMessage(), "Your registration completed", "Register message not displayed");
    }
}
