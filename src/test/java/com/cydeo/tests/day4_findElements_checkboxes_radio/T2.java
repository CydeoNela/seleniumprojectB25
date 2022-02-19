package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T2 {
    public static void main(String[] args) {

        //TC #6:  XPATH LOCATOR practice
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1

        //4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”

        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
