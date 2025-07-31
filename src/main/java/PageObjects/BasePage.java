package PageObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {
	
	public Logger logger;
	public Properties p;
	public Actions act;
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
	//create constructor
	public BasePage(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	}
		


}
