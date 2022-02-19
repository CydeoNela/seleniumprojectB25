package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTC3 {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/ ");


        //3- Verify “Log in” button text is as expected:
       // Expected: Log In
        WebElement logInButton= driver.findElement(By.className("login-btn"));
        logInButton.click();
        String expectedLogIn="Log In";




        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
               // PS2: Pay attention to where to get the text of this button from
    }
}
