package fromMainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStoreApplication {
	WebDriver driver;
	WebElement books;

	public BookStoreApplication(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getBooks() {
		return driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]"));
	}

	public void clickOnBooks() throws InterruptedException { //scroll is needed 'cause locator isn't visible immediately on the page

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getBooks());
		Thread.sleep(2000);
		this.getBooks().click();
	}

}
