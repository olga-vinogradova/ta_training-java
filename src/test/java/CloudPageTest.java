import com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage.CloudMainPage;
import com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage.CloudPricingPage;
import com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage.SearchResultPage;
import com.epam.training.student_Olga_Vinogradova.fundamentals2.emailGeneratorPage.EmailGeneratorPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CloudPageTest {
    private WebDriver driver;
    private final String cloudPageUrl = "https://cloud.google.com/";
    private final String emailGeneratorURL = "https://internxt.com/temporary-email";
    private final String searchText = "Google Cloud Platform Pricing Calculator";

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchGoogleCloudPricingCalculator() throws Exception{
        driver.get(cloudPageUrl);

        CloudMainPage cloudMainPage = new CloudMainPage(driver, searchText);
        cloudMainPage.searchRequest();

        SearchResultPage searchResultPage = new SearchResultPage(driver, "Google Cloud Pricing Calculator");
        searchResultPage.clickGoogleCloudPricingCalculator();


        CloudPricingPage pricingPage = new CloudPricingPage(driver);
        pricingPage.fillOutNumberOfInstances();
        pricingPage.fillOutSeries();
        pricingPage.fillOutMachine();
        pricingPage.fillLocation();
        pricingPage.fillCommittedUsage();
        pricingPage.fillSSD();
        pricingPage.enableGPU();
        //pricingPage.fillOutGPU();
        pricingPage.clickAddToEstimate();
        pricingPage.clickEmailEstimateButton();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(emailGeneratorURL);

        EmailGeneratorPage emailGeneratorPage = new EmailGeneratorPage(driver);
        emailGeneratorPage.clickCopyEmailButton();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        pricingPage.inputEmail();
        pricingPage.sendEmail();

        driver.switchTo().window(tabs.get(1));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        emailGeneratorPage.openReceivedEmail();
        String priceInEmail = emailGeneratorPage.findPriceInEmail();


       driver.switchTo().window(tabs.get(0));
       String priceOnCloudWebPage = pricingPage.findPriceOnCloudPage();
       Assert.assertTrue(priceOnCloudWebPage.contains(priceInEmail));
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
