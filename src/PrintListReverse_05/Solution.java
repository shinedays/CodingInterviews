package PrintListReverse_05;

import List.MyLinkList;
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
        MyLinkList list = new MyLinkList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        printListReverse(list.head);
    }

}
