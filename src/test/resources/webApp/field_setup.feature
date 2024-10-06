Feature:add field feature

  @FiledSetUp
  Scenario: verify single field scenarios
    Given I am login page
    When I enter email address
    And I enter password
    And click on login button
    Then I should see select account modal
    When I select buyer admin radio button
    And I click on select account
    Then I should see home page
    When I expand sandy setup link
    And I click on "Enterprise data" link
    Then I should see sandy setup page
    When I click on manage data link
    Then i should see field setup page
    When I click on manage button based on "#Test_Far" farm name
    Then I should see field list page
    When i click on add field button
    Then I should see "Add" title
    When I enter field name as "fieldone"
    And I enter field size as "10"
    And I select management type as "Organic"
    And I select soil piet as "No"
    And land use as "Yes"
   And select primary land category one as "Arable"
    And I select from Date Range as "2024"
    And select primary land category two as "Woodland"
    And I select to Date Range as "2023"
    And I click on save button from add field page
    Then I should see "Your records have been successfully added." success message for add field
    And I should see field list page
    When I click on edit button for field "fieldone"
    When I update field name as "fieldUpdate"
    And I click on save button from edit field Page
    Then I should see "Your records have been successfully updated." success message on edit field page
    And I should see field list page
    When i click on delete button based on fieldName "fieldonefieldUpdate"
    And I click on yes delete from delete Modal
    Then i should get "Your records have been successfully deleted." successMessage


  @EditMultiple
  Scenario: verify single field scenarios
    Given I am login page
    When I enter email address
    And I enter password
    And click on login button
    Then I should see select account modal
    When I select buyer admin radio button
    And I click on select account
    Then I should see home page
    When I expand sandy setup link
    And I click on "Enterprise data" link
    Then I should see sandy setup page
    When I click on manage data link
    Then i should see field setup page
    When I click on manage button based on "#Test_Far" farm name
    Then I should see field list page
    When i click on edit Multiple
    And click on select all
    When i click on edit selected
    And I update field size as "20"
    And I update management type as "Organic"
    And I update soil peat as "No"
    And I update land use location as "No" from edit page
   # And I update primary category as "Arable"
   # And I update since as "2024"
    And I click on save button
    Then I should see field list page






