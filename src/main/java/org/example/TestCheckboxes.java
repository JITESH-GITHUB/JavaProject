package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCheckboxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //  driver.findElement(By.xpath("//div[4]/input[1]")).click();

        for (int i = 1; i <= 4; i++) {
            driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
        }
        driver.findElement(By.xpath("//div[7]/input[2]")).click();
        driver.findElement(By.xpath("//div[7]/input[3]")).click();
    }
}


