package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage extends BasePage {
    private static String PAGE_URL = "https://the-internet.herokuapp.com/dropdown";

    private static By dropdownMenu = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
        driver.get(PAGE_URL);
    }

    public void selectOption(String opt) {
        selectOptionByName(dropdownMenu, opt);
    }

    public String getDropDownText() {
        return getTextFromDropdown(dropdownMenu);
    }

}
