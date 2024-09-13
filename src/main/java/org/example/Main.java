package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://gmail.com/");

        // Driver.manage().window().maximize();
        WebElement username = Driver.findElement(By.id("identifierId"));
        username.sendKeys("trainer@way2automation.com");

        Driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement password = Driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        password.sendKeys("ABcd1234");
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();

    }
}