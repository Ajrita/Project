package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement radioButtons;
	WebElement radioButtonYes;
	WebElement radioButtonImpressive;
	WebElement answer;
	/*
	 * This project cover just happy path for now. Because of that, test case for
	 * radio button 'No' isn't written.
	 */

	public RadioButton(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;
	}

	public WebElement getRadioButtons() {
		return driver.findElement(By.id("item-2"));
	}

	public WebElement getRadioButtonYes() {
		return driver.findElement(By.cssSelector(
				"#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label"));
		// (By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
	}

	public WebElement getRadioButtonImpressive() {
		return driver.findElement(By.cssSelector(
				"#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label"));
	}

	public void enterRadioButtons() {
		this.getRadioButtons().click();
	}

	public void clickOnRadioButtonYes() {
		this.getRadioButtonYes().click();
	}

	public void clickOnRadioButtonImpressive() {
		this.getRadioButtonImpressive().click();

	}

	public String buttonYesText() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > p")));

		return getRadioButtonYes().getText();

	}

	public String buttonImpressiveText() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
				By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > p > span")));
		return getRadioButtonImpressive().getText();

	}

}
