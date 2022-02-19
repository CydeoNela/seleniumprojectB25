package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
    public static void main(String[] args) {


        //TC#3: Google search
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");


        // 3- Write “apple” in search box
        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);



        //5- Verify title:
        // Expected: Title should start with “apple” word
     String expectdTitle="apple";
     String actualTitle=driver.getTitle();
     if(actualTitle.startsWith(expectdTitle)){
         System.out.println("Title verification PASSED");
     }else{
         System.out.println("Title verification FAILED");
     }
     driver.close();

    }
}