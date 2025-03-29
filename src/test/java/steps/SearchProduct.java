package steps;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import page.GoogleHomePage;

import java.util.concurrent.TimeUnit;

import static com.google.gson.internal.bind.TypeAdapters.URL;

public class SearchProduct extends GoogleBase {

    WebDriver driver;


    @Given("i am on the google homepage")
    public void i_am_on_the_google_homepage() {

        launchBrowser ("https://www.google.com/");

    }

    @When("i enter the {string} in the search bar")
    public void i_enter_the_in_the_search_bar(String product_name) {

        GoogleHomePage Gh=new GoogleHomePage(driver);

       Gh.enterProduct(product_name);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {

        GoogleHomePage Gh=new GoogleHomePage(driver);
        Gh.clickOnSearchButton();


    }

    @Then("I can see the search result sucessfully")
    public void i_can_see_the_search_result_sucessfully() {

        GoogleHomePage Gh=new GoogleHomePage(driver);
        Assert.assertTrue(Gh.validateAllTab());

        closeAll();



    }

}
