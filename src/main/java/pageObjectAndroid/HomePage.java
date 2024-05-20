package pageObjectAndroid;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidAction;

public class HomePage extends AndroidAction {

	AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.hubwallet:id/salonName")
	private WebElement salonName;
	
	@AndroidFindBy(id = "com.hubwallet:id/weekView")
	private WebElement weekViewClick;
	
	@AndroidFindBy(id="com.hubwallet:id/iv_notification")
	private WebElement notificationBell;
	
	@AndroidFindBy(id="com.hubwallet:id/appointmentsTextView")
	private WebElement notificationAppointment;
	
	@AndroidFindBy(id="com.hubwallet:id/close")
	private WebElement notificationClose;
	
	@AndroidFindBy(id="com.hubwallet:id/lowQuantityTextView")
	private WebElement notificationLowQuantity;
	
	@AndroidFindBy(id="com.hubwallet:id/quantity")
	private List<WebElement> notificationQuantity;
	
	@AndroidFindBy(id="com.hubwallet:id/eventPaymentLayout")
	private WebElement eventPayment;
	
	@AndroidFindBy(id="com.hubwallet:id/customerCancelCountLinear")
	private WebElement customerCancel;
	
	@AndroidFindBy(id="com.hubwallet:id/customerName")
	private List<WebElement> customerNameCancel;
	
	@AndroidFindBy(id="com.hubwallet:id/ivClock")
	private WebElement attendanceClock;
	
	@AndroidFindBy(id="com.hubwallet:id/etPinPassword")
	private WebElement attendanceEmployeePin;
	
	@AndroidFindBy(id="com.hubwallet:id/btnShiftStart")
	private WebElement shiftStart;
	
	@AndroidFindBy(id="com.hubwallet:id/btnShiftEnd")
	private WebElement shiftEnd;
	
	@AndroidFindBy(id="com.hubwallet:id/btnShortBreakStart")
	private WebElement shortBreakStart;
	
	@AndroidFindBy(id="com.hubwallet:id/btnShortBreakEnd")
	private WebElement shortBreakEnd;
	
	@AndroidFindBy(id="com.hubwallet:id/btnLongBreakStart")
	private WebElement longBreakStart;
	
	@AndroidFindBy(id="com.hubwallet:id/btnLongBreakEnd")
	private WebElement longBreakEnd;
	
	@AndroidFindBy(id="com.hubwallet:id/cancel")
	private WebElement close;
	

	public String businessName() {

		return salonName.getText();
	}
	
	public void clickNotificationBellAppointment() {
		notificationBell.click();
		notificationAppointment.click();
		notificationClose.click();
	}
	
	public void clickNotificationBellLowQuantity() {
		notificationBell.click();
		notificationLowQuantity.click();
		int count = notificationQuantity.size();
		for(int i=0; i<count; i++) {
			System.out.println(notificationQuantity.get(i).getText());
		}
		notificationClose.click();
	}
	
	public void eventPayment() {
		notificationBell.click();
		eventPayment.click();
		notificationClose.click();
	}
	
	public void customerCancelBtn() {
		notificationBell.click();
		customerCancel.click();
		int count = customerNameCancel.size();
		for(int i=0; i<count; i++) {
			System.out.println(customerNameCancel.get(i).getText());
		}
		notificationClose.click();
	}
	
	public void clickAttendanceClock(String pin) throws InterruptedException {
		attendanceClock.click();
		attendanceEmployeePin.sendKeys(pin);
		shiftStart.click();
		Thread.sleep(10000);
		attendanceEmployeePin.sendKeys(pin);
		shortBreakStart.click();
		Thread.sleep(10000);
		attendanceEmployeePin.sendKeys(pin);
		shortBreakEnd.click();
		Thread.sleep(10000);
		attendanceEmployeePin.sendKeys(pin);
		longBreakStart.click();
		Thread.sleep(10000);
		attendanceEmployeePin.sendKeys(pin);
		longBreakEnd.click();
		Thread.sleep(10000);
		attendanceEmployeePin.sendKeys(pin);
		shiftEnd.click();
		Thread.sleep(10000);
			
	}
	
	public MenuDropDownPage closeBtn() {
		close.click();
		return new MenuDropDownPage(driver);
	}
	

}
