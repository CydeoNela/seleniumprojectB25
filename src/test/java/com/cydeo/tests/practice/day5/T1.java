package com.cydeo.tests.practice.day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1 {
    public static void main(String[] args) {


        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/ ");

        //3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();


        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());


        //5. Click to “Delete” button.
        deleteBtn.click();


        //6. Verify “Delete” button is NOT displayed after clicking.
        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        try {
            System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());


        } catch (StaleElementReferenceException e) {
            System.out.println("Stale El Ex is thrown");
        }
        driver.close();

    }
}
