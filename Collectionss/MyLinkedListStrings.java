package Collectionss;
import java.util.*;

public class MyLinkedListStrings {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // 1. add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add: " + fruits);

        // 2. addFirst(element)
        fruits.addFirst("Mango");
        System.out.println("After addFirst: " + fruits);

        // 3. addLast(element)
        fruits.addLast("Orange");
        System.out.println("After addLast: " + fruits);

        // 4. add(index, element)
        fruits.add(2, "Grapes");
        System.out.println("After add at index 2: " + fruits);

        // 5. get(index)
        System.out.println("Element at index 3: " + fruits.get(3));

        // 6. getFirst() & getLast()
        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());

        // 7. set(index, element)
        fruits.set(0, "Pineapple");
        System.out.println("After set at index 0: " + fruits);

        // 8. remove() – removes head
        fruits.remove();
        System.out.println("After remove(): " + fruits);

        // 9. remove(index)
        fruits.remove(2);
        System.out.println("After remove at index 2: " + fruits);

        // 10. removeFirst() & removeLast()
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("After removeFirst & removeLast: " + fruits);

        // 11. contains()
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // 12. size()
        System.out.println("Size: " + fruits.size());

        // 13. indexOf() & lastIndexOf()
        fruits.add("Banana");
        System.out.println("Index of Banana: " + fruits.indexOf("Banana"));
        System.out.println("Last Index of Banana: " + fruits.lastIndexOf("Banana"));

        // 14. toArray()
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(fruitArray));

        // 15. iterator
        System.out.print("Using Iterator: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 16. peek(), peekFirst(), peekLast()
        System.out.println("Peek (head): " + fruits.peek());
        System.out.println("Peek First: " + fruits.peekFirst());
        System.out.println("Peek Last: " + fruits.peekLast());

        // 17. poll(), pollFirst(), pollLast()
        System.out.println("Poll (head): " + fruits.poll());
        System.out.println("After poll(): " + fruits);

        System.out.println("Poll First: " + fruits.pollFirst());
        System.out.println("Poll Last: " + fruits.pollLast());
        System.out.println("After pollFirst & pollLast: " + fruits);

        // 18. clear()
        fruits.clear();
        System.out.println("After clear: " + fruits);

        // 19. isEmpty()
        System.out.println("Is Empty? " + fruits.isEmpty());
        System.out.println("Final List: " + fruits);
    }
}
