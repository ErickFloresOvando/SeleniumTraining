package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExecuteJavascript {
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
    public void ExecuteJavascriptTest() {

        //Open application
        driver.get("https://formy-project.herokuapp.com/modal");

        //Find element
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        //Javascript Executor
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
