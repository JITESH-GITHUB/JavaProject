package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./screenshot/page.jpg"));


//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//       FileUtils.copyFile(screenshot,new File("./screenshot/page.jpg"));


    }

}


