package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlkTestMethodu {


    WebDriver driver;
    @Test
    public void test1(){
        System.out.println("test1 methodu calisti");

        //amazon.com
    driver.get("https://www.amazon.com");
    String amazonTitle
            = driver.getTitle();
    String beklenenTitle="amazon";
   if(amazonTitle.contains(beklenenTitle)) System.out.println("Amazon title icerir tes PASS");
    else System.out.println("Amazon title icermez FAILED") ;
        //Assert.assertTrue(amazonTitle.contains(beklenenTitle));
    }
    @Test
    public void test2(){
        System.out.println("test2 methodu calisti");
        //google git basligin google icerdigini test et



    }


    @Before
    public void setup() {

        System.out.println("before calisti");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }


    @After
    public void ortaligiTopla() {
        System.out.println("ortaligi toparlayici calisti");
    }
}
