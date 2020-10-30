package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DATA_POLICY = "//div[contains(@class, \"_9fiw\")]/button[2]";
    public static final String XPATH_CREAT_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_FIRST_NAME = "//*[@id=\"u_1_b\"]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement dataPolicy = driver.findElement(By.xpath(XPATH_DATA_POLICY));
        dataPolicy.click();

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREAT_ACCOUNT));
        createAccount.click();

        //while (!driver.findElement(By.xpath(XPATH_CREAT_ACCOUNT)).isDisplayed());
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        WebElement firstName = driver.findElement(By.xpath(XPATH_FIRST_NAME));
        firstName.sendKeys("Firstname");

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"u_2_d\"]"));
        lastName.sendKeys("Lastname");

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"u_2_g\"]"));
        phoneNumber.sendKeys("111222333");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
        password.sendKeys("Testowehaslo1.");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select select1 = new Select(selectDay);
        select1.selectByValue("29");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select select2 = new Select(selectMonth);
        select2.selectByValue("wrz");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select select3 = new Select(selectYear);
        select3.selectByValue("2019");
    }
}
