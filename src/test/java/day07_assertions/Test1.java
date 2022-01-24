package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().browserVersionDetectionCommand("/path/to/brave --version").setup();
        //driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test1() {
        System.out.println("brave acildi");


    }
}
