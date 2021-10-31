import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Solutions {
    private static WebDriver driver;
    private static WebDriver driver2;
    public static void main(String[] args) {

        //#1
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Yelena\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //#2
        driver.get("https://translate.google.com/");
        System.out.println(driver.findElement(By.className("er8xn")));
        System.out.println(driver.findElement(By.tagName("textarea")));
        //#6
        driver.findElement(By.className("er8xn")).sendKeys("אבא");

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Yelena\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
        driver2= new FirefoxDriver();

        //#3
        driver2.get("https://www.youtube.com/");
        System.out.println(driver2.findElement(By.id("search-icon-legacy")));
        //#7
        driver.get("https://www.youtube.com/");
        driver.findElement(By.id("search")).sendKeys("Once in a million");
        driver.findElement(By.id("search-icon-legacy")).click();

        //#4
        driver2.get("https://www.seleniumhq.org/");
        WebElement fxElement = driver2.findElement(By.name("search"));
        System.out.println(fxElement);
        fxElement.sendKeys("selenium");

        //#5
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchElement.sendKeys("Leather shoes");
        searchElement.click();

        //#8
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("email@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        driver.findElement(By.linkText("Log In")).click();

        driver.quit();
        driver2.quit();
    }
}
