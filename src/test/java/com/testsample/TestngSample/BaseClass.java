package com.testsample.TestngSample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static ChromeDriver driver;	

	public static void browserlaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SCORPION\\eclipse-workspace\\TestngSample\\src\\test\\java\\com\\testsample\\TestngSample");	

	driver = new ChromeDriver();
	driver.manage().window().maximize();

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
		
	public static void maxmizeScreen() {
		driver.manage().window().maximize();
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void browserClose() {
		driver.close();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void getText(WebElement element) {
		element.getText();
	}

	public static void getAttribute(WebElement element) {
		String s = element.getAttribute("value");
		System.out.println(s);
	}

	public static void mousehover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void submitElement(WebElement element) {
		element.submit();
	}

	public static void contextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	public static void quit() {
		driver.quit();
	}

	public static void windowHandle() {
		String s = driver.getWindowHandle();
		System.out.println(s);
	}

	//public static void windowhandles() {
	// Set<String>windows = driver.getWindowHandles(); //not yet finished

	//}

	public static void sleepTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void screenshot(File destiny) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(source, destiny);
	}

	public static void jsSetAttribute(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value')", data);
	}

	public static void jsGetAttribute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String data = (String) js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(data);

	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);
	}

	public static void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}




	public static void frameCount() {
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		int frameList = frameCount.size();
		System.out.println("No. of frame present in the webpage : " + frameList);
	}

	public static void selectbyvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}
	public static void selectbyindex(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);
	}
	public static void selectbyVisibleText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}
	public static WebElement findElementid(String id) {
		return driver.findElement(By.id(id));
	}
	public static WebElement findElementname(String name) {
		return driver.findElement(By.name(name));
	}
	public static WebElement findElementtagname(String tagName) {
		return driver.findElement(By.tagName(tagName));
	}
	public static WebElement findElementclassname(String classname) {
		return driver.findElement(By.className(classname));
	}
	public static WebElement findElementXpath(String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression));
	}
	public static WebElement findElementLinkText(String linktext) {
		return driver.findElement(By.linkText(linktext));
	}
	public static WebElement findElementPartialLinkText(String partiallink) {
		return driver.findElement(By.partialLinkText(partiallink));
	}

	//abstract class
	public static WebElement findElementBy(By by) {
		return driver.findElement(by);
	}
	}
	


