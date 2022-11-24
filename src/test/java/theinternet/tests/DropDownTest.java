//package theinternet.tests;
//
//import org.apache.log4j.BasicConfigurator;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import theinternet.pages.DropDownPage;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class DropDownTest {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Before
//    public void setup() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        BasicConfigurator.configure();
//    }
//
//    @Test
//    public void checkDragAndDrop() {
//        DropDownPage dropDownPage = new DropDownPage(driver);
//        Assert.assertTrue(dropDownPage.getTextDropA().equals("A"));
//        Assert.assertTrue(dropDownPage.getTextDropB().equals("B"));
//
//        dropDownPage.dragAndDropDivs();
//        Assert.assertTrue(dropDownPage.getTextDropA().equals("B"));
//        Assert.assertTrue(dropDownPage.getTextDropB().equals("A"));
//    }
//
//    @After
//    public void close() { driver.quit(); }
//}


//Doesn't work, tried both dragAndDrop and clickAndHold functions