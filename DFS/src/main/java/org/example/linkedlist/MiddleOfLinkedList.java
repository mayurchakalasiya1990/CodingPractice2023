package org.example.linkedlist;

public class MiddleOfLinkedList {

    static Object middleOfList(LinkedList.Node node){
        Object result=null;
        if (node == null)
            return null;

        LinkedList.Node fast = node;
        LinkedList.Node slow = node;

        while (fast !=null  && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        result = slow.value;
        return result;
    }
    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        linkedList.insertAtEnd("Mayur");
        System.out.println("Head Node Value:"+linkedList.head.value);
        System.out.println("Middle Node: "+middleOfList(linkedList.head));
        linkedList.printLinkedList();
    }
}
