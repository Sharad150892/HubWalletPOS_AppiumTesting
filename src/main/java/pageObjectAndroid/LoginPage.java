package pageObjectAndroid;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidAction;

public class LoginPage extends AndroidAction {

	AndroidDriver driver;

	public LoginPage(AndroidDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1']")
	private WebElement one;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2']")
	private WebElement two;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3']")
	private WebElement three;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='4']")
	private WebElement four;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='5']")
	private WebElement five;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='6']")
	private WebElement six;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='7']")
	private WebElement seven;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='8']")
	private WebElement eight;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='9']")
	private WebElement nine;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='0']")
	private WebElement zero;

	@AndroidFindBy(id = "com.hubwallet:id/submit")
	private WebElement submit;
	
	@AndroidFindBy(id = "com.hubwallet:id/text_input_end_icon")
	private WebElement maskUnmaskBtn;
	
	@AndroidFindBy(id = "com.hubwallet:id/forgotPassword")
	private WebElement forgotPinBtn;
	
	@AndroidFindBy(id = "com.hubwallet:id/email")
	private WebElement enterEmail;
	
	@AndroidFindBy(id = "com.hubwallet:id/send")
	private WebElement sendBtn;

	@AndroidFindBy(id = "com.hubwallet:id/version")
	private WebElement version;

	@AndroidFindBy(id = "com.hubwallet:id/logoutIcon")
	private WebElement logoutIcon;

	@AndroidFindBy(id = "com.hubwallet:id/btnCancel")
	private WebElement btnCancel;

	@AndroidFindBy(id = "com.hubwallet:id/btnContinue")
	private WebElement btnContinue;

	
	public void loginWithCorrectPin() 
	{
		six.click();
		one.click();
		five.click();
		four.click();
		eight.click();
		two.click();
		three.click();
		seven.click();	
	}
	
	public void loginWithIncorrectPin() 
	{
		six.click();
		one.click();
		five.click();
		four.click();
		eight.click();
		two.click();
		three.click();
		eight.click();
	}
	
	public void maskUnmask() 
	{
		maskUnmaskBtn.click();
	}
	
	public HomePage submit() 
	{
		submit.click();
		return new HomePage(driver);
	}
	
	public void forgotPin(String email) 
	{
		forgotPinBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		enterEmail.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sendBtn.click();
	}

	public String getVersion() 
	{
		return version.getText();
	}
	public void logout() 
	{
		logoutIcon.click();
		btnCancel.click();
		logoutIcon.click();
		btnContinue.click();
	}

}
