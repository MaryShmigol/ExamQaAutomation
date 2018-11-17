package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends GoogleBasePage{

    @FindBy(xpath = "//input[@name = 'q']")
    private WebElement inputSearchField;

    @FindBy(xpath = "//img[@id='hplogo']")
    private WebElement rootSection;



    public GoogleHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public boolean isPageLoaded() {
        return rootSection.isDisplayed();
    }

    public GoogleSearchResultsFirstPage search(String searchTerm){
        inputSearchField.sendKeys(searchTerm);
        inputSearchField.sendKeys(Keys.ENTER);
        return new GoogleSearchResultsFirstPage(webDriver);
    }





}
