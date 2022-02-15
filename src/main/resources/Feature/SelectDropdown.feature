Feature: DropDown functionality

  @smoke
  Scenario: DropDown handling
    Given User is on home page
    When User click on Older Newsletters dropdown
    Then User select doc2 from list
