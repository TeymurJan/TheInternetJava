package theinternet.tests;

import org.junit.Assert;
import org.junit.Test;
import theinternet.pages.DynamicContentPage;

public class DynamicContentTest extends BaseTest {
    @Test
    public void checkDynamicContent() {
        DynamicContentPage dynamicContentPage = new DynamicContentPage(driver);
        String firstCom, secondCom, thirdCom;

        //Get info from first page load
        firstCom = dynamicContentPage.getFirstCommentText();
        secondCom = dynamicContentPage.getSecondCommentText();
        thirdCom = dynamicContentPage.getThirdCommentText();

        driver.navigate().refresh();

        Assert.assertFalse(dynamicContentPage.getFirstCommentText().equals(firstCom));
        Assert.assertFalse(dynamicContentPage.getSecondCommentText().equals(secondCom));
        Assert.assertFalse(dynamicContentPage.getThirdCommentText().equals(thirdCom));

    }
}
