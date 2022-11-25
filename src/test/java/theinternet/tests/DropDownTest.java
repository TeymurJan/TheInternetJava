package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import theinternet.pages.DropDownPage;

import java.util.concurrent.TimeUnit;

public class DropDownTest {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasicConfigurator.configure();
    }

    @Test
    public void checkDropDown() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        Assert.assertTrue(dropDownPage.getDropDownText().equals("Please select an option"));

        dropDownPage.selectOption("Option 1");
        Assert.assertTrue(dropDownPage.getDropDownText().equals("Option 1"));

        dropDownPage.selectOption("Option 2");
        Assert.assertTrue(dropDownPage.getDropDownText().equals("Option 2"));
    }

    @After
    public void close() {
        driver.quit();
    }
}
