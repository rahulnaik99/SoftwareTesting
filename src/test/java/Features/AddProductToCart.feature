Feature: Add Product to cart
Scenario: Validate the Add Product Feature
When Login into the Webpage
Then Search for "Shirt"
Then Select "Shirt" and the "color" and "size"
Then add the product to cart
Then Proceed to checkout and place order

