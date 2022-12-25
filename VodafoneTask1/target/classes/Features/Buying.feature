 Feature:  Buying item.
  @Invalid
  Scenario: user cant buy item with empty personal info.
    Given user open the website
    When user select english language
    And go to section Shop By Brand and Select iphone
    And searching for iphones
    And select one of the iphones
    And press on add to cart
    And press on proceed to Checkout
    And Select delivery Options as Cairo Ain Shams
    And Select deliver to my address
    And add address details
    And pressing continue
    And leave personal info empty
    And pressing on continuee
    Then erorr message returned from full name filed