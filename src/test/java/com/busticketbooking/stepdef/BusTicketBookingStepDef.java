package com.busticketbooking.stepdef;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.busticketbooking.factory.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BusTicketBookingStepDef {
	
private WebDriver driver;
	
	@Before
	public void setupScenarioEnv() {
		driver = DriverFactory.getDriver();
	}
	
	
	@Given("^User should open Bus Online Ticket Website$")
	public void user_should_open_Google_Home_Page() throws Exception{
		
	    driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
	    Thread.sleep(5000);
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    
	    String bookingPageHeader = "Search Bus Ticket Online";
	    WebElement expectedPageHeader = driver.findElement(By.xpath("//div//h2[@class='text-white text-center mt-0 mb-4 search_type']"));
	    String headerPage = expectedPageHeader.getText();
	    Assert.assertEquals(bookingPageHeader, headerPage);
	    
	}

	@When("^User entered Source and Destination of the journey$")
	public void User_entered_Source_and_Destination_of_the_journey() {
		
		driver.findElement(By.id("txtOriginGeneral")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//*[contains(text(),'Cameron Highlands')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Kuala Lumpur')]")).click();
		
	}
	
	@When("^User entered date of journey and clicked on search bus button$")
	public void User_entered_date_of_journey_and_clicked_on_search_bus_button() {
		WebElement nextBtn = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
		nextBtn.click();
		
		driver.findElement(By.xpath("//a[text()='20']")).click();
		
	   WebElement searchBtn = driver.findElement(By.id("btnBusSearchNewGeneral"));
	   searchBtn.click();
	   WebDriverWait wait = new WebDriverWait(driver,30);
	}
	
	@Then("^User checks for minimum price and clicks on select button$")
	public void User_checks_for_minimum_price_and_clicks_on_select_button() {


		ArrayList<String> fareAry = new ArrayList<String>();
		List<WebElement> prices =  
				driver.findElements(By.xpath("//div//b[@class='busprice1']"));
		 for (WebElement t : prices) {  
			 String fareText = t.getText();
			String ssr =  fareText.trim();
			 String fairrr = ssr.substring(3, 5);

		  fareAry.add(fairrr);
		System.out.println(fareAry);
		}
		 
		 ArrayList <Integer> fareIntAry = new ArrayList<Integer>();
         for (String farevalue : fareAry) {
             try {
                 fareIntAry.add(Integer.parseInt(farevalue));
             } catch (NumberFormatException e) {
                 System.out.println("Number not found");
                 e.printStackTrace();
             }
         }
         System.out.println("Integer Fare arraylist "+fareIntAry);
		 
         Collections.sort(fareIntAry);
         System.out.println("Sorted fares "+fareIntAry);
         System.out.println("Lowest fare is "+fareIntAry.get(0));
         int lFare = fareIntAry.get(0);
         String lowestFare = String.valueOf(lFare);
         System.out.println(lowestFare);
         
         ArrayList<String> fareAry2 = new ArrayList<String>();
 		List<WebElement> prices2 =  
 				driver.findElements(By.xpath("//div//b[@class='busprice1']"));
 		for (WebElement prices2sc : prices2) {
 			String fareText11 = prices2sc.getText();
 			fareAry2.add(fareText11);
 		}
 		for(String dsd : fareAry2) {
 			if(dsd.contains(lowestFare)){
 				WebElement submitBtn = driver.findElement(By.xpath("(//div//b[text()='"+dsd+"']/../../../..//td[@class='bustd2 td-last-child text-center']//a[text()='Select'])[1]"));
 				submitBtn.click();
 				break;
 			}
 		}
         
         

	}
	@Then("^User selects seats and clicks on proceed$")
	public void user_select_seats_and_click_on_proceed() {
		List<WebElement> seats =  
 				driver.findElements(By.xpath("//tbody//tbody//tbody//td//div[@class='seat_available']"));
		if(seats.size()>=6) {
			for(int i =0;i<6;i++) {
				seats.get(i).click();
			}
		}else {
			for(int i =0;i<seats.size();i++) {
				seats.get(i).click();
			}
		}
		driver.findElement(By.xpath("//td//input[@type='button']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,30);
	
	}
	
	@And("^User enters all the personal details$")
	public void user_enters_all_personal_details() {
		
		String actualUserDetails = "Passenger Details";
		String expectedUserDetails = driver.findElement(By.xpath("//b[text()='Passenger Details']")).getText();
		Assert.assertEquals(actualUserDetails, expectedUserDetails);
		
		WebElement name = driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']"));
		name.sendKeys("Amit Kumar");
		WebElement phone = driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']"));
		phone.sendKeys("7717788503");
		WebElement email = driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']"));
		email.sendKeys("amyalbert007@gmail.com");
		
		WebElement nextButton = driver.findElement(By.id("btnNext"));
		nextButton.click();
	}
	
	@Then("^Verify that user is on payment page$")
	public void verify_that_user_is_on_payment_page() {
		String str1 = "Payment Method";
		String str2 = driver.findElement(By.xpath("//div//b[text()='Payment Method']")).getText();
		System.out.println(str2);
		Assert.assertEquals(str1, str2);
		
	}
	
	@Then("^User cilcks on proceed to payment button and checks for alert popup$")
	public void user_clicks_on_proceed_to_payment_button_and_checks_for_alert_popup() {
		
		WebElement paymentButton = driver.findElement(By.id("payment_btnProceedPayment"));
		paymentButton.click();
		
		String popupText = "Please select a payment method";
		WebElement afterpaymentButtonmsg = driver.findElement(By.xpath("//div[@class='mt-4 text-semibold']"));
		String expectedText = afterpaymentButtonmsg.getText();
		Assert.assertEquals(expectedText, popupText);
		System.out.println("alert :"+expectedText);
		
		WebElement paymentOk = driver.findElement(By.id("btn-alert-okay"));
		paymentOk.click();
		
		
		
	}

	@After
	public void tearDownScenarioEnv() {
		driver.quit();
		driver=null;
	}


}
