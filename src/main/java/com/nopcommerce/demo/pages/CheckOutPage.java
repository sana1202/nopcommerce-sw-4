package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By countrySelect = By.id("BillingNewAddress_CountryId");
    By stateSelect = By.id("BillingNewAddress_StateProvinceId");
    By email = By.id("BillingNewAddress_Email");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']");
    By nextDayRadioButton = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
    By continueFromShipping = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardPaymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    By paymentMethodDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cVV = By.xpath("//input[@id='CardCode']");
    By continueAfterBilling = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethod = By.xpath("//li[@class='payment-method']/span[@class='value']");
    By shippingMethod = By.xpath("//li[@class='shipping-method']/span[@class='value']");
    By totalAmount = By.xpath("//span[@class='product-subtotal']");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessMessage = By.xpath("//div[@class='section order-completed']/div[@class='title']/strong");
    By confirmMessage = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By continueAfterRegistrationBilling = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    By continueAfterOrderPlaced = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By continueAfterPaymentMethod = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By radioSecondDayAir = By.xpath("//input[@id='shippingoption_2']");
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");

    public void sendFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
    }

    public void sendEmail(String inputEmail) {
        sendTextToElement(email, inputEmail + getRandomAlphaNumericString(3) + "@gmail.com");
    }

    public void selectCountryName(String inputCountry) {
        selectByVisibleTextFromDropDown(countrySelect, inputCountry);
    }

    public void selectStateName(String inputstateName) {
        selectByVisibleTextFromDropDown(stateSelect, inputstateName);
    }

    public void sendCityName(String inputCityName) {
        sendTextToElement(city, inputCityName);
    }

    public void sendAddressName(String inputAddressName) {
        sendTextToElement(address, inputAddressName);
    }

    public void sendPostCode(String inputPostCode) {
        sendTextToElement(postCode, inputPostCode);
    }

    public void sendPhoneNumber(String inputPhoneNumber) {
        sendTextToElement(phoneNumber, inputPhoneNumber);
    }

    public void clickContinue() {
        clickOnElement(continueButton);
    }

    public void chooseShipping() {
        clickOnElement(nextDayRadioButton);
    }

    public void clickContinueFromShipping() {
        clickOnElement(continueFromShipping);
    }

    public void selectPaymentTypeRadioButton() {
        clickOnElement(creditCardPaymentMethod);
    }

    public void selectCardType(String paymentMethodOption) {
        selectByVisibleTextFromDropDown(paymentMethodDropDown, paymentMethodOption);
    }

    public void sendCardholderName(String inputcardHolderName) {
        sendTextToElement(cardHolderName, inputcardHolderName);
    }

    public void sendCardNumber(String inputcardNumber) {
        sendTextToElement(cardNumber, inputcardNumber);
    }

    public void selectExpiryMonth(String inputExpiryMonth) {
        selectByVisibleTextFromDropDown(expiryMonth, inputExpiryMonth);
    }

    public void selectExpiryYear(String inputExpiryYear) {
        selectByVisibleTextFromDropDown(expiryYear, inputExpiryYear);
    }

    public void sendCVVCode(String inputCVV) {
        sendTextToElement(cVV, inputCVV);
    }

    public void clickContinueAfterBilling() {
        clickOnElement(continueAfterBilling);
    }

    public void clickContinueAfterPaymentMethod() {
        clickOnElement(continueAfterPaymentMethod);
    }

    public String getTextPaymentMethod() {
        return getTextFromElement(paymentMethod);
    }

    public String getTextShippingMethod() {
        return getTextFromElement(shippingMethod);
    }

    public String getTextExpectedTotalAmount() {
        return getTextFromElement(totalAmount);
    }

    public void clickConfirm() {
        clickOnElement(confirmMessage);
    }

    public String getTextThankYou() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(thankYouText);
    }

    public String getTextOrderSuccessfullyPlaced() {
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickContinueAfterOrderPlaced() {
        clickOnElement(continueAfterOrderPlaced);
    }

    public void clickContinueAfterRegistrationBilling() {
        clickOnElement(continueAfterRegistrationBilling);
    }

    public void clickRadioShipping() {
        clickOnElement(radioSecondDayAir);
    }

    public void clickLogoutLink() {
        clickOnElement(logoutLink);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
