package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {

	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement enterLinks;
	WebElement homeLink;
	WebElement nocontentLink;
	WebElement createdLink;
	WebElement movedLink;
	WebElement badrequestLink;
	WebElement unauthorizedLink;
	WebElement forbiddenLink;
	WebElement notfoundLink;
	WebElement print;

	public Links(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;
	}

	public WebElement getEnterLinks() {
		return driver.findElement(By.id("item-5"));
	}

	public WebElement getHomeLink() {
		return driver.findElement(By.xpath("//a[@id='simpleLink']"));
	}

	public WebElement getCreatedLink() {
		return driver.findElement(By.xpath("//a[@id='created']"));
	}

	public WebElement getNocontentLink() {
		return driver.findElement(By.xpath("//a[@id='no-content']"));
	}

	public WebElement getMovedLink() {
		return driver.findElement(By.xpath("//a[@id='moved']"));
	}

	public WebElement getBadrequestLink() {
		return driver.findElement(By.xpath("//a[@id='bad-request']"));
	}

	public WebElement getUnauthorizedLink() {
		return driver.findElement(By.xpath("//a[@id='unauthorized']"));

	}

	public WebElement getForbiddenLink() {
		return driver.findElement(By.xpath("//a[@id='forbidden']"));
	}

	public WebElement getNotfoundLink() {
		return driver.findElement(By.xpath("//a[@id='invalid-url']"));
	}

	public WebElement getPrint() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/p[10]/b[1]"));
	}

	public void clickOnHomeLink() {
		this.getHomeLink().click();
	}

	public void clickOnCreatedLink() {
		this.getCreatedLink().click();
	}

	public void clickOnNoContentLink() {
		this.getNocontentLink().click();
	}

	public void clickOnMovedLink() {
		this.getMovedLink().click();
	}

	public void clickOnBadrequestLink() {
		this.getBadrequestLink().click();
	}

	public void clickOnUnauthorizedLink() {
		this.getUnauthorizedLink().click();
	}

	public void clickOnForbiddenLink() {
		this.getForbiddenLink().click();
	}

	public void clickOnNotfoundLink() {
		this.getNotfoundLink().click();
	}

	public void ispis() {
		this.getPrint().getText();
	}
}