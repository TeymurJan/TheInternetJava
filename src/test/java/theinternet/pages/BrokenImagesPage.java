package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesPage extends BasePage {
    private static String PAGE_URL = "https://the-internet.herokuapp.com/broken_images";

    private static By firstImage = By.cssSelector("img[src=\"asdf.jpg\"]");
    private static By secondImage = By.cssSelector("img[src=\"hjkl.jpg\"]");

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
        driver.get(PAGE_URL);
    }

    public String getFirstImageAddress() {
        return getElement(firstImage).getAttribute("src");
    }

    public String getSecondImageAddress() {
        return getElement(secondImage).getAttribute("src");
    }
}
