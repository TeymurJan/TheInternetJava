package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import theinternet.pages.ContextMenuPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ContextMenuTest {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BasicConfigurator.configure();
    }

    @Test
    public void checkJSAlert() {
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.clickHotSpot();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertTrue(alert.getText().equals("You selected a context menu"));

    }

    @After
    public void close() { driver.quit(); }
}
