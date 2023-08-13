package datastructure.linkedlist;

import java.util.Stack;

public class Palindrome {

    static boolean isPalindrome(LinkedList list){
        LinkedList.Node curr=list.head;
        Stack stack=new Stack();

        while (curr!=null){
            stack.push(curr.value);
            System.out.println();
            curr=curr.next;
        }

        curr=list.head;
        while(curr!=null){
            if(!curr.value.equals(stack.pop())){
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();

        linkedList.insertAtBegin("G");
        linkedList.insertAtEnd("A");
        linkedList.insertAtEnd("M");
        linkedList.insertAtEnd("A");
        linkedList.insertAtEnd("G");

        linkedList.printLinkedList();
        System.out.println("is linkedList palindrome?: "+isPalindrome(linkedList));
    }

}
