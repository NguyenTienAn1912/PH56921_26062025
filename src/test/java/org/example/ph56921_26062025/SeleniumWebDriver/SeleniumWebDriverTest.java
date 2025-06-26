package org.example.ph56921_26062025.SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTest {
    private WebDriver webDriver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        Thread.sleep(2000);
        webDriver.quit();
    }
}
