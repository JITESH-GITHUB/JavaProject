package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestIsElementPresent {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-de\"]/strong")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-pt\"]/strong")).isDisplayed());
    }
}
