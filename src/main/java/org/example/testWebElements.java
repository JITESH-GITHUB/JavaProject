package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testWebElements {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("HELLO WORLD!!!");
        System.out.println("HEY, I  AM JITESH");

        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.id("identifierId"));
        username.sendKeys("yjitesh122504@gmail.com");
        // driver.manage().window().minimize();

        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
    }
}


