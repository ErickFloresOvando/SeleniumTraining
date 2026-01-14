package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://formy-project.herokuapp.com/fileupload");

        //Find element and sendkey
        WebElement fileUploadField = driver.findElement(By.id("fileUpload"));
        fileUploadField.sendKeys("file-to-upload.png");

    }
}
