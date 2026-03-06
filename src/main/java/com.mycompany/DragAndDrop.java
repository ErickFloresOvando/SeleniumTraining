package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
    //Atributes
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
    public void DragAndDropTest() throws InterruptedException {
        //Open application
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        //Find element and drag and drop
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();

        Thread.sleep(3000);
    }
    //Quit
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
