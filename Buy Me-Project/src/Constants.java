// all the constants for the project

import org.openqa.selenium.By;

public class Constants {

        public static final By LogInLocator = (By.className("seperator-link"));
        public static final By DidNotRegister =(By.xpath("//*[@id=\"auth-modal\"]/div/span/strong"));
        public static final By FirstName =(By.id("ember890"));
        public static final By Email =(By.id("ember891"));
        public static final By Password =(By.id("valPass"));
        public static final By ValidationPasssword =(By.id("ember893"));
        public static final By RegisterConsent =(By.xpath("//*[@id=\"ember889\"]/div[5]/div/label"));
        public static final By SubmitRegister =(By.xpath("//*[@id=\"ember889\"]/button"));
        public static final By AmountBox = (By.xpath("//span[.='סכום']"));
        public static final By ChooseAmonut = (By.className("active-result"));
        public static final By AreaBox =(By.xpath("//*[@id=\"ember620_chosen\"]/a/span"));
        public static final By ChooseArea = (By.className("active-result"));
        public static final By CatagoryBox =(By.xpath("//*[@id=\"ember629_chosen\"]/a/span"));
        public static final By ChooseCatagory =(By.className("active-result"));
        public static final By FindGiftButton =(By.id("ember664"));
        public static final By SelectGiftCard =(By.xpath("//div[.='ארוחת בוקר זוגית ברוסטיקו בזל']"));
        public static final By Towhom =(By.xpath("//span[@class='circle']"));
        public static final By FriendsName =(By.xpath("//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']"));
        public static final By FromWho = (By.xpath("//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']"));
        public static final By ChooseEventBox =(By.xpath("//span[.='לאיזה אירוע?']")) ;
        public static final By ChooseEvent = (By.className("active-result"));
        public static final By ChooseBlessings = (By.xpath("//textarea[@placeholder='מזל טוב, תודה רבה או פשוט מלא אהבה? כאן כותבים מילים טובות ואיחולים שמחים, עד 100 תווים']"));
        public static final By UploadPic = (By.name("fileUpload"));
        public static final By Payment =(By.xpath("//label[.='מיד אחרי התשלום']")) ;
        public static final By VIAEmail =(By.xpath("//span[.='במייל']"));
        public static final By EmailAddress =(By.xpath("//input[@type='email']"));
        public static final By Save =(By.xpath("//button[.='שמירה']"));
        public static final By CheckOut =(By.xpath("//button[@data-toggle='modal']"));

    }
