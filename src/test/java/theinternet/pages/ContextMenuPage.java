package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage extends BasePage {
    private static String PAGE_URL = "https://the-internet.herokuapp.com/context_menu";

    private static By divContextMenu = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
        driver.get(PAGE_URL);
    }

    public void clickHotSpot() {
        rightClickOn(divContextMenu);
    }
}
