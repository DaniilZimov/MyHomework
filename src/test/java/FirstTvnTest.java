import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstTvnTest {

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");

    @Test
    public void firstTest() {
        //WebDriver = browser window
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(browserWindow, 10 );
        WebDriverWait mail = new WebDriverWait(browserWindow,60, 2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN)) ;

//       WebElement acceptBtn = browserWindow.findElement(ACCEPT_COOKIES_BTN);
//       acceptBtn.click();

       browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
    }
}