package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import theinternet.pages.CheckBoxesPage;

import java.util.concurrent.TimeUnit;

public class CheckBoxesTest {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasicConfigurator.configure();
    }

    @Test
    public void checkCheckBoxes() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        Assert.assertTrue(checkBoxesPage.isFirstChecked());
        Assert.assertFalse(checkBoxesPage.isSecondChecked());
    }

    @After
    public void close() { driver.quit(); }
}
