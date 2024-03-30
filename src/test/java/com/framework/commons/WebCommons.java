package com.framework.commons;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import io.cucumber.java.an.E;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.base.BasePage;
import com.framework.utilities.ReadProp;
import org.testng.asserts.SoftAssert;

public class WebCommons {

	// This class will have all common methods to perform different actions on web
	// application

	public WebDriver driver = new BasePage().getDriver();
	public Properties prop = ReadProp.readData("Config.properties");
	protected WebDriverWait wait;
	protected Actions actions = new Actions(driver);
	public SoftAssert softAssert = new SoftAssert();

	// method to launch the browser
	public void launchApplication(String url) {
		driver.get(url);
	}

	// scroll to the element
	public void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element);
		wait(1);
	}

	// method to click on element
	public void click(WebElement element) {
		scrollToElement(element);
		element.click();
	}
	public void click_using_keys(WebElement element) {
		scrollToElement(element);
		element.sendKeys(Keys.ENTER);
	}
	public void scrollToTop() {
		try {
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}

	// method to type the text in textbox
	public void enterInfo(WebElement element, String value) {
		scrollToElement(element);
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		element.sendKeys(value);
	}

	// method to select checkbox
	public void selectCheckbox(WebElement element) {
		scrollToElement(element);
		if (!element.isSelected())
			element.click();
	}

	// method to wait using java wait
	public void wait(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// method to wait using implicit wait
	public void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	// method to wait using implicit wait
	public void waitForElement(By locator, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, 0));
	}

	public void waitForVisibilityOfElement(WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForVisibilityOfAllElement(List<WebElement> element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void waitForInVisibilityOfElement(WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// method to take screenshot of window
	public static String takeWindowScreenshot(WebDriver driver, String name) throws IOException {
		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + name + ".jpeg";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		return screenshotPath;
	}

	// method to take screenshot of element
	public static String takeElementScreenshot(WebElement element, String name) throws IOException {
		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + name + ".jpeg";
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		return screenshotPath;
	}

	// method to get text from element
	public String getText(WebElement element) {
		return element.getText();
	}

	// method to get title
	public String getTitle() {
		return driver.getTitle();
	}

	public void waitForTitle(String expected) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.titleIs(expected));
		} catch (Exception e) {
		}
	}

	// method to check is element displayed or not
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public String waitForTableValue(String tableXpath, int row, int column, String expextedText) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(
				driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + row + "]/td[" + column + "]")), expextedText));
		WebElement element = driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + row + "]/td[" + column + "]"));
		return element.getText();
	}

	public String getTableValue(String tableXpath, int row, int column) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(tableXpath + "/tbody/tr[" + row + "]/td[" + column + "]")));
		WebElement element = driver.findElement(By.xpath(tableXpath + "/tbody/tr[" + row + "]/td[" + column + "]"));
		return element.getText();
	}

	public WebElement viewRow(int row) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table//tr[" + row + "]/td[9]/button[1]")));
		WebElement element = driver.findElement(By.xpath("//table//tr[" + row + "]/td[9]/button[1]"));
		return element;
	}

	public WebElement updateRow(int row) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table//tr[" + row + "]/td[9]/button[2]")));
		WebElement element = driver.findElement(By.xpath("//table//tr[" + row + "]/td[9]/button[2]"));
		return element;
	}

	public WebElement deleteRow(int row) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tr[" + row + "]/td[9]/button[3]")));
		WebElement element = driver.findElement(By.xpath("//table//tr[" + row + "]/td[9]/button[3]"));
		return element;
	}

	public void moveToElement(WebElement element) {
		waitForVisibilityOfElement(element, 5);
		actions.moveToElement(element).build().perform();
		actions.scrollToElement(element).build().perform();
	}

	public void actionClick(WebElement element) {
		waitForVisibilityOfElement(element, 5);
		actions.click(element).build().perform();
	}

	public void actionDoubleClick(WebElement element) {
		waitForVisibilityOfElement(element, 5);
		actions.doubleClick(element).build().perform();
	}

	public void actionContextClick(WebElement element) {
		waitForVisibilityOfElement(element, 5);
		actions.contextClick(element).build().perform();
	}

	public WebElement getElement(List<WebElement> elementList, String elementName) {
		WebElement webElement = null;
		for (WebElement element : elementList) {
			if (element.getText().equalsIgnoreCase(elementName)) {
				webElement = element;
				break;
			}
		}
		return webElement;
	}

	public WebElement waitForTextTobeVisible(String elementName) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='" + elementName + "']")));
		return driver.findElement(By.xpath("//*[text()='" + elementName + "']"));
	}
}
