package KthNodeFromEnd_15;

import List.MyLinkedList;
import List.Node;

/**
 * Created by bupt on 5/5/17.
 */
public class Solution {
    public static Node findKthToEnd(Node head, int k){
        if(head == null || k <=0)
            return null;
        Node slow = head;
        Node quick = head;
        for(int i = 0;i<k - 1;i++){
            if(quick.next != null){
                quick = quick.next;
            } else
                return null;
        }
        while(quick.next != null){
            quick =quick.next;
            slow = slow.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        MyLinkedList.add(1);
        MyLinkedList.add(2);
        MyLinkedList.add(3);
        MyLinkedList.add(4);
        MyLinkedList.add(5);
        MyLinkedList.add(6);

        System.out.println(findKthToEnd(MyLinkedList.head,1).data);
    }
}
