package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollToElement {
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
    public void scrollToElementTest() {
        //Open application
        driver.get("https://formy-project.herokuapp.com/scroll");

        //Find element and scroll to element
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Meagahn Lewis");

        //Enter a date
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");
    }

    //Quit
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
