import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solutions {
    public static void main(String[] args) {

        //#1
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Yelena\\Downloads\\chromedriver_win32");
        driver = new ChromeDriver();

        //#2
        driver.get("https://translate.google.com/");
        System.out.println(driver.findElement(By.className("er8xn")).sendKeys("אבא"));
        System.out.println(driver.findElement(By.cssSelector(<textarea>[aria-label=<"Source text">])));

        System.setProperty("webdriver.firefox.driver","C:\\Users\\Yelena\\Downloads\\selenium_ide-3.17.0-fx" );
        driver2 = new FireFoxDriver();

        //#3
        driver2.get("https://www.youtube.com/");
        System.out.println(driver2.findElement(By.id("search-icon-legacy")));

        //#4
        driver2.get("https://www.seleniumhq.org/");
        WebElement fxElement = driver2.findElement(By.name("search"));
        System.out.println(fxElement);
        fxElement.sendKeys("selenium");
    }
}
