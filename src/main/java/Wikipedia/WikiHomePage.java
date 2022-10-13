package Wikipedia;

import DriverConfig.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage extends BaseClass {
    @FindBy(xpath = "//li[@id = 'ca-view']")
    WebElement menutab;

    @FindBy(id = "ca-viewsource")
    WebElement menutab1;

    @FindBy(id = "ca-history")
    WebElement menutab2;

    @FindBy(xpath = "//li[contains(@class, 'selected')and contains(@class, 'mw-list-item')]")
    WebElement menutab3;

    @FindBy(xpath = "//li[@id='ca-talk']")
    WebElement menutab4;

    @FindBy(id = "searchButton")
    WebElement searchButton;

    @FindBy(id = "pt-login")
    WebElement login;

    @FindBy(id = "pt-createaccount")
    WebElement headtab3;

    public WikiHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getTextTab() {
        return menutab.getText();
    }

    public String getTextTab1() {
        return menutab1.getText();
    }

    public String getTextTab2() {
        return menutab2.getText();
    }

    public String getTextTab3() {
        return menutab3.getText();
    }

    public String getTextTab4() {
        return menutab4.getText();
    }
    public String getTextHeadTab3() {
        return headtab3.getText();
    }
    public String getTextLogin() {
        return login.getText();
    }
}
