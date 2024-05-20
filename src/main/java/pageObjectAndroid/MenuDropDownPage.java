package pageObjectAndroid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidAction;

public class MenuDropDownPage extends AndroidAction{
	
	AndroidDriver driver;

	public MenuDropDownPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.hubwallet:id/ivMenu2")
	private WebElement menuBtn;
	
	@AndroidFindBy(id = "com.hubwallet:id/calendar")
	private WebElement calender;
	
	@AndroidFindBy(id = "com.hubwallet:id/dayViewCalendar")
	private WebElement dayView;
	
	@AndroidFindBy(id = "com.hubwallet:id/weekCalendar")
	private WebElement weekView;
	
	@AndroidFindBy(id = "com.hubwallet:id/monthCalendar")
	private WebElement monthView;
	
	@AndroidFindBy(id = "com.hubwallet:id/dayCalendar")
	private WebElement employeeView;
	
	@AndroidFindBy(id = "com.hubwallet:id/eventCalendar")
	private WebElement eventView;
	
	@AndroidFindBy(id = "com.hubwallet:id/filterCalendar")
	private WebElement filter;
	
	@AndroidFindBy(id = "com.hubwallet:id/checkout")
	private WebElement checkOut;
	
	@AndroidFindBy(id = "com.hubwallet:id/customer")
	private WebElement customerList;
	
	@AndroidFindBy(id = "com.hubwallet:id/employee")
	private WebElement employeeList;
	
	@AndroidFindBy(id = "com.hubwallet:id/employeeListingEmplpoyee")
	private WebElement employeeListing;
	
	@AndroidFindBy(id = "com.hubwallet:id/scheduleEmployee")
	private WebElement employeeSchedule;
	
	@AndroidFindBy(id = "com.hubwallet:id/service")
	private WebElement serviceList;
	
	@AndroidFindBy(id = "com.hubwallet:id/categoryService")
	private WebElement serviceCategory;
	
	@AndroidFindBy(id = "com.hubwallet:id/serviceListing")
	private WebElement serviceListing;
	
	@AndroidFindBy(id = "com.hubwallet:id/product")
	private WebElement productList;
	
	@AndroidFindBy(id = "com.hubwallet:id/vendorListing")
	private WebElement vendorList;
	
	@AndroidFindBy(id = "com.hubwallet:id/brandProduct")
	private WebElement brandList;
	
	@AndroidFindBy(id = "com.hubwallet:id/productCategory")
	private WebElement productCategoryList;
	
	@AndroidFindBy(id = "com.hubwallet:id/productListing")
	private WebElement productListing;
	
	@AndroidFindBy(id = "com.hubwallet:id/poProduct")
	private WebElement purchaseOrderList;
	
	@AndroidFindBy(id = "com.hubwallet:id/recievePoProduct")
	private WebElement receiveOrder;
	
	@AndroidFindBy(id = "com.hubwallet:id/returnPOProduct")
	private WebElement returnOrder;
	
	@AndroidFindBy(id = "com.hubwallet:id/settings")
	private WebElement setting;
	
	@AndroidFindBy(id = "com.hubwallet:id/businessInfo")
	private WebElement businessInfoSetting;
	
	@AndroidFindBy(id = "com.hubwallet:id/appointmentSetting")
	private WebElement appointmentSetting;
	
	@AndroidFindBy(id = "com.hubwallet:id/settings")
	private WebElement employeeSetting;
	
	@AndroidFindBy(id = "com.hubwallet:id/settings")
	private WebElement miscellaneousSetting;
	
	@AndroidFindBy(id = "com.hubwallet:id/settings")
	private WebElement loyaltyProgramSetting;
		
	@AndroidFindBy(id = "com.hubwallet:id/reports")
	private WebElement reports;
	
	@AndroidFindBy(id = "com.hubwallet:id/support")
	private WebElement support;
	
	
	public void clickOnMenu() {
		menuBtn.click();
	}
	
	public void clickCalender() {
		calender.click();
	}
	
	public void dayView() {
		dayView.click();
	}
	
	public void weekView() {
		weekView.click();
	}
	
	public void monthView() {
		monthView.click();
	}
	
	public void employeeView() {
		employeeView.click();
	}
	
	public void eventView() {
		eventView.click();
	}
	
	public void filter() {
		filter.click();
	}
	
	public CheckoutPage clickOnCheckout() {
		checkOut.click();
		return new CheckoutPage(driver);
	}
	
}
