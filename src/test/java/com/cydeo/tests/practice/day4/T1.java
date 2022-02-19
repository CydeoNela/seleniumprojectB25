package com.cydeo.tests.practice.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1 {
    public static void main(String[] args) {




        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");


        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //tagName[attribute='value']
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //b. “Forgot password” header

        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));

        //c. “E-mail” text

        driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        WebElement retrivePassword = driver.findElement(By.xpath("//button[@class='radius']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible

        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible





    }
}
