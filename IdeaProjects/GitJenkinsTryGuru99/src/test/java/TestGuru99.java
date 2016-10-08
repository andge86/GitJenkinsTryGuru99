import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by localadmin on 08.10.2016.
 */
public class TestGuru99 {
    WebDriver driver;

    @BeforeTest
public void setupBrowser()
{
    System.setProperty("webdriver.chrome.driver", "C://Users//localadmin//Downloads//chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
@Test
public void testHeader() throws InterruptedException {
    driver.get("http://www.guru99.com/");
    Thread.sleep(1000);

    String actualTitle = driver.getTitle();
    if (actualTitle.contains("Guru")) {
        System.out.println(actualTitle);
    } else {
        System.out.println("Not shown " + actualTitle);
    }
}
    @AfterTest
    public void closePage() {
        driver.close();
    }
}
