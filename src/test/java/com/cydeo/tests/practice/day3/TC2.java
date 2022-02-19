package com.cydeo.tests.practice.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2 {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/ ");


        // 3- Verify “remember me” label text is as expected:
        //  Expected: Remember me on this computer
        WebElement remeberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedLabel="Remember me on this computer";
        String actualLabel=remeberMeLabel.getText();
        if (actualLabel.equals(expectedLabel)){
            System.out.println("Label verification PASSED!");
        }else{
            System.out.println("Label verification FAILED!!!");
        }

        //  4- Verify “forgot password” link text is as expected:
        // Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordText="Forgot your password?";
        String actualForgotPasswordText=forgotPassword.getText();
        if(actualForgotPasswordText.equals(expectedForgotPasswordText)){
            System.out.println("Forgot Password link verification PASSED!");
        }else{
            System.out.println("Forgot Password link verification FAILED!!!");
        }


        //   5- Verify “forgot password” href attribute’s value contains expected:
        // Expected: forgot_password=yes
        String expectedHref="forgot_password=yes";
        String actualHref=forgotPassword.getAttribute("href");
        if (actualHref.equals(expectedHref)){
            System.out.println("Href verification PASSED!");
        }else{
            System.out.println("Href verification FAILED!!!");
        }
        driver.close();
    }
}
