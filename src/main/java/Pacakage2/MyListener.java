package Pacakage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.util.Arrays;

public class MyListener implements WebDriverListener {
    public void afterClick(WebElement element) {
        System.out.println("Clicking on an element" + element);
    }

    public void afterQuit(WebDriver driver) {
        System.out.println("Test execution complete");
    }

    public void afterGet(WebDriver driver, String url) {
        System.out.println("Go to google and type/sendkeys :" + url);
    }

    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        System.out.println("Typing in an element:" + element + "entered the value as :");
//        for (int i = 0; i < keysToSend.length; i++) {
//            System.out.println(keysToSend[i] + " ");
        System.out.println(Arrays.toString(keysToSend));
    }
}

