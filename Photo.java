package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Photo {
	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement buttonDownload;
	WebElement buttonChooseFile;

	public Photo(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;
	}

	public WebElement getButtonDownload() {
		return driver.findElement(By.xpath("//a[@id='downloadButton']"));
	}

	public WebElement getButtonChooseFile() {
		return driver.findElement(By.xpath("//input[@id='uploadFile']"));
	}

	public void clickDownload() {
		this.getButtonDownload().click();
	}

	public void clickChooseFile() {
		this.getButtonChooseFile().sendKeys("C:\\Users\\PC\\Downloads\\sampleFile.jpeg");
	}

	public String uspeh() {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='uploadedFilePath']")));
		return getButtonChooseFile().getText();
	}

}
