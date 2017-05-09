package MergeSortedLists_17;

import List.MyLinkList;
import List.Node;

import java.util.LinkedHashMap;

/**
 * Created by bupt on 5/5/17.
 */
public class Solution {
    public static Node mergeSortLists(Node head1,Node head2){
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;

        Node mergeHead = null;

        if(head1.data < head2.data){
            mergeHead = head1;
            mergeHead.next = mergeSortLists(head1.next,head2);
        } else {
            mergeHead = head2;
            mergeHead.next = mergeSortLists(head1,head2.next);
        }

        return mergeHead;
    }

    public static void main(String[] args) {
        MyLinkList list1 = new MyLinkList();
        MyLinkList list2 = new MyLinkList();

        list1.add(1);
        list1.add(4);
        list1.add(6);


        list2.add(2);
        list2.add(3);
        list2.add(5);

        Node node = mergeSortLists(list1.head,list2.head);
        Node temp = node;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
}
