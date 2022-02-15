package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class UtilityClass{
public static WebDriver driver;

		public static void takeScrrenshot(WebDriver driver, String fileName) {
			String path = System.getProperty("user.dir") + "\\output\\screenshots\\";
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File(path + fileName + ".png"));
			} catch (IOException e) {
				e.printStackTrace();

			}

		}

	}


