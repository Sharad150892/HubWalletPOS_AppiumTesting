package testUtils;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pageObjectAndroid.HomePage;
import pageObjectAndroid.LoginPage;
import pageObjectAndroid.MenuDropDownPage;

public class POSBaseTest {

	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	public LoginPage login;
	public HomePage homePage;
	public MenuDropDownPage menuBtn;

	@BeforeClass
	public void ConfigureAppium() throws IOException {
		
//		service = new AppiumServiceBuilder().
//				withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
//				withIPAddress("127.0.0.1").usingPort(4723).build();
//				service.start();
//		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("samsung SM-T733");
		options.setApp("C:\\Users\\Admin\\eclipse-workspace\\HubWalletPOS_AppiumTesting\\src\\test\\java\\resources\\app-development-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login = new LoginPage(driver);
		homePage = new HomePage(driver);
		menuBtn = new MenuDropDownPage(driver);
	}
	
	
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
//		service.stop();
		}

}
