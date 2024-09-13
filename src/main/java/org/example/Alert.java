package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Alert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/resizable/");
        WebElement frames = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));

        driver.switchTo().frame(0);
        WebElement resizable = driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDropBy(resizable, 200, 100).perform();


        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        System.out.println("Code Run Successfully");
        //     driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Jitesh Rao");
        driver.findElement(By.id("login1")).sendKeys("USERNAME");


    }
}
