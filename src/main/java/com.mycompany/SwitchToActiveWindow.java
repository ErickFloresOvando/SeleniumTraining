package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwitchToActiveWindow {
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
    public void switchToActiveWindowTest() {
        //Open application
        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Find Webelement
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        //Switch to new tab
        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);

    }

    //Quit
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
