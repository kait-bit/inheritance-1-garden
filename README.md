## Problem description:

Write an interface named Garden. Declare two abstract methods:
- numPlants of return type int.
- water of return type String.

Create a class FruitPatch and a record VegPatch that each implement the Garden interface.

FruitPatch class:
- Accepts parameters numPlants and fruit name.
- Include a field to store ripeness (Boolean).
- Override the water method to set ripeness to true and return a String confirming the number of fruit that were watered.

VegPatch record:
- Accepts parameters numPlants and veg name.
- Override the water method to return a String confirming the number of vegetables that were watered.
- Implement a method called shooRabbit with return type String. If the vegetables in the patch are carrots return "The rabbit steals a carrot!". If they are not carrots, return "You successfully shoo away the rabbit.".

Tester class:
- Instantiate a FruitPatch object and call the water method.
- Instantiate a VegPatch object and call the water method, then the shooRabbit method.

Sample output:
<br>>You water 20 strawberries.
<br>>You water 10 carrots.
<br>>The rabbit steals a carrot!