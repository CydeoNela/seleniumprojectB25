package com.cydeo.tests.practice.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
    public static void main(String[] args) {

        // TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3- Enter incorrect username: “incorrect”
        WebElement incorrectUserName = driver.findElement(By.className("login-inp"));
        incorrectUserName.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”

        WebElement incorrectPassword = driver.findElement(By.name("USER_PASSWORD"));
        incorrectPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement logInButton = driver.findElement(By.className("login-btn"));
        logInButton.click();


        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errMsg = driver.findElement(By.className("errortext"));
        String expectedErrMsg="Incorrect login or password";
        String actualErrMsg=errMsg.getText();

        if (actualErrMsg.equals(expectedErrMsg)){
            System.out.println("Err msg verification PASSED!");
        }else{
            System.out.println("Err msg verification FAILED!!!");
        }
        driver.close();
    }
}
