package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingWindows {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement link = driver.findElement(By.linkText("Gmail"));
        link.click();
        WebElement button = driver.findElement(By.xpath("/html/body/header/div/div/div/details/summary/div[1]"));
        button.click();
        driver.findElement(By.xpath("/html/body/header/div/div/div/details/div/a[1]")).click();


        int x = link.getRect().getX();
        int y = link.getRect().getY();
        Actions actions = new Actions(driver);
        actions.moveByOffset(x, y).click().perform();


    }

}
