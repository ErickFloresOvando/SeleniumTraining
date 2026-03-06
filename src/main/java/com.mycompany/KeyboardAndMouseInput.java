package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyboardAndMouseInput {
    protected static WebDriver driver;

    @BeforeClass
    public void setUp(){
        //Open browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }


    @Test
    public void KeyboardAndMouseInputTest(){
        //Open application
        driver.get("https://formy-project.herokuapp.com/keypress");

        //Find element
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Erick Flores");

        //Click on button
        WebElement button = driver.findElement(By.id("button"));
        button.click();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
