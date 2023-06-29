package fromMainPage;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import project.ExcelReader;

public class BaseMainPage {

	public WebDriver driver;
	public WebDriverWait webDriverWait; // slowing down test for the purpose of better catching elements
	public ExcelReader excelReader;
	public ElementsPage elementsPage; //getting data from excel table
	public FormsPage formsPage;
	public AlertsFrameWindowsPage alertsFrameWindowsPage;
	public Widgets widgets;
	public Interactions interactions;
	public BookStoreApplication bookStoreApplication;
	public String url;
	public JavascriptExecutor js; //tool for scrolling on the page when element isn't visible immediatley 


	@BeforeClass
	public void SetUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		webDriverWait = new WebDriverWait(driver, 7);
		excelReader = new ExcelReader("C:\\Users\\PC\\Documents\\Project.xlsx");
		url = excelReader.getStringData("Project", 1, 0); // ("https://demoqa.com/");
		elementsPage = new ElementsPage(driver);
		formsPage = new FormsPage(driver);
		alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
		widgets = new Widgets(driver);
		interactions = new Interactions(driver);
		bookStoreApplication = new BookStoreApplication(driver);
		js = new JavascriptExecutor() {

			@Override
			public Object executeScript(String arg0, Object... arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object executeAsyncScript(String arg0, Object... arg1) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		

	}

	@AfterClass
	public void tearDown() {
		driver.close();

	}

}
