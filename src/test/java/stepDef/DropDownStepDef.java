package stepDef;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.UtilityClass;

public class DropDownStepDef extends UtilityClass {
	WebDriver driver = null;

	@Given("User is on home page")
	public void user_is_on_home_page() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		String title = driver.getTitle();
		String actualTitle = "omayo (QAFox.com)";
		assertEquals(title, actualTitle);
		System.out.println(title);

	}

	@When("User click on Older Newsletters dropdown")
	public void user_click_on_older_newsletters_dropdown() {
		WebElement dropDwon = driver.findElement(By.xpath("//select[@id='drop1']"));
		dropDwon.click();
	}

	@Then("User select doc2 from list")
	public void user_select_doc2_from_list() throws InterruptedException {
		WebElement selectDoc2 = driver.findElement(By.id("drop1"));
		Select selectObj = new Select(selectDoc2);
		selectObj.selectByVisibleText("doc 2");
		Thread.sleep(5000);
		UtilityClass.takeScrrenshot(driver, "sceenShot");
		driver.close();
	}

}
