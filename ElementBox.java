package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementBox {
	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement textBox;
	WebElement navigation;

	public ElementBox(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;
	}

	public List<WebElement> getNavigation() {
		return driver.findElements(By.className("element-group"));
	}

	public void clickOnElements(int i) {
		this.getNavigation().get(i).click();

	}

	public WebElement getTextBox() {
		return driver.findElement(By.id("item-0"));
	}

	public void clickOnTextBoxItem() {
		this.getTextBox().click();
	}

}
