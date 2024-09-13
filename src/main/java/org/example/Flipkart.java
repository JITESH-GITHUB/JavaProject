package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Flipkart {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement search = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
        search.click();
        search.sendKeys("I phone 15");
        search.submit();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img")).click();

        Set<String> handle = driver.getWindowHandles();
        Iterator<String> itr = handle.iterator();
        String parentwindowid = itr.next();
        String Childwindowid = itr.next();
        driver.switchTo().window(Childwindowid);
        String thirdwindow = itr.next();
        driver.switchTo().window(thirdwindow);
        String fifthwindow = itr.next();
        driver.switchTo().window(fifthwindow);

    }
}

