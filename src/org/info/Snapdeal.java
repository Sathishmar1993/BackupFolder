package org.info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal{
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\buvanesh\\eclipse-workspace\\Selenium08mar\\chrome99\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.snapdeal.com/");
		
		WebElement btnx = dr.findElement(By.xpath("//input[@id=\"inputValEnter\"]"));
		btnx.sendKeys("Trimmer");
		
		WebElement btnr = dr.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]"));
		btnr.click();
		
		WebElement btng = dr.findElement(By.xpath("//div[@class=\"col-xs-6  favDp product-tuple-listing js-tuple \"][1]"));
		btng.click();

	

}}
