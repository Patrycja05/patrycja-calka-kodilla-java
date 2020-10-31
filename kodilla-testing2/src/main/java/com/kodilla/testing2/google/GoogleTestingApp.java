package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "gLFyf gsfi";
    public static final String COOKIE_POLICY = "//*[@id=\"introAgreeButton\"]/div[2]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

        Thread.sleep(4000);

        WebElement cookiePolicy = driver.findElement(By.xpath(COOKIE_POLICY));
        cookiePolicy.click();

        Thread.sleep(2000);

        WebElement searchField = driver.findElement(By.className(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
