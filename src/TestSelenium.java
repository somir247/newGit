
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class TestSelenium {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
       // WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.united.com/en/us");
        System.out.println(driver.getTitle());

        WebElement bookHotelTab = driver.findElement(By.id("bookHotelTab"));
        bookHotelTab.getAttribute("class");
        bookHotelTab.click();
        WebElement bookHotelInput = driver.findElement(By.id("bookHotelInput"));
        // bookHotelInput.click();
        bookHotelInput.sendKeys("Hilton Head Island, South Carolina, United States of America");
        driver.findElement(By.id("bookHotelCheckinDate")).sendKeys("Jan 30");
        driver.findElement(By.id("bookHotelCheckoutDate")).sendKeys("Feb 22");
       // driver.findElement(By.id("roomsDropDown"));


      WebElement roomDropDown = driver.findElement(By.name("roomsDropdown"));
        roomDropDown.sendKeys("4");


       // driver.findElement(By.id("roomsDropdown")).click();
        driver.findElement(By.xpath("//*[@id='bookHotelTab-panel']/form/button")).click();

        String actualPageName = driver.getTitle();
        System.out.println(actualPageName);
        String expectedPageName = "United Airlines - Airline Tickets, Travel Deals and Flights";
        Assert.assertEquals(expectedPageName,actualPageName);

    }
}