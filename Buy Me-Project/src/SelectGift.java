//choose the gift

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectGift {

    private static WebElement GiftCard = null;

    public static WebElement ChooseGiftCard(WebDriver driver) {
        GiftCard = driver.findElement(Constants.SelectGiftCard);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        GiftCard.click();
        return GiftCard;

        //choose kind of giftcard
    }

    private static WebElement SelectToWhom = null;

    public static WebElement ToWhomButton(WebDriver driver) {
        SelectToWhom = driver.findElement(Constants.Towhom);
        SelectToWhom.click();
        return SelectToWhom;

        //select to whom the gift intended
    }

    private static WebElement NameOfYourFriend = null;

    public static WebElement Name(WebDriver driver) {
        NameOfYourFriend = driver.findElement(Constants.FriendsName);
        NameOfYourFriend.sendKeys("Nofar");
        return NameOfYourFriend;
    }

    private static WebElement FromWhoTheGift = null;

    public static WebElement BuyerName(WebDriver driver) {
        FromWhoTheGift = driver.findElement(Constants.FromWho);
        FromWhoTheGift.sendKeys("Neta");
        return FromWhoTheGift;

        //from how the gift is
    }

    private static WebElement WhatTheEvent = null;

    public static WebElement SelectEvent(WebDriver driver) {
        WhatTheEvent = driver.findElement(Constants.ChooseEventBox);
        WhatTheEvent.click();
        return WhatTheEvent;

//        select event-thankyou
    }

    private static WebElement ChooseTheEvent = null;
    public static WebElement SelectTheEvent(WebDriver driver) {
        List<WebElement> EventList = driver.findElements(Constants.ChooseEvent);
        EventList.get(2).click();
        return ChooseTheEvent;
    }

    private static WebElement SelectBlessing = null;
    public static WebElement Blessings(WebDriver driver) {
        SelectBlessing = driver.findElement(Constants.ChooseBlessings);
        SelectBlessing.click();
        return SelectBlessing;

//        choosing the blessing
    }

    private static WebElement SelectPicture = null;
    public static void Picture(WebDriver driver) {
        driver.findElement(Constants.UploadPic).sendKeys("C:\\Users\\Neta Naor\\Desktop\\New folder");
//uploading a picture from the path in the computer
    }

    private static WebElement WhenToPay= null;
    public  static WebElement ChooseWhenToPay (WebDriver driver){
        WhenToPay=driver.findElement(Constants.Payment);
        WhenToPay.click();
        return WhenToPay;

//        to to pay
    }

    private static WebElement Email= null;
    public  static WebElement SendEmail (WebDriver driver){
        Email=driver.findElement(Constants.VIAEmail);
        Email.click();
        return Email;
    }

    private static WebElement EmailAdress= null;
    public  static WebElement FriendsEmail (WebDriver driver){
        EmailAdress=driver.findElement(Constants.EmailAddress);
        EmailAdress.sendKeys("Nof@gmail.com");
        return EmailAdress;

//        sending the gift by email to the friend
    }

    private static WebElement SaveEmail= null;
    public  static WebElement SubmitEmail (WebDriver driver){
        SaveEmail=driver.findElement(Constants.Save);
        SaveEmail.click();
        return SaveEmail;
    }
    private static WebElement ToPAY= null;
    public  static WebElement PayButton (WebDriver driver) {
        ToPAY = driver.findElement(Constants.CheckOut);
        ToPAY.click();
        return ToPAY;

    }
}