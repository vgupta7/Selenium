package TestPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import MainPack.Setup;

/*
 * This class is used for login to the box application.
 */
public class LoginTest extends Setup {

	//Login to box site.
	@Test
	public void login() throws InterruptedException {

		element = driver.findElement(By
				.xpath("//div[@id='login-block']/ul/li/a"));
		element.click();

		Thread.sleep(1000);

		element = driver.findElement(By.id("login"));

		// element = driver.findElement(By.className("login_icon_input"));
		element.sendKeys("vgupta77447@gmail.com");
		element = driver.findElement(By.id("password"));
		element.sendKeys("vgupta447");
		element = driver.findElement(By.id("continue"));
		element.click();
	}

}
