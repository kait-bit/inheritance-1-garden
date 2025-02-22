## Problem description:

Write an interface named Garden. Declare a method named water of return type String.

Create a class FruitPatch and a record VegPatch that each implement the Garden interface.

FruitPatch class:
- Fields to store ripeness (Boolean) and fruit name (String).
- Ripeness should be initialized to false in the constructor.
- Override the water method to set ripeness to true and return a String confirming the fruit was watered.

VegPatch record:
- Store the veg name (String).
- Override the water method to return a String confirming the vegetables were watered.
- Implement a method called shooRabbit with return type String. If the vegetables in the patch are carrots return "The rabbit steals a carrot!". If they are not carrots, return "You successfully shoo away the rabbit.".

Tester class:
- Instantiate a FruitPatch object and call the water method.
- Instantiate a VegPatch object and call the water method, then the shooRabbit method.

Sample output:
<br>You water the strawberries.
<br>You water the carrots.
<br>The rabbit steals a carrot!