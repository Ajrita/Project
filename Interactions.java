package fromMainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Interactions {
	WebDriver driver;
	WebElement interactions;
	

	public Interactions(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getInteractions() {
		return driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]"));
	}
	public void clickOnInteractions() throws InterruptedException { //scroll is needed 'cause locator isn't visible immediately on the page
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getInteractions());
		Thread.sleep(2000);
		this.getInteractions().click();
	
	
		
	}
	

}
