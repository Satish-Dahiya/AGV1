Feature: add services  feature

@crop
Scenario: verify  edit farm
Given I am login page
When I enter email address
And I enter password
And click on login button
Then I should see select account modal
When I select buyer admin radio button
And I click on select account
Then I should see home page
When I expand sandy setup link
 And I click on "Activate each service" link
 Then I should see activity service page
  When I click on manage data for carbon service
 Then I should see carbon setup Page
 When I click on manage data from carbon setup page
 Then I should see cropping page
 When I select farm name as "##Test_Far" from dropdown
 And I select field name as "F-1" from dropdown