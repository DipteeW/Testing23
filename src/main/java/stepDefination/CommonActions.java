package stepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.TestUtil;

//Hook Class
public class CommonActions extends LoginstepBase {
	WebDriver driver;
	
	@Before
	public void SetUp()
	{
//	logger = Logger.getLogger("OrangeHRMAutomation");
//	PropertiesConfiguration.configure(current_project_dir+"/log4j.properties");	
		try
		{
			//public static Properties prop= new Properties(); //avaialble in base class
			current_project_dir=System.getProperty("user.dir");
			File propFile = new File(current_project_dir+"/config.properties");
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
//			logger.info("Loading config Properties file");
		}
		catch(IOException e)
		{
			e.getMessage();
			e.getStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
//		logger.info("Using browser- "+browserName);	
//		logger.info("Getting "+browserName+" webdriver");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Ne\\Cucumber_Final\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
		}
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@After (order=2)
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	@After (order=1)
	public void takeScreenshotOnFailure(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //temp folder	
			Date d = new Date();
			String timestamp = d.toString().replace(' ', '_').replace(':', '_');
			File dest = new File("C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\screenshot\\"+timestamp+".jpg");
			FileHandler.copy(src, dest);
			//FileUtils .copyFile(src, dest);
		}
	}
	public WebDriver getDriver()    //when need then call no annotation
	{
		return driver;
	}
}
