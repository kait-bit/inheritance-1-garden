Note: I tried to test their knowledge on setting up an Interface and implementing it with both a class and a record. 
Tried to include some polymorphism in the Tester. I thought making them include Comparable might be too much for a quiz problem, 
but it'd be easy to add (order based on number of plants?). This is my first time trying to write a problem.

## Problem description:

Model the relationship between an interface Garden and the class FruitPatch and record VegPatch.

The Garden interface should have two abstract methods: 1. number of plants and 2. water.

The water method should return a String stating the number of fruits/veg that were watered.

FruitPatch and VegPatch should both implement the interface. They should both accept the parameters number of plants and fruit/veg name. FruitPatch should store an additional field, ripeness, that is initialized to false in the constructor then set to true in the water method.

Write a Tester class where you will instantiate one FruitPatch object and two VegPatch objects. Print the results of the water method for each object.

Store all of these objects in a single ArrayList, then loop through the list to print the total number of plants in all of your gardens.

Sample output:
<br>>You water 20 strawberries.
<br>>You water 10 carrots.
<br>>You water 5 broccoli.
<br>>Total plants in all of your gardens: 35
