package fromMainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
	WebDriver driver;
	WebElement elements;
	//WebElement js;

	public ElementsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	

	public WebElement getElements() {
		return driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
		
	}
	
	public void clickOnElements() throws InterruptedException{ //scroll is needed 'cause locator isn't visible immediately on the page
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", getElements());
		//js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		this.getElements().click();
		
	}

}
