package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddRemovePage extends BasePage {
    private WebDriver driver;

    private static String PAGE_URL = "https://the-internet.herokuapp.com/add_remove_elements/";

    private static By buttonAdd = By.xpath("//button[not(@class='added-manually')]");
    private static By buttonsDelete = By.cssSelector(".added-manually");

    public AddRemovePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickAdd() {
        clickOn(buttonAdd);
    }

    public void clickRemove() {
            clickOn(buttonsDelete);
    }

    public boolean removeIsVisible() {
        return isVisible(buttonsDelete);
    }

    public boolean removeIsNotVisible() {
        return elementExists(buttonsDelete);
    }
}
