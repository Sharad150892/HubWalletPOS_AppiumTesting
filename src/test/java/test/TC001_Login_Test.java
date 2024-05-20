package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testUtils.POSBaseTest;

public class TC001_Login_Test extends POSBaseTest{
//	HomePage homePage;
//	MenuDropDownPage menuPage;
//	CheckoutPage checkoutPage;
	
	
//	@BeforeMethod
//	public void preSetup() {
//		Activity activity = new Activity("com.hubwallet", "com.hubwallet.ui.MainActivity");
//		driver.startActivity(activity);	
//	}
	
	@Test(priority=1)
	public void loginPageTestPositive() throws InterruptedException {
		System.out.println(login.getVersion()); 
		login.loginWithCorrectPin();
		login.maskUnmask();
		login.maskUnmask();
		login.submit();
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Login successful");
		System.out.println(homePage.businessName());
		Assert.assertEquals(homePage.businessName(), " Looks Salon");
		Thread.sleep(2000);	
		login.logout();
	}
	
	
	@Test(priority=2)
	public void loginPageTestNegative() throws InterruptedException {
		login.loginWithIncorrectPin();
		login.maskUnmask();
		login.maskUnmask();
		login.submit();
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Wrong Pin");
	}
	
	@Test(priority=3)
	public void forgotPinTestPositive() throws InterruptedException {
		login.forgotPin("testorisindia@gmail.com");
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Your pin successfully sent to your registered email");
	}
	
	@Test(priority=4)
	public void forgotPinTestNegative() throws InterruptedException {
		login.forgotPin("Testindia@gmail.com");
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Email does not exist");
	}
	

//	
//	@Test(priority=3)
//	public void menuDropDownTest() throws InterruptedException {
//		menuPage.clickOnMenu();
//		menuPage.dayView();
//		Thread.sleep(6000);
//		menuPage.clickOnMenu();
//		menuPage.weekView();
//		menuPage.clickOnMenu();
//		checkoutPage = menuPage.clickOnCheckout();
//		Thread.sleep(6000);
//	}
//	
//	@Test(priority=4)
//	public void checkoutPageTest1() throws InterruptedException {
//		checkoutPage.clickCustomer();
//		Thread.sleep(6000);
//		
//	}
//	
//	@Test(priority=5)
//	public void checkoutPageTest2() throws InterruptedException {
//		checkoutPage.selectCustomer();
//		
//	}
	
}
