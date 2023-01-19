$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/BusTicketBooking.feature");
formatter.feature({
  "name": "Bus Ticket Booking feature",
  "description": "This feature will test bus ticket booking feature from a given source to destination.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to book bus ticket from a given source to destinaation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should open Bus Online Ticket Website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.user_should_open_Google_Home_Page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 19.332\n  (Session info: chrome\u003d109.0.5414.74)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-1HIRG0U\u0027, ip: \u0027192.168.10.141\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.74, chrome: {chromedriverVersion: 109.0.5414.74 (e7c5703604da..., userDataDir: C:\\Users\\AMITKU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58394}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 05fc2c3b7b26921bcefe06d8a4c0257a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.busticketbooking.stepdef.BusTicketBookingStepDef.user_should_open_Google_Home_Page(BusTicketBookingStepDef.java:34)\r\n\tat ✽.User should open Bus Online Ticket Website(file:///D:/SeleniumProjects/BusTicketBooking/Features/BusTicketBooking.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User entered Source and Destination of the journey",
  "keyword": "When "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.User_entered_Source_and_Destination_of_the_journey()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User entered date of journey and clicked on search bus button",
  "keyword": "When "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.User_entered_date_of_journey_and_clicked_on_search_bus_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User checks for minimum price and clicks on select button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.User_checks_for_minimum_price_and_clicks_on_select_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects seats and clicks on proceed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.user_select_seats_and_click_on_proceed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters all the personal details",
  "keyword": "And "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.user_enters_all_personal_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that user is on payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.verify_that_user_is_on_payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User cilcks on proceed to payment button and checks for alert popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.busticketbooking.stepdef.BusTicketBookingStepDef.user_clicks_on_proceed_to_payment_button_and_checks_for_alert_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});