package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) {
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

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        //Click on result
        autocompleteResult.click();

        //Quit
        driver.quit();

    }
}
