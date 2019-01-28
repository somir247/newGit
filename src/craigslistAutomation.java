import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class craigslistAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://newyork.craigslist.org/");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.className("ata")).click();
        driver.findElement(By.id("query")).sendKeys("Rocking Chair");
        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[2]/div/ul/li[2]/a")).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)", "");

        String actualPageTitle = "craigslist: new york city jobs, apartments, for sale, services, community, and events";
        if (actualPageTitle.equals(pageTitle)) {
            System.out.println("The page titles are the same");
        } else {
            System.out.println("The Page titles are not the same");
        }
        driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[3]/a/div[1]/div/div[1]/img")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        Assert.assertEquals(actualPageTitle,pageTitle);
        driver.close();
        lkjlkjdgkljd
    }
}




