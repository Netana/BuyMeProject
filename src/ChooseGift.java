//Select Amount and Region

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.xml.bind.Element;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChooseGift {

    private static WebElement SelectAmount = null;
    public static WebElement ChooseAmount(WebDriver driver) {
        SelectAmount = driver.findElement(Constants.AmountBox);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        SelectAmount.click();
        return SelectAmount;
    }

    private static WebElement Amount = null;
    public static WebElement YourAmount(WebDriver driver) {
        List<WebElement> AmountList= driver.findElements(Constants.ChooseAmonut);
        AmountList.get(2).click();
        return Amount;
    }
    private static WebElement SelectArea = null;
    public static WebElement ChooseArea(WebDriver driver) {
        SelectArea = driver.findElement(Constants.AreaBox);
        SelectArea.click();
        return SelectArea;
    }
    private static WebElement Area = null;
    public static WebElement YourArea(WebDriver driver) {
        List<WebElement> AreaList= driver.findElements(Constants.ChooseArea);
        AreaList.get(1).click();
        return Area;
    }
    private static WebElement SelectCatagory = null;
    public static WebElement ChooseCatagory (WebDriver driver) {
        SelectCatagory = driver.findElement(Constants.CatagoryBox);
        SelectCatagory.click();
        return SelectCatagory;
    }
    private static WebElement Catagory = null;
    public static WebElement YourCatagory (WebDriver driver) {
        List<WebElement> CatagoryList= driver.findElements(Constants.ChooseCatagory);
        CatagoryList.get(3).click();
        return Catagory;
    }
    private static WebElement FindGift = null;
    public static WebElement Gift (WebDriver driver) {
        FindGift = driver.findElement(Constants.FindGiftButton);
        FindGift.click();
        return FindGift;
    }
}
