package AdvanceSelenium;

import common.GoogleBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeCheckbox extends GoogleBase {

    public static void main (String [] args) {

        launchBrowser("https://the-internet.herokuapp.com/checkboxes");

        WebElement chk1= driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement chk2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        if (!chk1.isSelected()) {
            chk1.click();
        }

        else if (chk2.isSelected()) {

            System.out.println ("checkbox 2 is already selected");

        }

    }
}
