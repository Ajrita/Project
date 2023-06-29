package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement tekstboks;
	WebElement fullNameFiled;
	WebElement emailField;
	WebElement currentaddressField;
	WebElement permanentaddressField;
	WebElement submitButton;
	WebElement outputBox; // this field appears after 'submit' button and all inputed data are printed
							// here

	/*
	 * This project cover just happy path for now. Because of that, test case for
	 * inserting invalid email isn't written, although only that field is required
	 * to be correctly filled with extension: dot and two or three letters after it
	 */
	public TextBox(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;
	}

	public WebElement getTekstboks() {
		return driver.findElement(By.id("item-0"));
	}

	public WebElement getFullNameField() {
		return driver.findElement(By.xpath("//*[@id=\"userName\"]")); // (By.id("userName")); //
																		// xpath("//input[@id='userName']"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.xpath("//*[@id=\"userEmail\"]")); // (By.id("userEmail"));
	}

	public WebElement getCurrentaddressField() {
		return driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")); // (By.id("currentAddress"));
	}

	public WebElement getPermanentaddressField() {
		return driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));// (By.id("permanentAddress"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}

	public WebElement getOutputBox() {
		return driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]"));
	}

	public void clickOnTextBox() {
		this.getTekstboks().click();
	}

	public void insertFullName(String fullName) {
		this.getFullNameField().clear();
		this.getFullNameField().sendKeys(fullName);

	}

	public void insertEmail(String email) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(email);
	}

	public void insertCurrentAddress(String trenutnaAdresa) {
		this.getCurrentaddressField().clear();
		this.getCurrentaddressField().sendKeys(trenutnaAdresa);
	}

	public void insertPermanentAddress(String stalnaAdresa) {
		this.getPermanentaddressField().clear();
		this.getPermanentaddressField().sendKeys(stalnaAdresa);
	}

	public void clickSubmitButton() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSubmitButton());
		Thread.sleep(1000);
		this.getSubmitButton().click();
	}

	public void visibleOutputBox() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getOutputBox());
		Thread.sleep(2000);
		this.getOutputBox().getText();

	}

	public String nameText() {

		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/p[1]")));
		return getFullNameField().getText();
	}

	public String emailText() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/p[2]")));
		return getEmailField().getText();
	}

	public String currentAddressText() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"currentAddress\"]")));
		return getCurrentaddressField().getText();

	}

	public String permanentAddressText() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"permanentAddress\"]")));
		return getPermanentaddressField().getText();
	}

}
