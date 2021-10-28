import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solutions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Yelena\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        System.setProperty("webdriver.firefox.driver","C:\\Users\\Yelena\\Downloads\\selenium_ide-3.17.0-fx" );
        driver2 = new FireFoxDriver();
    }
}
