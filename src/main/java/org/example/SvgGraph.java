package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SvgGraph {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://whatismytimezone.com/");
        Thread.sleep(5000);

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // devTools.send(Emulation.setTimezoneOverride("EST"));
        driver.get("https://whatismytimezone.com/");


        //   devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        // devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg",".png","*.jpeg")));


    }
}
