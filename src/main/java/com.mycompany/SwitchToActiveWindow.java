package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

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
}
