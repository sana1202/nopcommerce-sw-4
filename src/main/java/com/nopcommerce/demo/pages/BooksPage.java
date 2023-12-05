package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By books = By.xpath("//h1[contains(text(),'Books')]");
    public String getBooksText() {
        return getTextFromElement(books);
    }
}
