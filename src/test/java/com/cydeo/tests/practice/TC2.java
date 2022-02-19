package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


       // 2- Go to: https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");



        //3- Click to A/B Testing from top of the list.
        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

       // 4- Verify title is:
       // Expected: No A/B Test
        String expectedTitle="No A/B Test";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


       // 5- Go back to home page by using the .back();
        driver.navigate().back();



       // 6- Verify title equals:
       // Expected: Practice
        expectedTitle="Practice";
        actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verificatin FAILED");
        }
        driver.close();

    }
}