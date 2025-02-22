Note: I tried to focus on their knowledge of setting up an Interface and implementing it with both a class and a record. I didn't add any method logic for them to get stuck on, but that might make it too easy to cheat... Tried to include some polymorphism in the Tester. I thought including Comparable might be too much for a quiz problem, 
but it'd be easy to add (order based on number of plants?). This is my first time trying to write a problem.

## Problem description:

Model the relationship between an interface Garden and the class FruitPatch and record VegPatch.

The Garden interface should have two abstract methods: 1. number of plants and 2. water.

The water method should return a String stating the number of fruits/veg that were watered.

FruitPatch and VegPatch should both implement the interface. They should both accept the parameters number of plants and fruit/veg name. FruitPatch should store an additional field, ripeness, that is initialized to false in the constructor then set to true in the water method.

The toString for FruitPatch should print the number of fruit in the garden and whether they are ripe. The toString for VegPatch should print the number of veg in the garden.

Write a Tester class where you will instantiate one FruitPatch object and two VegPatch objects.

Store all of these objects in a single ArrayList, then loop through the list to print the results of water and toString for each object and count the total number of plants in all of your gardens.

### Sample output:
<br>>You successfully water the strawberries.
<br>>Your 20 strawberries are ripe!
<br>>You successfully water the carrots.
<br>>Your garden has 10 carrots.
<br>>You successfully water the broccoli.
<br>>Your garden has 5 broccoli.
<br>>Total plants in all of your gardens: 35
