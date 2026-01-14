package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://formy-project.herokuapp.com/datepicker");

        //Find and select datepicker
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("01/03/2026");
        dateField.sendKeys(Keys.RETURN);

        //Quit
        driver.quit();

    }
}
