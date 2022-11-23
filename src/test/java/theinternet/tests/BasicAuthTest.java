package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import theinternet.helper.Credits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasicAuthTest {
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
    public void TestAuth() {
        driver.get("http://" + Credits.ACCOUNT_NAME + ":" + Credits.ACCOUNT_PASS + "@the-internet.herokuapp.com/basic_auth");
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//p"))).getText();

        Assert.assertTrue(text.equals("Congratulations! You must have the proper credentials."));
    }

    @After
    public void close() {
        driver.quit();
    }
}
