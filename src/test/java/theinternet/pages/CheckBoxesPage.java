package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage extends BasePage {
    WebDriver driver;

    private static String PAGE_URL = "https://the-internet.herokuapp.com/checkboxes";

    private static By checkBoxFirst = By.cssSelector("input[type=\"checkbox\"]:checked");
    private static By checkboxSecond = By.cssSelector("input[type=\"checkbox\"]:not(:checked)");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get(PAGE_URL);
    }

    public boolean isFirstChecked() {
        return isChecked(checkBoxFirst);
    }

    public boolean isSecondChecked() {
        return isChecked(checkboxSecond);
    }

}
