package ReverseList_16;

import List.MyLinkList;
import List.Node;

/**
 * Created by bupt on 5/5/17.
 */
public class Solution {
    public static Node reverseList(Node head) {

        Node reversedHead = null;
        Node node = head;
        Node preNode = null;
        while (node != null) {
            Node next = node.next;
            if(next == null)
                reversedHead = node;
            node.next = preNode;
            preNode = node;
            node = next;
        }
        return reversedHead;
    }

    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.setHead(reverseList(list.head));
        list.print();
    }
}
