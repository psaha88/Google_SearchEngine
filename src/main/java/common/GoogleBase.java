package common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GoogleBase {

    public static WebDriver driver;

    public static void launchBrowser(String Url) {

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.get(Url);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser () {

        driver.close ();
    }

    public void closeAll() {
        driver.quit();
    }
}
