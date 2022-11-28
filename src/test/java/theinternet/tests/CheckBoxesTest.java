package theinternet.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import theinternet.pages.CheckBoxesPage;

public class CheckBoxesTest extends BaseTest {
    @Test
    public void checkCheckBoxes() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        Assert.assertTrue(checkBoxesPage.isFirstChecked());
        Assert.assertFalse(checkBoxesPage.isSecondChecked());
    }
}
