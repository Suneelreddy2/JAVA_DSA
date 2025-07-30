class CircularLinkedList {
    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position < 1) return;
        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBegin(data);
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
            if (current == head) break;
        }
        if (current == null || current.next == head) {
            insertAtLast(data);
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void traverse() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + "->");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public void delete_first(){
        if(head==null){
            System.out.println("CLL is empty");
        }
        else{
            head=head.next;
            tail.next=head;
        }
    }
    public void delete_last(){
        if(head==null){
            System.out.println("CLL is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBegin(10);
        cll.insertAtBegin(20);
        cll.insertAtLast(30);
        cll.insertAtPosition(25, 2);
        cll.traverse();
        cll.delete_last();
        cll.traverse();
    
    }
}
