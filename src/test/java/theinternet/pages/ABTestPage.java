package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ABTestPage extends BasePage {
    private WebDriver driver;

    private static String PAGE_URL = "https://the-internet.herokuapp.com/abtest";

    private static By headerABTest = By.xpath("//div//h3");
    private static By textABTest = By.xpath("//div//p");

    public ABTestPage(WebDriver driver) {
        super(driver);
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public String getHeaderABTestText() {
        return getElementText(headerABTest);
    }

    public String getABTestText() {
        return getElementText(textABTest);
    }

}
