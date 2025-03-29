package AdvanceSelenium;

import common.GoogleBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeDropDown extends GoogleBase {

    public static void main (String [] args) throws InterruptedException {

        launchBrowser ("https://the-internet.herokuapp.com/dropdown");

        WebElement Dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select s= new Select(Dropdown);

        s.selectByIndex(1);
        Thread.sleep(3000);

        s.selectByValue("2");

        Thread.sleep(3000);

        s.selectByVisibleText("Option 1");

        List<WebElement> allItems=s.getOptions();
        for (int i=0; i<allItems.size(); i++){
            System.out.println(allItems.get(i).getText());

        }
    }


}
