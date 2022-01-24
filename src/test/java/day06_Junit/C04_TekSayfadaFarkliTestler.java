package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TekSayfadaFarkliTestler {
    WebDriver driver;


    @Test
    public void test1() {



    }

    @Test
    public void test2() {



    }

    @Test
    public void test3() {



    }

    @BeforeClass
    public void setup() {

        System.out.println("before calisti");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }

    @AfterClass
    public void ortaligiTopla() {
        System.out.println("ortaligi toparlayici calisti");
    }
}
