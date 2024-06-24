Feature: Login

  Scenario: Login With Valid crendtials
    Given user launch chrome browser
    When user open the url "https://admin-demo.nopcommerce.com/login"
    And user enters emails as "admin@yourstore.com" and password as "admin"
    And click on the Login button
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on the logut link
    Then page title should be "Your store. Login"
    And close the browser
    
    
    
  Scenario Outline: Login With Valid crendtials
    Given user launch chrome browser
    When user open the url "https://admin-demo.nopcommerce.com/login"
    And user enters emails as "<Email>" and password as "<Password>"
    And click on the Login button
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on the logut link
    Then page title should be "Your store. Login"
    And close the browser
    
    Examples:
   | Email | Password |
   |admin@yourstore.com  | admin |
   |admin@yourstore.com  | admin@123 |
