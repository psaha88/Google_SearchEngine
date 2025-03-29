package AdvanceSelenium;

import common.GoogleBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class practiceMouseHover extends GoogleBase {

    public static void main (String [] args) {

        launchBrowser("https://the-internet.herokuapp.com/hovers");

        WebElement img1=driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        WebElement text1=driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/h5"));
        WebElement link1=driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/a"));

        Actions act= new Actions(driver);
        act.moveToElement(img1).build().perform();

        Assert.assertEquals(text1.getText(), "name: user1");

        Assert.assertTrue(link1.isEnabled());




    }
}
