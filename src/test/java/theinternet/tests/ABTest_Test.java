package theinternet.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import theinternet.pages.ABTestPage;

public class ABTest_Test extends BaseTest{
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
}
