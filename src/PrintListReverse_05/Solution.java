package PrintListReverse_05;

import List.MyLinkedList;
import List.Node;

import java.util.Stack;

/**
 * Created by bupt on 5/2/17.
 */
public class Solution {
    public static void printListReverse(Node headNode){
        if(headNode == null)
            return;
        Stack<Node> s = new Stack<>();
        Node temp = headNode;
        while(temp != null){
            s.push(temp);
            temp = temp.next;
        }
        while(!s.isEmpty()){
            System.out.println(s.pop().data);
        }
    }

    public static void main(String[] args) {
        MyLinkedList.add(1);
        MyLinkedList.add(2);
        MyLinkedList.add(3);
        MyLinkedList.add(4);
        MyLinkedList.add(5);
        MyLinkedList.add(6);

        printListReverse(MyLinkedList.head);
    }

}
