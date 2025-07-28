package Collectionss;
import java.util.*;

public class MySetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // 1. add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate
        System.out.println("After add: " + fruits);

        // 2. size()
        System.out.println("Size: " + fruits.size());

        // 3. contains(element)
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Contains 'Grapes'? " + fruits.contains("Grapes"));

        // 4. remove(element)
        fruits.remove("Banana");
        System.out.println("After remove 'Banana': " + fruits);

        // 5. isEmpty()
        System.out.println("Is Empty? " + fruits.isEmpty());

        // 6. iterator
        System.out.print("Using iterator: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 7. for-each loop
        System.out.print("Using for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 8. toArray()
        String[] arr = fruits.toArray(new String[0]);
        System.out.println("Converted to Array: " + Arrays.toString(arr));

        // 9. clear()
        fruits.clear();
        System.out.println("After clear: " + fruits);

        // 10. isEmpty after clear
        System.out.println("Is Empty Now? " + fruits.isEmpty());

        // 11. addAll(Collection)
        Set<String> tropical = new HashSet<>();
        tropical.add("Papaya");
        tropical.add("Guava");
        tropical.add("Lychee");

        fruits.addAll(tropical);
        System.out.println("After addAll: " + fruits);
    }
}
