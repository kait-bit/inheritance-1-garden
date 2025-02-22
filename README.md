Note: I tried to test their knowledge on setting up an Interface and implementing it with both a class and a record. 
Tried to include some polymorphism in the Tester. I thought making them include Comparable might be too much for a quiz problem, 
but it'd be easy to add (order based on number of plants?). This is my first time trying to write a problem, so I might have given 
away too much in the description.

## Problem description:

Write an interface named Garden with two abstract methods:
- numPlants of return type int.
- water of return type String.

Create a class FruitPatch and a record VegPatch that each implement the Garden interface.

FruitPatch class:
- Accepts parameters numPlants and fruit name.
- Include a field to store ripeness (Boolean).
- Override the water method to set ripeness to true and return a String stating the number of fruit that were watered.

VegPatch record:
- Accepts parameters numPlants and veg name.
- Override the water method to return a String stating the number of vegetables that were watered.

Tester class:
- Create an ArrayList that can hold both FruitPatch and VegPatch objects.
- Instantiate and add one FruitPatch object to the ArrayList.
- Instantiate and add two VegPatch objects to the ArrayList.
- Use the ArrayList and a loop to print the total number of plants in all gardens.

Sample output:
<br>>You water 20 strawberries.
<br>>You water 10 carrots.
<br>>You water 5 broccoli.
<br>>Total plants in all of your gardens: 35