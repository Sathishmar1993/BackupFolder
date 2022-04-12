package org.info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\buvanesh\\eclipse-workspace\\Selenium08mar\\chrome99\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		
		WebElement btnx = dr.findElement(By.xpath("//input[@name=\"q\"]"));
		btnx.sendKeys("Laptop");
		
		WebElement btnp = dr.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		btnp.click();
		
		WebElement btnu = dr.findElement(By.xpath("//button[@type=\"submit\"]"));
		btnu.click();
		
		WebElement btnr = 
				dr.findElement(By.xpath("//div[@class=\"CXW8mj\"]"));
		btnr.click();
	

}}
