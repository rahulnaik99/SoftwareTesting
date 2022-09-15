Feature: Search and Add Product to the Cart
Scenario: Search for the Product
#  When User Login using "testingmail0114@mail.com"
When User Search for "Shirt" and Select
Then User Choose the Size "M" , "blue" Color and Quantity "1";
Then Proceed to checkout and place order