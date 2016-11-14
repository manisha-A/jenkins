Feature: First feature
#  Scenario: Looking up the definition of 'pear'
#    Given the user is on the Wikionary home page
#    When the user is on the Wikionary home page

  Scenario: Amazon book purchase
    Given the user is on amazon website
    When user search for 'How google tests software'
    Then user should see search result
    When user adds first item to cart
    Then then book should be added to cart