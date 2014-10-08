package MainPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

/*
 * This is setup file
 */
public class Setup {

	protected WebDriver driver = new FirefoxDriver();
	protected WebElement element;

	// This open the browser and maximize the window.
	@BeforeClass
	public void beforeClass() {

		driver.get("https://www.box.com/");
		driver.manage().window().maximize();
	}
	
	//This will logout and close the browser.
	@AfterClass
	public void logout() throws InterruptedException {

		element = driver.findElement(By.id("current_user_tab_link"));
		element.click();
		Thread.sleep(2000);

		element = driver.findElement(By.id("current_user_logout"));
		Thread.sleep(2000);

		driver.close();

	}

}
