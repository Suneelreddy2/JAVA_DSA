package Collectionss;
import java.util.*;

public class Myarray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // 1. add(element)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(15);
        System.out.println("After add: " + numbers);

        // 2. add(index, element)
        numbers.add(1, 15);
        System.out.println("After add at index 1: " + numbers);

        // 3. get(index)
        System.out.println("Element at index 2: " + numbers.get(2));

        // 4. set(index, element)
        numbers.set(0, 5);
        System.out.println("After set at index 0: " + numbers);

        // 5. remove(index)
        numbers.remove(2);
        System.out.println("After remove at index 2: " + numbers);

        // 6. remove(Object)
        numbers.remove(Integer.valueOf(15));
        System.out.println("After remove object 15: " + numbers);

        // 7. size()
        System.out.println("Size: " + numbers.size());

        // 8. contains(element)
        System.out.println("Contains 20? " + numbers.contains(20));

        // 9. isEmpty()
        System.out.println("Is empty? " + numbers.isEmpty());

        // 10. indexOf(element)
        System.out.println("Index of 20: " + numbers.indexOf(20));

        // 11. lastIndexOf(element)
        numbers.add(20);
        System.out.println("Last index of 20: " + numbers.lastIndexOf(20));

        // 12. clear()
        numbers.clear();
        System.out.println("After clear: " + numbers);

        // 13. addAll(Collection)
        ArrayList<Integer> more = new ArrayList<>();
        more.add(1);
        more.add(2);
        more.add(3);
        numbers.addAll(more);
        System.out.println("After addAll: " + numbers);

        // 14. addAll(index, Collection)
        ArrayList<Integer> extras = new ArrayList<>();
        extras.add(100);
        extras.add(200);
        numbers.addAll(1, extras);
        System.out.println("After addAll at index 1: " + numbers);

        // 15. toArray()
        Object[] array = numbers.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 16. forEach (lambda or method reference)
        System.out.print("forEach print: ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 17. iterator
        System.out.print("Using iterator: ");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 18. sort
        Collections.sort(numbers);
        System.out.println("After sort: " + numbers);

        // 19. reverse
        Collections.reverse(numbers);
        System.out.println("After reverse: " + numbers);
    }
}
