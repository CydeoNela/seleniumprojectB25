package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1.Setup browser driver
        WebDriverManager.chromedriver().setup();

        //2. Create instance of Selenium Webdriver
        //This is the line opening an empty browser
        WebDriver driver=new ChromeDriver();
        //SessionID=HDSOHOBBSLBDKB799769-we see "driver" Selenium see this

        //this line will maximize browser size
        driver.manage().window().maximize();

        //sometimes works for windows
        driver.manage().window().fullscreen();
        
        //3.Go to "https://www.tesla.com
        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        
        String currentURl=driver.getCurrentUrl();
        System.out.println("currentURl = " + currentURl);


        //Stop code execution for 3 sec
        Thread.sleep(3000);

        //Use Selenium to navigate back
        driver.navigate().back();


        //Stop code execution for 3 sec
        Thread.sleep(3000);
        
        //Use Selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 sec
        Thread.sleep(3000);

        //Use Selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 sec
        Thread.sleep(3000);

        //Use navigate().to() method
        driver.navigate().to("https://www.google.com");


        //Get the current tittle after getting the google page
         currentTitle=driver.getTitle();
        System.out.println("driver.getTitle()="+ driver.getTitle());
        
        //Get the current URL using Selenium
        currentURl= driver.getCurrentUrl();
        System.out.println("currentURl = " + currentURl);

        //this will close currently open window
        driver.close();

        //this will close all of the open windows
        driver.quit();
        
        
        
        
        
        

    }


}
