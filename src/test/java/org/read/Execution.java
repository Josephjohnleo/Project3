package org.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenData\\Driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");


}
}
