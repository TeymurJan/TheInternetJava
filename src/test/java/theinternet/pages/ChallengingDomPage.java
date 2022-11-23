package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengingDomPage extends BasePage {
    WebDriver driver;

    private static String PAGE_URL = "https://the-internet.herokuapp.com/challenging_dom";

    private static By buttonBlue = By.cssSelector("a.button:first-child");
    private static By buttonRed = By.cssSelector("a.button.alert");
    private static By buttonGreen = By.cssSelector("a.button.success");

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get(PAGE_URL);
    }

    public boolean checkElementPresence() {
        List<By> elements = new ArrayList<By>(Arrays.asList(buttonBlue, buttonRed, buttonGreen));
        int counter = 0;
        for (By el: elements)
            if(isVisible(el))
                counter++;
        if(counter == elements.size())
            return true;
        return false;
    }


}
