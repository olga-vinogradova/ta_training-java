import com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage.CloudMainPage;
import com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage.CloudPricingPage;
import com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CloudPageTest {
    private WebDriver driver;
    private final String cloudPageUrl = "https://cloud.google.com/";
    private final String searchText = "Google Cloud Platform Pricing Calculator";

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchGoogleCloudPricingCalculator() throws Exception {
        driver.get(cloudPageUrl);

        CloudMainPage cloudMainPage = new CloudMainPage(driver, searchText);
        cloudMainPage.searchRequest();

        SearchResultPage searchResultPage = new SearchResultPage(driver, "Google Cloud Pricing Calculator");
        searchResultPage.clickGoogleCloudPricingCalculator();


        CloudPricingPage pricingPage = new CloudPricingPage(driver);
        pricingPage.fillOutNumberOfInstances();
        pricingPage.fillOutSeries();
        pricingPage.fillOutMachine();
        //pricingPage.fillOutGPU();
        //pricingPage.fillSSD();
        pricingPage.fillLocation();
        pricingPage.fillCommittedUsage();
        pricingPage.clickAddToEstimate();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
