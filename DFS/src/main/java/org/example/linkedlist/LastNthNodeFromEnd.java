package org.example.linkedlist;

import org.example.linkedlist.LinkedList.*;

public class LastNthNodeFromEnd {

    static Object findLastNthNodeFromEnd(int position, Node head) {

        Node first = head, second = head;
        Object result = null;
        for (int i = 0; i < position; i++) {
            if (second == null) {
                return null;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        result = second.value;
        return result;
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        System.out.println("head node Values:");
        System.out.println("Node from End of List: "+findLastNthNodeFromEnd(4,linkedList.head));
    }
}
