package Collectionss;
import java.util.*;

public class FruitHashMap {
    public static void main(String[] args) {
        // Declare HashMap with Integer keys and String values
        HashMap<Integer, String> fruitPrices = new HashMap<>();

        // Add entries using put()
        fruitPrices.put(1, "Apple");
        fruitPrices.put(2, "Banana");
        fruitPrices.put(3, "Mango");
        fruitPrices.put(4, "Orange");

        // Print the map
        System.out.println("Fruit Map: " + fruitPrices);

        // Get a value by key
        System.out.println("Key 2 has: " + fruitPrices.get(2));

        // Check if a key or value exists
        System.out.println("Contains key 3? " + fruitPrices.containsKey(3));
        System.out.println("Contains value 'Banana'? " + fruitPrices.containsValue("Banana"));

        // Remove a key
        fruitPrices.remove(1);
        System.out.println("After removing key 1: " + fruitPrices);

        // Iterate using for-each and entrySet()
        System.out.println("Iterating map:");
        for (Map.Entry<Integer, String> entry : fruitPrices.entrySet()) {
            System.out.println("ID " + entry.getKey() + " -> " + entry.getValue());
        }

        // Check size
        System.out.println("Size: " + fruitPrices.size());

        //replace a value
        fruitPrices.replace(2, "Green Banana");
        System.out.println("After replacing value for key 2: " + fruitPrices);
        

        // Clear map
        fruitPrices.clear();
        System.out.println("After clear: " + fruitPrices);
    }
}
