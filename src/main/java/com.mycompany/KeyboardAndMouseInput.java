package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://formy-project.herokuapp.com/keypress");

        //Find element
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Erick Flores");

        //Click on button
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        //Quit
        driver.quit();

    }
}
