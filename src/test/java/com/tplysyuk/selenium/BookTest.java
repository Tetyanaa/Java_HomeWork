package com.tplysyuk.selenium;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

    static WebDriver driver;


    @BeforeAll
    public static void init() {
        driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com");
    }

    @AfterAll
    public static void shutdown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement locateLogo = driver.findElement(By.className("brand-link"));
        WebElement sighInRegister = driver.findElement(By.xpath("//div[@class='user-nav']//i[@class='icon-user']"));
    }

    @Test
    public void test2() throws InterruptedException {

        searchBook("camileo");
        Thread.sleep(100);
        addBookToBasket("The Stranger");
        Thread.sleep(1000);
        checkOutButton();
        Thread.sleep(1000);
        checkOutFinal();
        Thread.sleep(1000);
        checkSubTotal();
        checkTotalValue();
        checkTaxValue();
        enterMail("test@user.com");

    }

    public void searchBook(String bookName) {
        WebElement searchInput = driver.findElement(By.name("searchTerm"));
        searchInput.sendKeys(bookName);
        WebElement searchBtn = driver.findElement(By.className("header-search-btn"));
        searchBtn.click();
    }

    public void addBookToBasket(String bookTitle) {
        WebElement addBook = driver.findElement(By.xpath("//div[@class='book-item' and ./meta[@itemprop='name'" +
                " and @content='" + bookTitle + "']]//div[@class='item-actions']/div/a"));
        addBook.click();
    }

    public void checkOutButton() {
        WebElement checkoutBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right " +
                "continue-to-basket string-to-localize link-to-localize']"));
        checkoutBtn.click();
    }


    public void checkOutFinal() {
        WebElement checkoutBtnFinal = driver.findElement(By.xpath("//a[@class='checkout-btn btn optimizely-variation-1 original-bucket']"));
        checkoutBtnFinal.click();
    }

    public void checkSubTotal() {
        String subTotal = driver.findElement(By.xpath("//dd[@class='text-right']")).getText();
        assertEquals("10,77 €", subTotal);
    }

    public void checkTotalValue() {
        String totalValue = driver.findElement(By.xpath("//dd[@class='text-right total-price']")).getText();
        assertEquals("10,77 €", totalValue);
    }

    public void checkTaxValue() {
        String taxValue = driver.findElement(By.xpath("//dd[@class='text-right total-tax']")).getText();
        assertEquals("0,00 €", taxValue);
    }

    public void enterMail(String mailAddress) {
        WebElement mailField = driver.findElement(By.xpath("//input[@id='ap_email']"));
        mailField.sendKeys(mailAddress);
    }

}


