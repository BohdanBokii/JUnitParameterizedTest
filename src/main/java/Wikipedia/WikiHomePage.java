package Wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage {
    @FindBy(xpath = "//li[@id = 'ca-view']")
    WebElement menutab;

    @FindBy(id = "ca-viewsource")
    WebElement menutab2;

    @FindBy(id = "ca-history")
    WebElement menutab3;

    public WikiHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getTextTab() {
        return menutab.getText();
    }

    public String getTextTab1() {
        return menutab2.getText();
    }

    public String getTextTab2() {
        return menutab3.getText();
    }
}
