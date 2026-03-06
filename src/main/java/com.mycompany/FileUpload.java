package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload {
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
    public void FileUploadTest() {
        //Open application
        driver.get("https://formy-project.herokuapp.com/fileupload");

        //Find element and sendkey
        WebElement fileUploadField = driver.findElement(By.id("fileUpload"));
        fileUploadField.sendKeys("file-to-upload.png");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
