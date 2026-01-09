package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        //Find element and sendkey on autocomplete
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(5000);

        //click on autocomplete
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        //Quit
        driver.quit();
    }
}
