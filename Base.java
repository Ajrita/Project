package project;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import project.CheckBox;
import project.ElementBox;
import project.RadioButton;
import project.ExcelReader;
import project.TextBox;
/*For this project I used ChroPath, to find locators easier, and I tested it through Google Chrome Version 94.0.4606.71*/

public class Base {
	// Making the objects of the class
	// They must be public, otherwise program woludn't work
	public WebDriver driver;
	public WebDriverWait webDriverWait;
	public ExcelReader excelReader;
	public ElementBox elementBox;
	public TextBox textBox;
	public CheckBox checkBox;
	public RadioButton radioButton;
	public Buttons buttons;
	public Links links;
	public Photo photo;
	public String url;
	public JavascriptExecutor js;
	
	//public Actions actions;

	@BeforeClass
	public void setUp() throws IOException {
		// Giving to the objects the values of the drivers
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		webDriverWait = new WebDriverWait(driver, 7);
		excelReader = new ExcelReader("C:\\Users\\PC\\Documents\\Project.xlsx");
		url = excelReader.getStringData("Project", 2, 0);
		elementBox = new ElementBox(driver, webDriverWait);
		textBox = new TextBox(driver, webDriverWait);
		checkBox = new CheckBox(driver, webDriverWait);
		radioButton = new RadioButton(driver, webDriverWait);
		buttons = new Buttons(driver, webDriverWait);
		links = new Links(driver, webDriverWait);
		photo = new Photo(driver, webDriverWait);
		js = new JavascriptExecutor() { // skroll

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
