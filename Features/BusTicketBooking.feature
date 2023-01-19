Feature: Bus Ticket Booking feature
This feature will test bus ticket booking feature from a given source to destination.

  Scenario: User wants to book bus ticket from a given source to destinaation
  Given User should open Bus Online Ticket Website
  When User entered Source and Destination of the journey
  When User entered date of journey and clicked on search bus button
  Then User checks for minimum price and clicks on select button
  Then User selects seats and clicks on proceed
  And User enters all the personal details
  Then Verify that user is on payment page
  Then User cilcks on proceed to payment button and checks for alert popup