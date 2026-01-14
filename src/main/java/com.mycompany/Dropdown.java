package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://formy-project.herokuapp.com/dropdown");

        //Dropdown menu
        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        WebElement autocompletItem = driver.findElement(By.id("autocomplete"));
        autocompletItem.click();

        //Quit
        //driver.quit();

    }
}
