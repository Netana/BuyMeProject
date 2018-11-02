import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import javafx.animation.Animation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class main{
    private static WebDriver driver;

        // create the report object, path and name
        private static ExtentReports extent= new ExtentReports();
        private static ExtentTest test;
        @BeforeClass
        public static void beforeClass() throws Exception {
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C://Users//extent.html");
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Environment","Production");
// log information into the report
            test =extent.createTest("MyFirstTest", "Sample description");
            test.log(Status.INFO, "Connecting driver");

    String browser_Type = XML.getData("BrowserType");
    String browser_Url = XML.getData("BrowserUrl");

    if (browser_Type.equals("Chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neta Naor\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    } else if (browser_Type.equals("FireFox")) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\FirefoxDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.get(browser_Url);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@Test
    public void test01_LogInPage() {

    test.log(Status.INFO, "Connecting driver");

    LogInPage.PressLogin(driver);
    LogInPage.RegisterToBuyMe(driver);
    LogInPage.MyName(driver);
    LogInPage.MyMail(driver);
    LogInPage.MyPassword(driver);
    LogInPage.FillVerify(driver);
    LogInPage.ClickAgreeToSign(driver);
    LogInPage.RegistrationToBuyMe(driver);
}

@Test

    public void test02_ChooseGift(){

    test.log(Status.INFO, "Connecting driver");

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        ChooseGift.ChooseAmount(driver);
        ChooseGift.YourAmount(driver);
        ChooseGift.ChooseArea(driver);
        ChooseGift.YourArea(driver);
        ChooseGift.ChooseCatagory(driver);
        ChooseGift.YourCatagory(driver);
        ChooseGift.Gift(driver);
}

@Test
    public void test03_SelectGift(){

    test.log(Status.INFO, "Connecting driver");

        SelectGift.ChooseGiftCard(driver);
        SelectGift.ToWhomButton(driver);
        SelectGift.Name(driver);
        SelectGift.BuyerName(driver);
        SelectGift.SelectEvent(driver);
        SelectGift.SelectTheEvent(driver);
        SelectGift.Blessings(driver);
        SelectGift.Picture(driver);
        SelectGift.ChooseWhenToPay(driver);
        SelectGift.SendEmail(driver);
        SelectGift.FriendsEmail(driver);
        SelectGift.SubmitEmail(driver);
        SelectGift.PayButton(driver);

}


    @AfterClass
    public static void afterClass() {
// end test and save data into report file
        extent.flush();
    }
}

