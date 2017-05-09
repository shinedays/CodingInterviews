package KthNodeFromEnd_15;

import List.MyLinkList;
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
        MyLinkList list = new MyLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(findKthToEnd(list.head,1).data);

    }
}
