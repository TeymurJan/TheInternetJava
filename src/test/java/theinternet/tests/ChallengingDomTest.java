package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import theinternet.pages.ChallengingDomPage;

import java.util.concurrent.TimeUnit;

public class ChallengingDomTest {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasicConfigurator.configure();
    }

    @Test
    public void checkButtonsPresence() {
        ChallengingDomPage challengingDomPage = new ChallengingDomPage(driver);
        Assert.assertTrue(challengingDomPage.checkElementPresence());
    }

    @After
    public void close() { driver.quit(); }
}
