package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
	WebDriver driver;
	WebDriverWait webDriverWait;
	WebElement chekingBox;
	WebElement plusButton;
	WebElement minusButton;
	WebElement arrowHome;
	WebElement arrowDesktop;
	WebElement arrowDocuments;
	WebElement arrowDownloads;
	WebElement homeBox;
	WebElement desktopBox;
	WebElement notesBox;
	WebElement commandsBox;
	WebElement documentsBox;
	WebElement workspaceBox;
	WebElement reactBox;
	WebElement angularBox;
	WebElement veuBox;
	WebElement officeBox;
	WebElement publicBox;
	WebElement privateBox;
	WebElement classified;
	WebElement general;
	WebElement downloads;
	WebElement wordfile;
	WebElement excelfile;
	WebElement printedlist;
	Actions action;

	public CheckBox(WebDriver driver, WebDriverWait webDriverWait) {
		super();
		this.driver = driver;
		this.webDriverWait = webDriverWait;

	}

	public WebElement getChekingBox() {
		return driver.findElement((By.id("item-1")));
	}

	public WebElement getPlusButton() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]/svg/path"));
	}

	public WebElement getMinusButton() {
		return driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]/*[1]"));
	}

	public WebElement getArrowHome() {
		return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
	}

	public WebElement getArrowDesktop() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
	}

	public WebElement getArrowDocuments() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
	}

	public WebElement getArrowDownloads() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
	}

	public WebElement getHomeBox() {
		return driver.findElement(By.cssSelector(
				"div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.check-box-tree-wrapper div.react-checkbox-tree.rct-icons-fa4 ol:nth-child(2) li.rct-node.rct-node-parent.rct-node-collapsed span.rct-text label:nth-child(2) > span.rct-checkbox:nth-child(2)"));
	}

	public WebElement getDesktopBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
	} // By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label >
		// span.rct-checkbox > svg"));

	public WebElement getNotesBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
	}

	public WebElement getCommandsBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
	}

	public WebElement getDocumentsBox() {
		return driver.findElement(By.cssSelector(
				"div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.check-box-tree-wrapper div.react-checkbox-tree.rct-icons-fa4 li.rct-node.rct-node-parent.rct-node-expanded ol:nth-child(2) li.rct-node.rct-node-parent.rct-node-collapsed:nth-child(2) span.rct-text label:nth-child(2) > span.rct-checkbox:nth-child(2)"));
	}

	public WebElement getWorkspaceBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
	}

	public WebElement getReactBox() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
	}

	public WebElement getAngularBox() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]"));
	}

	public WebElement getVeuBox() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]"));
	}

	public WebElement getOfficeBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
	}

	public WebElement getPublicBox() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
	}

	public WebElement getPrivateBox() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
	}

	public WebElement getClassified() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
	}

	public WebElement getGeneral() {
		return driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
	}

	public WebElement getDownloads() {
		return driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]"));
	}

	public WebElement getWordfile() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));

	}

	public WebElement getExcelfile() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
	}

	public WebElement getPrintedlist() {
		return driver
				.findElement((By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/span[2]")));
	}

	public void expandMenu() {
		this.getPlusButton().click();
	}

	public void withdrawMenu() {
		this.getMinusButton().click();
	}

	public void markAllElementsBelowHome() {
		this.getHomeBox().click();

	}

	public void unmarkAllElementsBelowHome() {
		action.doubleClick(homeBox).perform();
	}

	public void markAllFilesBelowDesktop() {
		this.getDesktopBox().click();

	}

	public void unmarkAllFilesBelowDesktop() {
		action.doubleClick(desktopBox).perform();
	}

	public void markAllFoldersFilesBelowDocuments() {
		this.getDocumentsBox().click();
	}

	public void unmarkAllFoldersFilesBelowDocuments() {
		action.doubleClick(documentsBox).perform();
	}

	public void markAllFilesBelowDownloads() {
		this.getDownloads().click();
	}

	public void unmarkAllFilesBelowDownloads() {
		action.doubleClick(downloads).perform();
		
	}

	public void markAllFilesBelowWorkSpace() {
		this.getDownloads().click();

	}

	public void unmarkAllFilesBelowWorkSpace() {
		action.doubleClick(workspaceBox).perform();

	}

	public void markAllFilesBelowOffice() {
		this.getDownloads().click();

	}

	public void unmarkAllFilesBelowOffice() {
		action.doubleClick(officeBox).perform();

	}

	public void expandWithHomeArrow() {
		this.getArrowHome().click();

	}

	public void withdrawWithHomeArrow() {
		action.doubleClick(arrowHome).perform();

	}

	public void expandWithDesktopArrow() {
		this.getArrowDesktop().click();

	}

	public void withdrawWithDesktopArrow() {
		action.doubleClick(arrowDesktop).perform();
	}

	public void expandWithDocumentsArrow() {
		this.getArrowDocuments().click();

	}

	public void withdrawWithDocumentsArrow() {
		action.doubleClick(arrowDocuments).perform();
	}

	public void expandWithDownloadsArrow() {
		this.getArrowDownloads().click();

	}

	public void withdrawWithDownloadsArrow() {
		action.doubleClick(arrowDownloads).perform();
		
	}
	// NOTE: I tried to this task with list of elements, but didn't find good
	// locators, neither I'm good in list method yet

	public void selectedNotesBox() {
		this.getNotesBox().click();
	}

	public void deselectedNotesBox() {
		action.doubleClick(notesBox).perform();
	}

	public void selectedCommandsBox() {
		this.getCommandsBox().click();
	}

	public void deselectedCommandsBox() {
		action.doubleClick(commandsBox).perform();
	}

	public void selectedReactFile() {
		this.getReactBox().click();
	}

	public void deselectedReactFile() {
		action.doubleClick(reactBox).perform();
	}

	public void selectedAngularFile() {
		this.getAngularBox().click();
	}

	public void deselectedAngularFile() {
		action.doubleClick(angularBox).perform();
	}

	public void selectedVeuFile() {
		this.getVeuBox().click();
	}

	public void deselectedVeuFile() {
		action.doubleClick(veuBox).perform();
	}

	public void selectedPublicFile() {
		this.getPublicBox().click();
	}

	public void deselectedPublicFile() {
		action.doubleClick(publicBox).perform();
	}

	public void selectedPrivateFile() {
		this.getPrivateBox().click();
	}

	public void deselectedPrivateFile() {
		action.doubleClick(privateBox).perform();
	}

	public void selectedClassifiedFile() {
		this.getClassified().click();
	}

	public void deselectedClassifiedFile() {
		action.doubleClick(classified).perform();

	}

	public void selectedGeneralFile() {
		this.getGeneral().click();
	}

	public void deselectedGeneralFile() {
		action.doubleClick(general).perform();

	}

	public void selectedWorldFile() {
		this.getWordfile().click();
	}

	public void deselectedWorldFile() {
		action.doubleClick(wordfile).perform();

	}

	public void selectedExcelFile() {
		this.getExcelfile().click();
	}

	public void deselectedExcelFile() {
		action.doubleClick(excelfile).perform();

	}

	public void ispisListe() {
		this.getPrintedlist().getText();

	}
}
