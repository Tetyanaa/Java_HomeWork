package com.tplysyuk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.bookdepository.com");
        WebElement locateLogo = driver.findElement(By.className("brand-link"));
        WebElement sighInRegister = driver.findElement(By.xpath("//div[@class='user-nav']//i[@class='icon-user']"));
        WebElement searchInput = driver.findElement(By.name("searchTerm"));
        searchInput.sendKeys("camileo");
        WebElement searchBtn = driver.findElement(By.className("header-search-btn"));
        searchBtn.click();
        WebElement addBook = driver.findElement(By.xpath("//div[@class='book-item' and ./meta[@itemprop='name'" +
                " and @content='The Stranger']]//div[@class='item-actions']/div/a"));
        addBook.click();
        Thread.sleep(1000);
        WebElement checkoutBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right " +
                "continue-to-basket string-to-localize link-to-localize']"));

        checkoutBtn.click();
        Thread.sleep(20000);
        driver.quit();


    }
}


