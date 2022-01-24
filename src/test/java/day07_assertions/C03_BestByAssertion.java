package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BestByAssertion {
    //1)
    //Bir class oluşturun: BestBuy Assertions
    //2)
    //https://www.bestbuy.com/ A dresine gidin farkli test method’lari olusturarak asagidaki
    //testleri yapin
    //○Sayfa URL’inin https://www.bestbuy.com/ com/‘a esit oldugunu test edin
    //○titleTest => Sayfa başlığının “ R est” içer me diğini(contains) test edin
    //○logoTest => BestBuy logosunun görüntülen digini test edin
    //○Francais LinkTest => Fransizca Linkin görüntüle n diğini test edin


    WebDriver driver;

    @Before
    public void  setup() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test(){
        driver.get("https://www.bestbuy.com");

        String aslindaOlanTitle= driver.getTitle();
        String beklenenTitle= "https://www.bestbuy1.com/";
        Assert.assertEquals("test degerleri gozden gecir ",beklenenTitle, aslindaOlanTitle);
        Assert.assertFalse(aslindaOlanTitle.contains(beklenenTitle
        ));
    }
    @After
    public void teardown() {
        driver.quit();
    }

}
