package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rough {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();

        System.out.println("Code running continously");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Password");
    }
}
