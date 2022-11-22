package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import theinternet.pages.ABTestPage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ABTest_Test {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasicConfigurator.configure();
    }

    @Test
    public void checkHeaderAndPghText() {
        ABTestPage abTestPage = new ABTestPage(driver);
        Assert.assertTrue(abTestPage.getABTestText().equals("Also known as split testing. " +
                "This is a way in which businesses are able to simultaneously test and learn different " +
                "versions of a page to see which text and/or functionality works best towards a desired " +
                "outcome (e.g. a user action such as a click-through)."));
        Assert.assertTrue(abTestPage.getHeaderABTestText().equals("A/B Test Control") ||
                abTestPage.getHeaderABTestText().equals("A/B Test Variation 1"));

    }

    @After
    public void close() {
        driver.quit();
    }
}
