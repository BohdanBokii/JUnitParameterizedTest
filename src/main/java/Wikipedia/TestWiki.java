package Wikipedia;

import DriverConfig.BaseClass;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
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
}
