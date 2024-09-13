package Pacakage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//yt-icon[@id=\"guide-icon\"]")).click();
        WebElement element = driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']"));
        element.click();
        System.out.println(element.getText());
        Thread.sleep(3000);
        List<WebElement> Title = driver.findElements(By.xpath("//yt-formatted-string[contains(text(),\"Elvish Yadav\")]"));
        System.out.println(Title.size());
        for (WebElement element1 : Title) {
            System.out.println("Content: " + element1.getText());

        }

    }
}
