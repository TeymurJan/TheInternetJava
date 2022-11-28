package theinternet.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import theinternet.pages.ChallengingDomPage;

public class ChallengingDomTest extends BaseTest{
    @Test
    public void checkButtonsPresence() {
        ChallengingDomPage challengingDomPage = new ChallengingDomPage(driver);
        Assert.assertTrue(challengingDomPage.checkElementPresence());
    }
}
