Feature: add field feature

  @addfarm
  Scenario: verify add farm
    Given I am login page
    When I enter email address
    And I enter password
    And click on login button
    Then I should see select account modal
    When I select buyer admin radio button
    And I click on select account
    Then I should see home page
    When I expand sandy setup link
    And I click on "Farm setup" link
    Then I should see "Farm setup" page
    When I click on Add farm
    Then I should see "Add Farm" page title
    When I enter farm name as "farm_automation"
  #  And I select farm address
  #  And I enter address as "test"
    And I select farm coordinate
    And I enter latitude as "12"
    And I enter longitude as "13"
    And I click on enterprise
    And I click on plus icon
    And I click on save button
    Then I should see "record inserted successfully" success message
    And I should redirect to "Farm setup" page
    When I select page till max limit


  @componentTest
  Scenario: verify  delete farm
    Given I am login page
    When I enter email address
    And I enter password
    And click on login button
    Then I should see select account modal
    When I select buyer admin radio button
    And I click on select account
    Then I should see home page
    When I expand sandy setup link
    And I click on "Farm setup" link
    Then I should see "Farm setup" page
    When I click on delete button for farm name as "A1 A2 Konefał"


  @EditFarm
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
    And I click on "Farm setup" link
    Then I should see "Farm setup" page
    When I click on edit button for farm name as "##Test_Onb"
    Then I should see edit farm "Edit Farm" page title
    When I update farm name as "##Test_Onb"
    And I click on save button from edit farm page
    Then I should see "Farm Updated Successfully." success message for edit farm
