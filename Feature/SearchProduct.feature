Feature: Searching products

  Scenario Outline: searching products on google

  Given i am on the google homepage

  When i enter the "<product_name>" in the search bar

  And I click on the search button

  Then I can see the search result sucessfully

  Examples:

  |product_name|
  |Flower|

