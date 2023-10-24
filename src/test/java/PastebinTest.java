import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PastebinTest {
    WebDriver driver;
    private final String PASTEBIN_URL = "https://pastebin.com/";

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void createNewPasteOnPastebin() {
        driver.get(PASTEBIN_URL);

        WebElement textArea = driver.findElement(By.id("postform-text"));
        textArea.sendKeys("Hello from WebDriver");


        WebElement dropDownElement = driver.findElement(By.id("select2-postform-expiration-container"));
        dropDownElement.click();

        WebElement tenMinutesOption = driver.findElement(By.xpath("//li[normalize-space()='10 Minutes']"));
        tenMinutesOption.click();

        WebElement pasteName = driver.findElement(By.id("postform-name"));
        pasteName.sendKeys("helloweb");

        WebElement createButton = driver.findElement(By.xpath("//button[@class='btn -big']"));
        createButton.click();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
