public class PolynomialLinkedList {

    // Node representing a term in the polynomial
    class Node {
        int coeff;
        int exp;
        Node next;

        Node(int coeff, int exp) {
            this.coeff = coeff;
            this.exp = exp;
            this.next = null;
        }
    }

    private Node head;

    // Insert a new term into the polynomial
    public void insertTerm(int coeff, int exp) {
        Node newNode = new Node(coeff, exp);

        if (head == null || head.exp < exp) {
            // Insert at beginning
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            Node prev = null;

            // Traverse to find correct position or matching exponent
            while (current != null && current.exp > exp) {
                prev = current;
                current = current.next;
            }

            if (current != null && current.exp == exp) {
                // Combine like terms
                current.coeff += coeff;
                if (current.coeff == 0) {
                    // If coefficient becomes 0, remove the term
                    if (prev == null) {
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                }
            } else {
                // Insert between prev and current
                newNode.next = current;
                if (prev != null) {
                    prev.next = newNode;
                }
            }
        }
    }

    // Display the polynomial
    public void display() {
        if (head == null) {
            System.out.println("0");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.exp);
            if (temp.next != null && temp.next.coeff > 0) {
                System.out.print(" + ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PolynomialLinkedList poly = new PolynomialLinkedList();

        poly.insertTerm(3, 4);   // 3x^4
        poly.insertTerm(5, 2);   // 5x^2
        poly.insertTerm(7, 0);   // 7
        poly.insertTerm(2, 2);   // Combine like terms: 5x^2 + 2x^2 = 7x^2
        poly.insertTerm(-3, 4);  // Combine like terms: 3x^4 - 3x^4 = 0 -> term removed

        System.out.print("Polynomial: ");
        poly.display();  // Expected output: 7x^2 + 7
    }
}
