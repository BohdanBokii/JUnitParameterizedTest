package Wikipedia;

import DriverConfig.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class TestWiki extends BaseClass {
    WikiHomePage wikiHomePage;
    ResourceBundle bundle;
    Language lang;

    @Parameterized.Parameters
    public static Collection option() {
        return Arrays.asList(Language.values());
    }

    public TestWiki(Language lang) {
        this.lang = lang;
        bundle = ResourceBundle.getBundle(lang.getCode());
        driver.get("http://" + lang.getCode() + ".wikipedia.org/");
    }

    @Before
    public void beforeTestsMethod() {
        if (wikiHomePage == null) {
            wikiHomePage = new WikiHomePage(driver);
        }
    }

    @After
    public void afterTestsMethod() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    public void testTab() {
        Assert.assertEquals(wikiHomePage.getTextTab(), bundle.getString("menutab"));
    }

    @Test
    public void testTab1() {
        Assert.assertEquals(wikiHomePage.getTextTab1(), bundle.getString("menutab1"));
    }

    @Test
    public void testTab2() {
        Assert.assertEquals(wikiHomePage.getTextTab2(), bundle.getString("menutab2"));
    }

    @Test
    public void testTab3() {
        Assert.assertEquals(wikiHomePage.getTextTab3(), bundle.getString("menutab3"));
    }

    @Test
    public void testTab4() {
        Assert.assertEquals(wikiHomePage.getTextTab4(), bundle.getString("menutab4"));
    }

    @Test
    public void existElements() {
        Assert.assertTrue((wikiHomePage.searchButton).isDisplayed());
        System.out.println("Search button is displayed");
        Assert.assertTrue((wikiHomePage.login).isDisplayed());
        System.out.println("Login tab is displayed");
    }
    @Test
    public void testHeadTab3() {
        Assert.assertEquals(wikiHomePage.getTextHeadTab3(), bundle.getString("headtab3"));
    }
    @Test
    public void testLogin() {
        Assert.assertEquals(wikiHomePage.getTextLogin(), bundle.getString("login"));
    }
}
