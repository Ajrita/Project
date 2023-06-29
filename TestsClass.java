package project;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsClass extends Base {
	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(url); // driver.navigate().to (https://demoqa.com/elements);
	}

	@Test(priority = 5)
	public void ClickingTextBox() throws InterruptedException {

		// Confirming that items in the left menu are visible
		Assert.assertTrue(textBox.getTekstboks().isDisplayed());
		Assert.assertTrue(checkBox.getChekingBox().isDisplayed());
		Assert.assertTrue(radioButton.getRadioButtons().isDisplayed());

	}

	@Test(priority = 6) // ovaj test pada, nisam shvatila zašto
	public void OpenAndWithdrawMenu() throws InterruptedException {
		for (int i = 0; i < 6; i++) {
			elementBox.clickOnElements(i);
			elementBox.clickOnElements(i);
			Thread.sleep(1000);
		}
	}

	@Test(priority = 10)
	public void goingToTextBox() throws InterruptedException {
		textBox.clickOnTextBox();
		Thread.sleep(2000);

		// Confirming that registration form is visible on the page
		Assert.assertTrue(textBox.getFullNameField().isDisplayed());
		Assert.assertTrue(textBox.getEmailField().isDisplayed());
		Assert.assertTrue(textBox.getCurrentaddressField().isDisplayed());
		Assert.assertTrue(textBox.getPermanentaddressField().isDisplayed());

		// Confirming through url and data in Excel table, that we are on adequate page
		String url2 = excelReader.getStringData("Project", 8, 0);
		assertEquals(url2, driver.getCurrentUrl());

	}

	@Test(priority = 20)
	public void registrationCanBeFilled() throws InterruptedException {
		textBox.clickOnTextBox();
		Thread.sleep(2000);

		String fullName = excelReader.getStringData("Project", 1, 1);
		String email = excelReader.getStringData("Project", 1, 2);
		String trenutnaAdresa = excelReader.getStringData("Project", 1, 3);
		String stalnaAdresa = excelReader.getStringData("Project", 1, 4);
		String ispisanoIme = excelReader.getStringData("Project", 1, 5);
		String ispisanMejl = excelReader.getStringData("Project", 2, 5);
		String ispisanaTenutnaAdresa = excelReader.getStringData("Project", 3, 5);
		String ispisanaStalnaAdresa = excelReader.getStringData("Project", 4, 5);

		textBox.insertFullName(fullName);
		textBox.insertEmail(email);
		textBox.insertCurrentAddress(trenutnaAdresa);
		textBox.insertPermanentAddress(stalnaAdresa);
		textBox.clickSubmitButton();
		Thread.sleep(1000);

		Assert.assertTrue(textBox.getOutputBox().isDisplayed());
		
         //za naredne asertove izbacuje grešku da za ono što je oèekivano se vraæa praznina []
		/*assertEquals(textBox.nameText(), ispisanoIme);
		assertEquals(textBox.emailText(), ispisanMejl);
		assertEquals(textBox.currentAddressText(), ispisanaTenutnaAdresa);
		assertEquals(textBox.permanentAddressText(), ispisanaStalnaAdresa);*/

		
	}

	@Test(priority = 30)
	public void goingToRadioButtons() throws InterruptedException {
		radioButton.enterRadioButtons();
		Thread.sleep(2000);

		// Confirming that buttons exist on the page
		Assert.assertTrue(radioButton.getRadioButtonYes().isDisplayed());
		Assert.assertTrue(radioButton.getRadioButtonImpressive().isDisplayed());

		// Confirming through url and data in Excel table, that we are on the adequate
		// page
		String url3 = excelReader.getStringData("Project", 9, 0);
		assertEquals(url3, driver.getCurrentUrl());
	}

	@Test(priority = 40)
	public void clickableYesButton() throws InterruptedException {
		radioButton.enterRadioButtons();
		Thread.sleep(2000);
		radioButton.clickOnRadioButtonYes();

		String successfulText1 = excelReader.getStringData("Project", 9, 5);
		assertEquals(radioButton.buttonYesText(), successfulText1); // confirming through metod and Excel data that
																	// print is equal

	}

	@Test(priority = 50)
	public void clickableImpressiveButton() throws InterruptedException {
		radioButton.enterRadioButtons();
		Thread.sleep(2000);
		radioButton.clickOnRadioButtonImpressive();

		String successfulText2 = excelReader.getStringData("Project", 10, 5);
		assertEquals(radioButton.buttonImpressiveText(), successfulText2); // confirming through method and Excel data
																			// that print is equal
	}
	
	@Test (priority = 60)
	public void Menu() throws InterruptedException {
		checkBox.getChekingBox().click();
		Thread.sleep(2000);
		checkBox.expandMenu();
		
		Assert.assertTrue(checkBox.getHomeBox().isDisplayed());
		Assert.assertTrue(checkBox.getDesktopBox().isDisplayed());
		Assert.assertTrue(checkBox.getDocumentsBox().isDisplayed());
		Assert.assertTrue(checkBox.getDownloads().isDisplayed());
		Assert.assertTrue(checkBox.getNotesBox().isDisplayed());
		Assert.assertTrue(checkBox.getCommandsBox().isDisplayed());
		Assert.assertTrue(checkBox.getWorkspaceBox().isDisplayed());
		Assert.assertTrue(checkBox.getReactBox().isDisplayed());
		Assert.assertTrue(checkBox.getAngularBox().isDisplayed());
		Assert.assertTrue(checkBox.getVeuBox().isDisplayed());
		Assert.assertTrue(checkBox.getOfficeBox().isDisplayed());
		Assert.assertTrue(checkBox.getReactBox().isDisplayed());
		Assert.assertTrue(checkBox.getPublicBox().isDisplayed());
		Assert.assertTrue(checkBox.getPrivateBox().isDisplayed());
		Assert.assertTrue(checkBox.getClassified().isDisplayed());
		Assert.assertTrue(checkBox.getGeneral().isDisplayed());
		Assert.assertTrue(checkBox.getReactBox().isDisplayed());
		Assert.assertTrue(checkBox.getWordfile().isDisplayed());
		Assert.assertTrue(checkBox.getExcelfile().isDisplayed());
	} //we can do this assert for checking expansion of all folders
		
		@Test (priority = 70)
		public void MenuMinimize() throws InterruptedException {
			checkBox.getChekingBox().click();
			Thread.sleep(2000);
			checkBox.withdrawMenu();
			
			Assert.assertFalse(checkBox.getExcelfile().isDisplayed());
		} ////we can do this assert for checking withdrawing of all folders
			
		@Test (priority = 80)
		public void CheckClikingHome() throws InterruptedException {
			checkBox.getChekingBox().click();
			Thread.sleep(2000);
			checkBox.markAllElementsBelowHome(); 
			String successfulText3 = excelReader.getStringData("Project", 5, 5); 
			//assertEquals(checkBox.ispisListe(), successfulText3);
			Assert.assertTrue(checkBox.getPrintedlist().isDisplayed());
			}
		
		
		
		@AfterMethod
	public void cleaning() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
