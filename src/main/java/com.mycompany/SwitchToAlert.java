package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwitchToAlert {
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
    public void switchToAlert() {
        //Open application
        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Find Webelement
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        //Switch to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    //Quit
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
