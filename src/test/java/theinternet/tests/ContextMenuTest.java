package theinternet.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import theinternet.pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest{
    @Test
    public void checkJSAlert() {
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.clickHotSpot();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertTrue(alert.getText().equals("You selected a context menu"));

    }
}
