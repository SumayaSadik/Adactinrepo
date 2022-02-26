Feature: To Book a hotel using Adactin Hotel Booking application

Scenario: Login Functionlity 

Given user launches the application
When user enters username and password
Then user clicks the login button that navigates to search hotel page

Scenario: searching of Hotel

When User selects the location from the dropdown
And User selects the Hotel from the dropdown
And User selects the Room Type from the dropdown
And User selects the number of rooms from the dropdown
And User enters the checkin date 
And User enters the checkout date
And User selects the number for Adults per room
And User selects the number for Child per room
Then User clicks search which navigates to select hotel page

Scenario: Selection of Hotel

When user clicks the radio button
Then user clicks continue button which navigates to Book Hotel Page

Scenario: Booking of Hotel

Given book a hotel page is displayed
When user enters the first name in the first name text box
And User enters the last name in the last name text box
And User enters the Billing address 
And User enters the credit card number
And User selects the credit card type from the dropdown
And User selects the Expiry year and Expiry month from the dropdown
And User enters the cvv number
Then User clicks the Book now button which will process the hotel booking page and navigates to Booking confirmation page

Scenario: Booking Confirmation 

When User checks the details Booking details
Then User clicks on MyItinerary which navigates to Booked Itinerary page

Scenario: Logout

When Booked Itinerary page is displayed
Then User clicks logout button which will logout an application












 


