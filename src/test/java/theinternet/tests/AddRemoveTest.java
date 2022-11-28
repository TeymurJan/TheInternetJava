package theinternet.tests;
import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import theinternet.pages.AddRemovePage;
import java.util.Random;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AddRemoveTest extends BaseTest {
    AddRemovePage addRemovePage;

    @Before
    public void setup() {
        addRemovePage = new AddRemovePage(driver);
    }

    @Test
    public void checkAddButton() {
        addRemovePage.clickAdd();
        Assert.assertTrue(addRemovePage.removeIsVisible());
    }

    @Test
    public void checkRemoveButtons() {
        Random rand = new Random();
        int counter = rand.nextInt(30) + 1;
        for(int i = 0; i < counter; i++)
            addRemovePage.clickAdd();
        for(int i = 0; i < counter; i++)
            addRemovePage.clickRemove();
        Assert.assertFalse(addRemovePage.removeIsNotVisible());
    }
}
