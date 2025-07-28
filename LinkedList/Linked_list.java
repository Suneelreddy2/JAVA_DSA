package LinkedList;

import java.util.*;
class Linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public Linkedlist.Node head;
        public void addfirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
      
        public void addlast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        public void insert(int data,int pos){
            Node temp=head;
            Node newnode=new Node(data);
            int cur_pos=1;
            if(pos<1){
                System.out.println("invalid");
            }
            if(pos==1){
                newnode.next=head;
                head=newnode;
            }
            while(temp!=null && cur_pos<pos-1){
                temp=temp.next;
                cur_pos++;
            }
            newnode.next=temp.next;
            temp.next=newnode;

        }
        public void printlist(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void deletefirst(){
            if(head==null){
                System.out.println("linkedlist is empty");
                return;
            }
            head=head.next;
        }
        public void deletelast(){
            if(head==null){
                System.out.println("not valid");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        public void deletepos(int pos){
            int cur_pos=1;
            Node temp=head;
            if(pos<1){
                System.out.println("invalid");
            }
            if(pos==1){
                head=null;
                return;
            }
            while(temp!=null && cur_pos<pos-1){
                temp=temp.next;
                cur_pos++;
            }
            temp.next=temp.next.next;
        }
    
    public static void main(String[] args) {
        Linkedlist obj=new Linkedlist();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. addfirst-> 2. addlast-> 3. insert at specific 4. printlist 5. deletefirst 6. deleteend 7.delete at specific position 8.exit");

            System.out.print("Enter choice: ");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("enter the data to be add: ");
                int val=sc.nextInt();
                obj.addfirst(val);
            }
            else if(n==2){
                System.out.println("enter the data to be add: ");
                int val=sc.nextInt();
                obj.addlast(val);
            }
            else if(n==3){
                System.out.println("enter data,position: ");
                int dat=sc.nextInt();
                int pos=sc.nextInt();
                obj.insert(dat, pos);
            }
            else if(n==4){
                obj.printlist();
            }
            else if(n==5){
                obj.deletefirst();
            }
            else if(n==6){
                obj.deletelast();
            }
            else if(n==7){
                System.out.println("enter position to be deleted");
                int pos=sc.nextInt();
                obj.deletepos(pos);
            }
            else if(n==8){
                break;

            }
        }
   }
}

