
import com.epam.training.student_Olga_Vinogradova.fundamentals2.PastebinPageTask2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;

public class PastebinPageTask2Test {
    private WebDriver driver;
    private final String PASTEBIN_URL = "https://pastebin.com/";

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void createNewPasteOnPastebin() throws Exception {
        driver.get(PASTEBIN_URL);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qc-cmp2-ui")));
        try {
            WebElement agreeButton = driver.findElement(By.cssSelector(".qc-cmp2-footer button.css-47sehv"));
            agreeButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }


        PastebinPageTask2 pastebinPage = new PastebinPageTask2(driver);

        pastebinPage.setText("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1000)");

        pastebinPage.selectSyntaxHighlighting();
        pastebinPage.selectExpiration();
        pastebinPage.setPasteName("how to gain dominance among developers");
        pastebinPage.createNewPaste();


        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "how to gain dominance among developers" + " - Pastebin.com");

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("<a href=\"/archive/bash\" class=\"btn -small h_800\">Bash</a>"));
        Assert.assertTrue(pageSource.contains("<span class=\"es4\">$(git commit-tree HEAD^{tree} -m \"Legacy code\")</span>"));
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}