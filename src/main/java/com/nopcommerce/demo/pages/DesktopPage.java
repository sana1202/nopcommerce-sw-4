package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By sortBy = By.xpath("//select[@name='products-orderby']");
    By addToCartButton = By.xpath("//div[@data-productid='1']//button[text()='Add to cart']");
    public void sortByZToA(){
        selectByVisibleTextFromDropDown(sortBy,"Name: Z to A");
    }

    public void sortByAToZ(){
        selectByVisibleTextFromDropDown(sortBy,"Name: A to Z");
    }
    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
    }
}
