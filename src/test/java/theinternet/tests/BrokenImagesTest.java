package theinternet.tests;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import theinternet.pages.BrokenImagesPage;

import java.util.concurrent.TimeUnit;

public class BrokenImagesTest {
    WebDriver driver;
    BrokenImagesPage brokenImagesPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasicConfigurator.configure();

        brokenImagesPage = new BrokenImagesPage(driver);
    }

    @Test
    public void checkFor2BrokenImages() {
        String firstImageSrc = brokenImagesPage.getFirstImageAddress();
        String secondImageSrc = brokenImagesPage.getSecondImageAddress();

        driver.get(firstImageSrc);
        Assert.assertTrue(driver.findElement(By.xpath("//body//h1")).getText().equals("Not Found"));

        driver.get(secondImageSrc);
        Assert.assertTrue(driver.findElement(By.xpath("//body//h1")).getText().equals("Not Found"));
    }

    @After
    public void close() { driver.quit(); }
}
