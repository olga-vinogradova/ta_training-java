import com.epam.training.student_Olga_Vinogradova.fundamentals2.PastebinPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PastebinPageTest {
    private WebDriver driver;
    private final String PASTEBIN_URL = "https://pastebin.com/";

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void createNewPasteOnPastebin() {
        driver.get(PASTEBIN_URL);

        PastebinPage pastebinPage = new PastebinPage(driver);

        pastebinPage.setText("Hello from WebDriver");
        pastebinPage.selectExpiration();
        pastebinPage.setPasteName("helloweb");
        pastebinPage.createNewPaste();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}