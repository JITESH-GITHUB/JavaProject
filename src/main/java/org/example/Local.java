package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Local {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://flipkart.com");
        String Title = driver.getTitle();
        System.out.println("Title:" + Title);
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("samsung s24 ultra");
        search.submit();
        String title = driver.getTitle();
        System.out.println("title:" + title);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
        Set<String> handle = driver.getWindowHandles();
        Iterator<String> itr = handle.iterator();
        String Parentwindowid = itr.next();
        // System.out.println("parentid is"+Parentwindowid);
        String Childwindowid = itr.next();
        //System.out.println("Childwindowid is"+Childwindowid);
        driver.switchTo().window(Childwindowid);
        String title1 = driver.getTitle();
        System.out.println("title1:" + title1);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();


    }
}
