package theinternet.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import theinternet.pages.BrokenImagesPage;

public class BrokenImagesTest extends BaseTest{
    @Test
    public void checkFor2BrokenImages() {
        BrokenImagesPage brokenImagesPage = new BrokenImagesPage(driver);

        String firstImageSrc = brokenImagesPage.getFirstImageAddress();
        String secondImageSrc = brokenImagesPage.getSecondImageAddress();

        driver.get(firstImageSrc);
        Assert.assertTrue(driver.findElement(By.xpath("//body//h1")).getText().equals("Not Found"));

        driver.get(secondImageSrc);
        Assert.assertTrue(driver.findElement(By.xpath("//body//h1")).getText().equals("Not Found"));
    }
}
