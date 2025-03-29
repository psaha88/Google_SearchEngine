package AdvanceSelenium;

import common.GoogleBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class PracticeSwitichingWindow extends GoogleBase {

    public static void main (String [] args) {

        launchBrowser("https://the-internet.herokuapp.com/windows");

        WebElement ClickHereButton= driver.findElement(By.linkText("Click Here"));
        ClickHereButton.click();


        switchWindowByTitle(driver, "New Window");

        WebElement text= driver.findElement(By.xpath("//h3"));

        System.out.println (text.getText());

    }

    public static void switchWindowByTitle (WebDriver driver, String title) {

        String currentWindow= driver.getWindowHandle();

        Set<String> allWindows=driver.getWindowHandles();

        for (String winHandle:allWindows) {
            if (!driver.switchTo().window(winHandle).getTitle().equals(title)) {
                driver.switchTo().window(currentWindow);

            }
        }
    }
}


