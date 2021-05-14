import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyHomework {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By MAIN_ARTICLE_BTN = By.xpath(".//span[@class = 'list-article__headline']");
    private final By COMMENTS_BTN = By.cssSelector("[class='article-share__item article-share__item--comments article-share__item-with-count']");




//    @Test
//    public void myTest() {
//        //WebDriver = browser window
//        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
//        WebDriver browserWindow = new ChromeDriver();
//        browserWindow.get("http://tvnet.lv");
//
//        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));
//
//        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(MAIN_ARTICLE_BTN));
//        browserWindow.findElement(MAIN_ARTICLE_BTN).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(COMMENTS_BTN));
//        browserWindow.findElement(COMMENTS_BTN).click();
//
//
//    }

    @Test
    public void myTest2() {
        //WebDriver = browser window
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MAIN_ARTICLE_BTN));
        System.out.println(browserWindow.findElement(MAIN_ARTICLE_BTN).getText());


    }
}
