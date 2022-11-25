package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Select selector;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void clickOn(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }
    protected void rightClickOn(By element) {
        Actions actions = new Actions(driver);
        actions.contextClick(wait.until(ExpectedConditions.visibilityOfElementLocated(element))).perform();
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

    protected boolean isChecked(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isSelected();
    }

    protected void selectOptionByName(By element, String opt) {
        selector = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(element)));
        selector.selectByVisibleText(opt);
    }

    protected String getTextFromDropdown(By element) {
        selector = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(element)));
        return selector.getFirstSelectedOption().getText();
    }

//    protected void dragAndDrop(By fromEl, By toEl) {
//        Actions actions = new Actions(driver);
////        actions.clickAndHold(wait.until(ExpectedConditions.visibilityOfElementLocated(fromEl)))
////                .moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(toEl)))
////                .release(wait.until(ExpectedConditions.visibilityOfElementLocated(toEl))).build().perform();
//        actions.clickAndHold(driver.findElement(fromEl)).moveToElement(driver.findElement(toEl)).release(driver.findElement(toEl)).release().build();
//    }
//Doesn't work, tried both dragAndDrop and clickAndHold functions
}
