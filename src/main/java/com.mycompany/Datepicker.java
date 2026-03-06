package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Datepicker {
    //Atributes
    protected static WebDriver driver;

    @BeforeClass
    public void setUp(){
        //Open Browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public void DatepickerTest(){
        //Open application
        driver.get("https://formy-project.herokuapp.com/datepicker");

        //Find and select datepicker
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("01/03/2026");
        dateField.sendKeys(Keys.RETURN);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
