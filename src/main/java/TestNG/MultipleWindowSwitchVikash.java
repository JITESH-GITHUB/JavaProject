package TestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;
import java.util.Set;

public class MultipleWindowSwitchVikash {
    WebDriver driver;
    @BeforeTest
    public void loginFlipkart(){
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @Test
    public void testMultiWindow() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();

        WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
        searchBar.sendKeys("Samsung");
        searchBar.submit();
        WebElement firstSearchResult = driver.findElement(By.xpath("(//div[contains(@data-id,\"MOB\")])[1]"));
        firstSearchResult.click();

        driver.switchTo().window(parentWindow);
        searchBar = driver.findElement(By.xpath("//input[@name='q']"));
        searchBar.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        searchBar.sendKeys("Iphone");
        searchBar.submit();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(@data-id,'MOB')])[1]")));
        Thread.sleep(5000);
        WebElement firstSearchResult1 = driver.findElement(By.xpath("(//div[contains(@data-id,'MOB')])[1]"));
        firstSearchResult1.click();

        driver.switchTo().window(parentWindow);
        searchBar = driver.findElement(By.xpath("//input[@name='q']"));
        searchBar.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        searchBar.sendKeys("Redmi");
        searchBar.submit();
        Thread.sleep(5000);
        WebElement firstSearchResult2 = driver.findElement(By.xpath("(//div[contains(@data-id,'MOB')])[1]"));
        firstSearchResult2.click();

        Set<String> handle = driver.getWindowHandles();
        System.out.println(parentWindow);
        System.out.println(handle);
        for (String window : handle) {
            driver.switchTo().window(window);
            System.out.println(window);
            if (Objects.equals(window, parentWindow))
                continue;
            Thread.sleep(5000);
            System.out.println(driver.findElement(By.className("VU-ZEz")).getText());
            if (driver.findElement(By.className("VU-ZEz")).getText().contains("Redmi"))
                break;
        }
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}


