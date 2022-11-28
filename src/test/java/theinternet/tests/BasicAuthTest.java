package theinternet.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import theinternet.helper.Credits;

public class BasicAuthTest extends BaseTest {
    @Test
    public void TestAuth() {
        driver.get("http://" + Credits.ACCOUNT_NAME + ":" + Credits.ACCOUNT_PASS + "@the-internet.herokuapp.com/basic_auth");
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//p"))).getText();

        Assert.assertTrue(text.equals("Congratulations! You must have the proper credentials."));
    }
}
