package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {


       // TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
       // WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //Locate header using css selector, locate parent and move down toh2
        WebElement header_ex1= driver.findElement(By.cssSelector("dive.exapmle>h2"));
        //Locate header using XPath, and using web element "Forgot Password"
       // WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header_ex2= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel=driver.findElement(By.xpath("//label[@for='email']"));


        //d. E-mail input box
        //WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));
        //Locate Xpath using contains





        //e. “Retrieve password” button
        WebElement retriveButton= driver.findElement(By.xpath("//button[@id='form_submit']"));


        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.

        System.out.println("homeLink_ex2.isDisplayed() = " + homeLink_ex2.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("retriveButton.isDisplayed() = " + retriveButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());



        //First solve the task with using cssSelector only. Try to create 2 different
       // cssSelector if possible

       // Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible




    }
}
