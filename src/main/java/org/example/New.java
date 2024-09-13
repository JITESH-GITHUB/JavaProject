package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("http://flipkart.com");
        String title = driver.getTitle();
        System.out.println(title);


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://amazon.com");
        String Title = driver.getTitle();
        System.out.println(Title);


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://google.com");
        WebElement search = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
        search.sendKeys("selenium 4");
        search.submit();
        String TITLE = driver.getTitle();
        System.out.println(TITLE);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gamil.com");
        String title1 = driver.getTitle();
        System.out.println(title1);

        System.out.println(driver.getWindowHandles().size());
        driver.quit();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://google.com");
        WebElement img = driver1.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
        Rectangle rect = img.getRect();
        System.out.println(rect.getHeight());
        System.out.println(rect.getX());
        System.out.println(rect.getWidth());
        System.out.println(rect.getY());


    }
}
