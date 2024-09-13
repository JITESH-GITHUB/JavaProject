package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TestMultipleElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // WebElement icon = driver.findElement(By.id("searchLanguage"));
        //  Select select = new Select(icon);
        //select.selectByVisibleText("Latina");

        List<WebElement> values = driver.findElements(By.tagName("option"));
        System.out.println("Total values are:" + values.size());
        System.out.println(values.get(25).getText());

        for (int i = 0; i < values.size(); i++)
            System.out.println(values.get(i).getAccessibleName());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Printing links");
        System.out.println("Total no. of links are:" + links.size());


        for (WebElement link : links)
            System.out.println(link.getText() + "--URL is --" + link.getAttribute("href"));

    }
}
