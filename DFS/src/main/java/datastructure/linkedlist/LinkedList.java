package datastructure.linkedlist;

public class LinkedList {

    static class Node {
        Node next;
        Object value;
        boolean visited;

        Node(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", value=" + value +
                    ", visited=" + visited +
                    '}';
        }
    }

    Node head;

    void insertAtBegin(Object val) {
        var newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(Object val) {
        var newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next=newNode;

    }

    void printLinkedList(){
        Node curr =head;
        while (curr!=null){
            System.out.println(curr.value);
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insertAtBegin(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.printLinkedList();
    }
}
