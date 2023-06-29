package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement enterButtons;
	WebElement doubleClickMe;
	WebElement rightClickMe;
	WebElement clickMe;
	Actions action;

	public Buttons(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;
	}

	public WebElement getEnterButtons() {
		return driver.findElement(By.id("item-4"));
	}

	public WebElement getDoubleClickMe() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/button"));
	}

	public WebElement getRightClickMe() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
	}

	public WebElement getClickMe() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
	}

	public void clickDouble() {
		action.doubleClick(doubleClickMe).perform();
	}

	public void clickRight() {
		action.contextClick(rightClickMe).perform();
	}

	public void clickClick() {
		action.click(clickMe).perform();
	}

	public String textDouble() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='doubleClickMessage']")));
		return getDoubleClickMe().getText();
	}

	public String textRight() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='rightClickMessage']")));
		return getRightClickMe().getText();
	}

	public String textClick() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='dynamicClickMessage']")));
		return getClickMe().getText();
	}
}
