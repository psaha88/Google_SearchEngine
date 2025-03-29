package AdvanceSelenium;

import common.GoogleBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class practiceDragandDrop extends GoogleBase {

    public static void main (String [] args){

        launchBrowser("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement colA= driver.findElement(By.xpath("//div[@id='column-a']"));

        WebElement colB= driver.findElement(By.xpath("//div[@id='column-b']"));

Actions act=new Actions (driver);

act.dragAndDrop(colA,colB).build().perform();

        //act.dragAndDropBy(colA,100,200).build().perform();

    }
}
