package AnnotationsPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Blinkit {
    @Test
    public void blinkit() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blinkit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//button[text()=\"Detect my location\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement webElement =  driver.findElement(By.xpath("//div[contains(@class,\"SearchBar__IconContainer\")]"));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        actions.scrollToElement(webElement).perform();
        webElement.click();
        WebElement element=driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
        element.sendKeys("Butter");
        element.clear();
        element.sendKeys("Peanuts");

    }
}
