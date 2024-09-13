package AnnotationsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Amazon extends Flipkart {

    @Test(priority = 1)
    public void searchbar(){
        driver.get("https://www.amazon.in/");
        System.out.println("Amazon title: "+driver.getTitle());
        WebElement element = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        element.sendKeys("I phone 15");
        element.submit();
        System.out.println("AmazonClass "+driver.getTitle());

    }
    @Test(priority = 2)
    public void main(){
        System.out.println("Amazon open successfully");
    }

}
