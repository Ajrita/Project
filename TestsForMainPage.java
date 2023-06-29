package fromMainPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/*This is the package for the main page on www.demoqa.com 
 * Here, I'm testing if click on sections will redirect to adequate url*/

public class TestsForMainPage extends BaseMainPage {
	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize(); 
		driver.navigate().to(url); // driver.navigate().to("https://demoqa.com/");
	}

	@Test(priority = 5) //confirming that corresponding page is loaded
	public void successfulLoadedPage() {
		String url = excelReader.getStringData("Project", 1, 0);
		Assert.assertEquals(url, driver.getCurrentUrl());

	}

	@Test(priority = 10)
	public void confirmingElements() { // confirming that all sections are visible on the page
		Assert.assertTrue(elementsPage.getElements().isDisplayed());
		Assert.assertTrue(formsPage.getForms().isDisplayed());
		Assert.assertTrue(alertsFrameWindowsPage.getAlerts().isDisplayed());
		Assert.assertTrue(widgets.getWidgets().isDisplayed());
		Assert.assertTrue(interactions.getInteractions().isDisplayed());
		Assert.assertTrue(bookStoreApplication.getBooks().isDisplayed());
	}

	@Test(priority = 20)
	public void goingToElements() throws InterruptedException {

		elementsPage.clickOnElements();
		Thread.sleep(2000);
		String url2 = excelReader.getStringData("Project", 2, 0); // confirming that clicking on the 'Element'section
																	// will lead us to corresponding url
		Assert.assertEquals(url2, driver.getCurrentUrl());

	}

	@Test(priority = 30)
	public void goingToForms() throws InterruptedException {
		formsPage.clickOnForms();
		String url3 = excelReader.getStringData("Project", 3, 0); // confirming that clicking on the 'Forms' section
																	// will lead us to corresponding url
		Thread.sleep(2000);
		Assert.assertEquals(url3, driver.getCurrentUrl());

	}

	@Test(priority = 40)
	public void goingToAlerts() throws InterruptedException { // confirming that clicking on the 'Alerts, Frame &
																// Windows' section will lead us to corresponding url
		alertsFrameWindowsPage.clickOnAlerts();
		Thread.sleep(2000);
		String url4 = excelReader.getStringData("Project", 4, 0);
		Assert.assertEquals(url4, driver.getCurrentUrl());
	}

	@Test(priority = 50)
	public void goingToWidgets() throws InterruptedException { // confirming that clicking on the 'Widgets' section will
																// lead us to corresponding url
		widgets.clickOnWidgets();
		Thread.sleep(2000);
		String url5 = excelReader.getStringData("Project", 5, 0);
		Assert.assertEquals(url5, driver.getCurrentUrl());
	}

	@Test(priority = 60)
	public void goingToInteractions() throws InterruptedException { // confirming that clicking on the 'Interactions'
																	// section will lead us to corresponding url
		interactions.clickOnInteractions();
		Thread.sleep(2000);
		String url6 = excelReader.getStringData("Project", 6, 0);
		Assert.assertEquals(url6, driver.getCurrentUrl());
	}

	@Test(priority = 70)
	public void goingToBooks() throws InterruptedException { // confirming that clicking on the 'Book Store Application'
																// section will lead us to corresponding url
		bookStoreApplication.clickOnBooks();
		Thread.sleep(2000);
		String url7 = excelReader.getStringData("Project", 7, 0);
		Assert.assertEquals(url7, driver.getCurrentUrl()); // Assert.assertTrue(driver.getCurrentUrl().equals(url7));
		
	}

	@AfterMethod
	public void cleaning() {
		driver.navigate().back(); //returning on the previous page; In this task, we can test without it as it backs on the main page because of command in the BeforeMethod 
		driver.manage().deleteAllCookies(); //deleting cookies after every test

	}

}
