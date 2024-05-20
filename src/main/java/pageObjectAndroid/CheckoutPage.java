package pageObjectAndroid;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidAction;

public class CheckoutPage extends AndroidAction{
	
	AndroidDriver driver;

	public CheckoutPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.hubwallet:id/customerSpinner")
	private WebElement customerSpinner;
	
	@AndroidFindBy(id="com.hubwallet:id/menu")
	private WebElement addMenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Product']")
	private WebElement addProduct;
	
	@AndroidFindBy(id="com.hubwallet:id/headerTextView")
	private WebElement headerView;
	
	@AndroidFindBy(id="com.hubwallet:id/recycleView")
	private WebElement recycleView;
	
	@AndroidFindBy(id="com.hubwallet:id/availableQuantity")
	private List<WebElement> availableQty;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Gift Card']")
	private WebElement addGiftCard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Certificate']")
	private WebElement addCertificate;
	
	public void clickCustomer()  {
		customerSpinner.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		customerSpinner.clear();
	}
	
	public void selectCustomer() throws InterruptedException {
		customerSpinner.sendKeys("Jack Connor");
		Thread.sleep(6000);
		scrollToEndAction();
		driver.hideKeyboard();
//		scrollToText("Jack Connor");
//		customerSpinner.click();
//		Thread.sleep(6000);
//		scrollToEndAction();
	}
	
	public String checkProductList() {
		addMenu.click();
		addProduct.click();
		return headerView.getText();		
	}	
	
	public void selectProduct() {
		
	}

}
