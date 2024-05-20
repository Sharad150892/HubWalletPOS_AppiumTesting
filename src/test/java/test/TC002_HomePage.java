package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testUtils.POSBaseTest;

public class TC002_HomePage extends POSBaseTest{
	
	@BeforeClass
	public void login() {
		login.loginWithCorrectPin();
		login.submit();
	}
	
	
	
	@Test(priority=5)
	public void testNotificationBell() {
		homePage.clickNotificationBellAppointment();
		homePage.clickNotificationBellLowQuantity();
		homePage.eventPayment();
		homePage.customerCancelBtn();
	}
	
	@Test(priority=6)
	public void notificationBellTest() throws InterruptedException {
		homePage.clickNotificationBellAppointment();
		homePage.clickNotificationBellLowQuantity();
		Thread.sleep(6000);
		homePage.clickAttendanceClock("0160");		
	}
}
