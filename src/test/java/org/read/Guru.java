package org.read;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru {
	@Test
public void prac() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenData\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guru99.com/become-an-instructor.html");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,100)");
    //WebElement frame = driver.findElement(By.id("//form[@id='82892910187466']"));
    driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.id("jfCard-welcome-start")).click();
	driver.findElement(By.id("first_28")).sendKeys("Joseph");
	driver.findElement(By.id("last_28")).sendKeys("Leo");
	driver.findElement(By.xpath("(//Button[@Class='jfInput-button forNext u-right'])[1]")).click();
	driver.findElement(By.id("input_12")).sendKeys("josephjohnleoindia@gmail.com");
	driver.findElement(By.xpath("(//Button[@Class='jfInput-button forNext u-right'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@Class='jfYesno-label'])[2]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@Class='qq-upload-button']")).click();
	driver.findElement(By.xpath("(//div[@role='button'])[7]")).click();
	Runtime.getRuntime().exec("C:\\Users\\pc\\Desktop\1234.exe");
	}
}
