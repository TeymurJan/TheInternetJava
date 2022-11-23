package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void clickOn(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

    protected void sendKeys(By element, String str) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(str);
    }

    protected String getElementText(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).getText();
    }

    protected boolean isVisible(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed();
    }

    protected int getElementsNum(By elements) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elements)).size();
    }

    protected boolean elementExists(By element) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean exists = driver.findElements(element).size() != 0;
        return exists;
    }

    protected WebElement getElement(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
