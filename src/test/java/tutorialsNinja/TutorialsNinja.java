package tutorialsNinja;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LoggerLoad;

public class TutorialsNinja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Launch application
		driver.get("http://tutorialsninja.com/demo/index.php");
	
		driver.manage().window().maximize();
		// select currency
		WebElement currency = driver.findElement(By.xpath("//*[@id='form-currency']/div/button"));
		currency.click();
		
		WebElement euro = driver.findElement(By.xpath("//button[@name='EUR']"));
		euro.click();
		
		//Choose Camera Canon 
		WebElement canon = driver.findElement(By.xpath("//div[4]//div[1]//div[3]//button[1]"));
		canon.click();
		
		WebElement canonoption = driver.findElement(By.name("option[226]"));
		Select select_canon = new Select(canonoption);
		select_canon.selectByIndex(0);
	
		WebElement addcart = driver.findElement(By.id("button-cart"));
		addcart.click();
		
		WebElement error_selectoption = driver.findElement(By.xpath("//div[@class='text-danger']"));
		System.out.println("Error Message :"+error_selectoption.getText()); // capture error message
	
		LoggerLoad.error("Error Message :"+error_selectoption.getText()); //logging
		
		WebElement home_icon = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		home_icon.click();
		
		//Choose Iphone 
		WebElement iphone= driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[2]/h4/a"));
		iphone.click();
		
		WebElement iphone_Qty= driver.findElement(By.name("quantity"));
		iphone_Qty.clear();
		iphone_Qty.sendKeys("2");
		
		WebElement iphone_addcart = driver.findElement(By.xpath("//button[@id='button-cart']"));
		iphone_addcart.click();
		
		WebElement success_message = new WebDriverWait(driver, Duration.ofSeconds(20)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'alert')]")));
		System.out.println(success_message.getText()); // capture success message
				
		LoggerLoad.info(success_message.getText()); //logging
		
		WebElement viewcart_btn = driver.findElement(By.xpath("//button[contains(@class,'btn btn-inverse')]"));
		viewcart_btn.click();
		
		WebElement viewcart = driver.findElement(By.xpath("//strong[normalize-space()='View Cart']"));
		viewcart.click();
		
		WebElement iphone_Qty_extra1= driver.findElement(By.xpath("//input[contains(@name,'quantity')]"));
		iphone_Qty_extra1.clear();
		iphone_Qty_extra1.sendKeys("3");
		
		WebElement update_Qty= driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
		update_Qty.click();
		
		// print Eco tax and VAT amount
		
		WebElement Eco_tax= driver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]"));
		System.out.println("Eco taAX(-2.00): "+Eco_tax.getText());
		
		LoggerLoad.info("Eco taAX(-2.00): "+Eco_tax.getText()); //logging
		
		WebElement VAT= driver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[3]/td[2]"));
		System.out.println("VAT(20%): "+VAT.getText());
		
		LoggerLoad.info("VAT(20%): "+VAT.getText()); //logging
		
		WebElement checkout= driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
		checkout.click();
		
		WebElement error_message = driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
		
		System.out.println(error_message.getText()); 
		LoggerLoad.error(error_message.getText()); //logging
		
		WebElement viewcart_item = driver.findElement(By.xpath("//button[contains(@class,'btn btn-inverse')]"));
		viewcart_item.click();
	
		WebElement remove_btn = driver.findElement(By.xpath("//*[@id='cart']/ul/li[1]/table/tbody/tr/td[5]/button"));
		remove_btn.click();
		
		WebElement continue_btn = driver.findElement(By.xpath("//*[@id='content']/div/div/a"));
		continue_btn.click();
		//Laptop
		WebElement laptop_nav = driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[2]/a"));
		laptop_nav.click();
		
		WebElement laptop_nav_3 = driver.findElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
		laptop_nav_3.click();
		
		WebElement hp_laptop = driver.findElement(By.xpath("//img[@title='HP LP3065']"));
		hp_laptop.click();
		
		WebElement hp_laptop_Qty = driver.findElement(By.xpath("//input[@id='input-quantity']"));
		String qtyValue = hp_laptop_Qty.getAttribute("value");  // Get the value of the input field

		if (qtyValue.equals("1")) {  // Compare the value as a string
		    WebElement hp_laptop_cart = driver.findElement(By.xpath("//*[@id='button-cart']"));
		    hp_laptop_cart.click();
		    WebElement success_message_laptop = driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
		    System.out.println(success_message_laptop.getText());
		    LoggerLoad.info(success_message_laptop.getText()); //logging
		} else {
		    System.out.println("Not able to capture success message");
		    LoggerLoad.error("Not able to capture success message"); //logging
		}
		
		WebElement shoppingcart_link= driver.findElement(By.xpath("//*[@id='product-product']/div[1]/a[2]"));
		shoppingcart_link.click();
		
		//coupon
		WebElement coupon_dropdown= driver.findElement(By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a"));
		coupon_dropdown.click();
		
		WebElement coupon_code= driver.findElement(By.xpath("//*[@id='input-coupon']"));
		coupon_code.sendKeys("ABCD123");
		
		WebElement coupon_btn= driver.findElement(By.xpath("//*[@id='button-coupon']"));
		coupon_btn.click();
		
		WebElement msg_coupon= driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
		System.out.println(msg_coupon.getText());
		LoggerLoad.error(msg_coupon.getText()); //logging
		
		WebElement msg_coupon_close_btn= driver.findElement(By.xpath("//*[@id='checkout-cart']/div[1]/button"));
		msg_coupon_close_btn.click();
	
		
		coupon_code.clear();
		
		
		//Gift voucher
		

		WebElement gift_dropdown = driver.findElement(By.xpath("//*[@id='accordion']/div[3]/div[1]/h4/a"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gift_dropdown);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gift_dropdown);

		WebElement gift_certificate = new WebDriverWait(driver, Duration.ofSeconds(5))
		        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='input-voucher']")));
		gift_certificate.sendKeys("AXDFGH123");
		
		WebElement voucher_btn= driver.findElement(By.xpath("//*[@id='button-voucher']"));
		voucher_btn.click();
		
		WebElement msg_voucher= driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
		System.out.println(msg_voucher.getText());
		LoggerLoad.error(msg_voucher.getText()); //logging
		
		gift_certificate.clear();
		
		WebElement laptop_checkout= driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		//laptop_checkout.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", laptop_checkout);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", laptop_checkout);
		//*[@id="content"]/div[3]/div[2] 
		//a[@class='btn btn-primary']
		
		//Step1:Checkout Options Tab
		
		  //Radio button
		WebElement register_account = driver.findElement(By.xpath("//input[@value='register']"));
		boolean register_checked =register_account.isSelected();
		
		if(register_checked==false) {
			register_account.click();
		}
		
		WebElement reg_continue = driver.findElement(By.xpath("//input[@id='button-account']"));
		reg_continue.click();

		//Step2:Billing Details Tab
	
		//Personal Details
		WebElement firstname = driver.findElement(By.id("input-payment-firstname"));
		firstname.sendKeys("Astalakshmi");
		WebElement lastname = driver.findElement(By.id("input-payment-lastname"));
		lastname.sendKeys("Amulraj");
		WebElement email = driver.findElement(By.id("input-payment-email"));
		email.sendKeys("astalakshmi2122@gmail.com");
		WebElement telephone = driver.findElement(By.id("input-payment-telephone"));
		telephone.sendKeys("987456321");
		
		//Password
		
		WebElement pwd = driver.findElement(By.id("input-payment-password"));
		pwd.sendKeys("asta123");
		WebElement pwd_confirm = driver.findElement(By.id("input-payment-confirm"));
		pwd_confirm.sendKeys("asta123");
		
		//Address
		WebElement address = driver.findElement(By.id("input-payment-address-1"));
		address.sendKeys("fair oaks");
		WebElement city = driver.findElement(By.id("input-payment-city"));
		city.sendKeys("sunnyvale");
		WebElement postal = driver.findElement(By.id("input-payment-postcode"));
		postal.sendKeys("123654");
		WebElement country = driver.findElement(By.id("input-payment-country"));
		Select se_country = new Select(country);
		se_country.selectByVisibleText("United States");
		WebElement state = driver.findElement(By.id("input-payment-zone"));
		Select se_state = new Select(state);
		se_state.selectByVisibleText("California");
		
		//Checkbox for delivery and billing address
		WebElement delivery = driver.findElement(By.xpath("//input[@name='shipping_address']"));
		boolean delivery_checked =delivery.isSelected();
		
		if(delivery_checked==false) {
			delivery.click();
		}
		
		//privacy policy checkbox
		WebElement privacy_policy = driver.findElement(By.xpath("//input[@name='agree']"));
		privacy_policy.click();
		
		WebElement register_btn = driver.findElement(By.xpath("//input[@id='button-register']"));
		register_btn.click();
		
		//Step3:Delivery Details Tab
			
		WebElement shipping_address= driver.findElement(By.xpath("//*[@id='button-shipping-address']"));
		shipping_address.click();
		
		//Step4: Delivery Method
				
		WebElement comments = driver.findElement(By.xpath("//*[@id='collapse-shipping-method']/div/p[4]/textarea"));
		comments.sendKeys("Deliver between 9 AM and 6 PM. Please call upon arrival.");
		
		WebElement shipping_method= driver.findElement(By.xpath("//*[@id='button-shipping-method']"));
		shipping_method.click();
		
		//Step5: Payment Method
		
		   //terms and condition
		WebElement terms = driver.findElement(By.xpath("//input[@name='agree']"));
		boolean terms_pressed =terms.isSelected();
	
		if(terms_pressed ==false) {
			
			WebElement terms_btn = driver.findElement(By.xpath("//*[@id='button-payment-method']"));
			terms_btn.click();
			WebElement error_terms_msg= driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
			System.out.println(error_terms_msg.getText());
			LoggerLoad.error(error_terms_msg.getText()); //logging
			terms.click();
		}
		
		WebElement terms_btn = driver.findElement(By.xpath("//*[@id='button-payment-method']"));
		terms_btn.click();
		
		//Steps6: Confirm Order:
	
		WebElement confirm_order = driver.findElement(By.xpath("//*[@id='button-confirm']"));
		confirm_order.click();
		
		WebElement order_success_msg = driver.findElement(By.xpath("//*[@id='content']/p[1]"));
		System.out.println(order_success_msg.getText());
		LoggerLoad.info(order_success_msg.getText()); //logging
		
		WebElement content_cont_btn = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/a"));
		content_cont_btn.click();
		
		
		//Contact Us Form
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement ContactUs= driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a"));
		ContactUs.click();

		WebElement Enquiry = driver.findElement(By.xpath("//textarea[@id='input-enquiry']"));
		Enquiry.sendKeys("\"Dear Qafox,\r\n"
				+ "I am interested in purchasing Product Iphone 12 pro max  and would like to know if it is currently available. Could you please provide me with the pricing details and estimated delivery time?\r\n"
				+ "Additionally, if there are any ongoing promotions or discounts for bulk orders, I would appreciate it if you could share that information as well.\r\n"
				+ "I look forward to your prompt response. You can reach me via email or phone, as listed below.\r\n"
				+ "Thank you for your assistance.\"");
		
		WebElement contact_submit_btn= driver.findElement(By.xpath("//input[@value='Submit']"));
		contact_submit_btn.click();
		
		WebElement contactus_cont_btn = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/a"));
		contactus_cont_btn.click();
		
		driver.quit();
	}

}

