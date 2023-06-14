package org.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Sample extends BaseClass {
	
	
	public static void main(String[] args) throws Exception {
		String s="#337ab7";
		browserLaunch("https://demo.automationtesting.in/Register.html");
		WebElement l = driver.findElement(By.id("logo-icon"));
		String value = l.getCssValue("background-color");
		System.out.println(value);
		String hex = Color.fromString(value).asHex();
		System.out.println(hex);
		if (hex.equals(s)) {
			l.click();
		}
		
	}
}
