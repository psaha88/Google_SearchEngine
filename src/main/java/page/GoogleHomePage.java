package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    WebDriver driver;

    public GoogleHomePage (WebDriver dr) {
        driver=dr;
        PageFactory.initElements(driver, this);

    }

    @FindBy (id="APjFqb")
    WebElement searchBar;

    @FindBy (name="btnK")
    WebElement searchButton;

    @FindBy (className = "YmvwI")
    WebElement allTab;

    public void enterProduct (String product_key) {
        searchBar.sendKeys(product_key);
    }

    public void clickOnSearchButton () {
        searchButton.click();

    }

    public boolean validateAllTab() {
        return allTab.isDisplayed();
    }
}
