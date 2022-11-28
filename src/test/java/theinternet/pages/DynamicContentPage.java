package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicContentPage extends BasePage {
    private static String PAGE_URL = "https://the-internet.herokuapp.com/dynamic_content";

    private static By firstComment = By.xpath("(//div[@class=\"large-10 columns\"])[1]");
    private static By secondComment = By.xpath("(//div[@class=\"large-10 columns\"])[2]");
    private static By thirdComment = By.xpath("(//div[@class=\"large-10 columns\"])[3]");

    public DynamicContentPage(WebDriver driver) {
        super(driver);
        driver.get(PAGE_URL);
    }

    public String getFirstCommentText() {
        return getElementText(firstComment);
    }

    public String getSecondCommentText() {
        return getElementText(secondComment);
    }

    public String getThirdCommentText() {
        return getElementText(thirdComment);
    }
}
