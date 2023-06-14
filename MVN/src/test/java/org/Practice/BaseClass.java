package org.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;

	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static String getTitle() {
String title = driver.getTitle();
return title;
	}
	public static void sendKeys(WebElement element, String  text ) {
		element.sendKeys(text);
	}
	public static WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public static WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public static void sendByJs(WebElement element,String text) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('value','text')",element);
 
	}
	}

