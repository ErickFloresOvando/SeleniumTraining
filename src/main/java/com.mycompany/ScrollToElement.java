package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

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

        //Quit
        driver.quit();

    }
}
