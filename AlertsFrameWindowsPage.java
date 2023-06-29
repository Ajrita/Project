package fromMainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsFrameWindowsPage {
	WebDriver driver;
	WebElement alerts;

	public AlertsFrameWindowsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAlerts() {
		return driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/h5[1]"));
	}
	public void clickOnAlerts() throws InterruptedException { //scroll is needed 'cause locator isn't visible immediately on the page
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getAlerts());
		Thread.sleep(2000);
		this.getAlerts().click();
	
	}
	
	

}
