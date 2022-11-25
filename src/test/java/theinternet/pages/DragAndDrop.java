//package theinternet.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import javax.print.DocFlavor;
//
//public class DropDownPage extends BasePage {
//    WebDriver driver;
//
//    private static String PAGE_URL = "https://the-internet.herokuapp.com/drag_and_drop";
//
//    private static By dropdownA = By.id("column-a");
//    private static By dropdownB = By.id("column-b");
//
//    public DropDownPage(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//        driver.get(PAGE_URL);
//    }
//
//    public void dragAndDropDivs() {
//        dragAndDrop(dropdownA, dropdownB);
//    }
//
//    public String getTextDropA() {
//        return getElementText(dropdownA);
//    }
//
//    public String getTextDropB() {
//        return getElementText(dropdownB);
//    }
//}
