package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
    public static void main(String[] args) {

        //TC #4: Library verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to http://library2.cybertekschool.com/login.html
        driver.navigate().to("http://library2.cybertekschool.com/login.html");


        //3. Enter username: “incorrect@email.com”
        WebElement enterUsername=driver.findElement(By.className("form-control"));
        enterUsername.sendKeys("incorrect@email.com");

        // 4. Enter password: “incorrect password”
        WebElement enterPassword=driver.findElement(By.id("inputPassword"));
        enterPassword.sendKeys("incorrect password");

       //Click to SIgnIN button
        WebElement signInButton= driver.findElement(By.tagName("button"));
        signInButton.click();

        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed

        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        WebElement usernameInputBox= driver.findElement(By.className("form-control has-error"));
    }
}
