package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirthDay = By.id("DateOfBirthDay");
    By monthOfBirth = By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationSuccess = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
    }

    public void enterLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
    }

    public void enterDateOfBirthDay(String inputDay) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, inputDay);
    }

    public void enterMonthOfBirth(String inputMonth) {
        selectByVisibleTextFromDropDown(monthOfBirth, inputMonth);
    }

    public void enterYearofBirth(String inputYear) {
        selectByVisibleTextFromDropDown(yearOfBirth, inputYear);
    }

    public void enterEmail(String inputEmail) {
        sendTextToElement(email, inputEmail + getRandomAlphaNumericString(3) + "@gmail.com");
    }

    public void enterPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
    }

    public void enterConfirmPassword(String inputConfirmPassword) {
        sendTextToElement(confirmPassword, inputConfirmPassword);
    }

    public void clickRegisterButton() {
        clickOnElement(registerButton);
    }

    public String registrationCompleteMessage() {
        return getTextFromElement(registrationSuccess);
    }

    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
}
